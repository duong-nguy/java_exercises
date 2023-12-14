import csv

import tensorflow as tf
from tensorflow import keras
from datetime import datetime

def unet(input_shape, n_layers):
    inputs = keras.Input(input_shape)
    outputs = None
    encoder = []
    init_filters = 64

    # Encoder (left side)
    for _ in range(n_layers):
        if outputs != None:
            filters = outputs.shape[-1] * 2
            outputs = keras.layers.Conv2D(filters,3,activation='relu')(outputs)
            outputs = keras.layers.Conv2D(filters,3,activation='relu')(outputs)
            outputs = keras.layers.MaxPooling2D(2)(outputs)
            encoder.append(outputs)
        else:
            outputs = keras.layers.Conv2D(init_filters,3,activation='relu')(inputs)
            outputs = keras.layers.Conv2D(init_filters,3,activation='relu')(outputs)
            outputs = keras.layers.MaxPooling2D(2)(outputs)
            encoder.append(outputs)

    outputs = keras.layers.Conv2D(1024,3,activation='relu')(outputs)
    outputs = keras.layers.Conv2D(1024,3,activation='relu')(outputs)

    # Decoder (right side)
    for i in range(len(encoder)):
        skip = encoder[-(i + 1)]
        filters = skip.shape[-1]
        outputs = keras.layers.UpSampling2D(size=2)(outputs)
        outputs = keras.layers.Conv2DTranspose(outputs.shape[-1]//2,2,padding='same')(outputs)
        if outputs.shape != skip.shape:
            skip = keras.layers.Resizing(*outputs.shape[1:3])(skip)
        outputs = keras.layers.Concatenate()([skip,outputs])
        outputs = keras.layers.Conv2D(filters,3,activation='relu')(outputs)
        outputs = keras.layers.Conv2D(filters,3,activation='relu')(outputs)

    outputs = keras.layers.Conv2D(1,1,activation='sigmoid')(outputs)

    model = keras.Model(inputs,outputs)
    model.compile(loss='binary_crossentropy',
                      optimizer='sgd')
    return model

def bench_mark(input_shape):
    model = unet(input_shape,4)
    inference_times = []
    inference_memories = []
    train_times = []
    train_memories = []
    n = 5
    input_data = tf.random.normal((1,) + input_shape)
    labels = tf.random.uniform((1,) + model.output_shape[1:])

    for _ in range(n):
        start_time = datetime.now()
        _ = model.predict(input_data,verbose=0)
        inference_times.append((datetime.now() - start_time).total_seconds())
        inference_memories.append(tf.config.experimental.get_memory_info('GPU:0')['peak'])
        tf.config.experimental.reset_memory_stats('GPU:0')

        start_time = datetime.now()
        model.train_on_batch(input_data, labels)
        train_times.append((datetime.now() - start_time).total_seconds())
        train_memories.append(tf.config.experimental.get_memory_info('GPU:0')['peak'])
        tf.config.experimental.reset_memory_stats('GPU:0')

    avg_inference_time = sum(inference_times[1:]) / len(inference_times[1:])
    avg_train_time = sum(train_times[1:]) / len(train_times[1:])
    
    avg_inference_memories = sum(inference_memories[1:]) / len(inference_memories[1:])
    avg_train_memories = sum(train_memories[1:]) / len(train_memories[1:])
    avg_inference_memories /= 1024**3
    avg_train_memories /= 1024**3
    return avg_inference_time, avg_train_time, avg_inference_memories, avg_train_memories 


if __name__=='__main__':
    results = {}
    for w in range(256,1665,64):
        keras.backend.clear_session()
        input_shape = (w,w,3)
        avg_inference_time, avg_train_time, avg_inference_memories, avg_train_memories = bench_mark(input_shape)
        results[w] = [avg_inference_time, avg_train_time, avg_inference_memories, avg_train_memories]
        print(w,[avg_inference_time, avg_train_time, avg_inference_memories, avg_train_memories])

    csv_file = 'benchmark_data.csv'
    with open(csv_file, 'w', newline='') as file:
        writer = csv.writer(file)

        writer.writerow(['Image Size', 'Inference Time (s)',
                         'Train Time (s)', 'Inference Memories (GB)',
                         'Train Memories (GB)'])

        for image_size, benchmark_data in results.items():
            writer.writerow([image_size, *(data for data in benchmark_data)])

    print(f'Time data has been written to {csv_file}')

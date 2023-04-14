import java.util.Arrays;

public class App {
    public static void task1A() {
        // int[] arr = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        int[] arr = { 5, 4, 3, 2, 1, 6, 8, 7, 9, 10 };
        int temp;
        int count = 0;
        boolean sorted = false;
        System.out.println(Arrays.toString(arr));
        for (int j = 0; j < arr.length - 1 & !sorted; j++) {
            count++;
            for (int i = 0; i < arr.length - j - 1; i++) {
                count++;
                if (arr[i] > arr[i + 1]) {
                    count++;
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    sorted = false;
                } else
                    sorted = true;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Number of actions: " + count);
    }

    public static void baseline() {
        // int[] arr = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        int[] arr = { 5, 4, 3, 2, 1, 6, 8, 7, 9, 10 };
        int temp;
        int count = 0;
        for (int j = 0; j < arr.length - 1; j++) {
            count++;
            for (int i = 0; i < arr.length - j - 1; i++) {
                count++;
                if (arr[i] > arr[i + 1]) {
                    count++;
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        System.out.println("Baseline: " + count);
    }

    public static void task2a() {
        int[] arr = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        int idx_min = 0;
        int temp;
        int count = 0;
        System.out.println(Arrays.toString(arr));
        for (int j = 0; j < arr.length - 1; j++) {
            count ++;
            for (int i = 0; i < arr.length - 1; i++) {
                count ++;
                if (arr[i] > arr[i + 1])
                    count ++;
                    idx_min = i;
            }
            temp = arr[j];
            arr[j] = arr[idx_min];
            arr[idx_min] = temp;
        }
        System.out.println("Number of actions: " + count);
        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) throws Exception {
        // baseline();
        // task1A();
        task2a();
    }
}

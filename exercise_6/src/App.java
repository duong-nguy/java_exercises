public class App {
    public static void main(String[] args) throws Exception {
        int[] arr = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        int temp;
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}

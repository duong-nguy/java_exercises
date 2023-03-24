import java.util.Random;
import java.util.Scanner;

public class App {
    public static void task1() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        for (int i : arr) {
            System.out.println(i);
        }

    }

    public static int[] makeRandArr() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (1 + Math.random() * 99);
        }
        return arr;
    }

    private static void findMinMax(int[] arr) {
        int min = 100;
        int max = 0;
        for (int i : arr) {
            min = i < min ? i : min;
            max = i > max ? i : min;
        }
        System.out.println("Max is: " + max + " Min is: " + min);

    }

    public static void task3() {
        int[][] arr2d = new int[10][10];
        int sumDiagonal = 0;
        for (int i = 0; i < arr2d.length; i++) {
            arr2d[i][i] = i;
            sumDiagonal += i;
        }
        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d.length; j++) {
                System.out.print(arr2d[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println(sumDiagonal);
    }

    public static void concatString() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text:");
        String userInput1 = scanner.nextLine();
        System.out.print("Enter text:");
        String userInput2 = scanner.nextLine();
        scanner.close();
        
        String userInput12 = userInput1 + userInput2;
        String userInput21 = userInput2 + userInput1;
        
        boolean input12Alt = true;
        boolean input21Alt = true;
        
        for (int i = 0; i < userInput12.length() - 2; i++) {
           input12Alt = userInput12.charAt(i) == userInput12.charAt(i+2)?true:false;
           input21Alt = userInput21.charAt(i) == userInput21.charAt(i+2)?true:false;

           if(!input12Alt & !input21Alt) break;
        }

        System.out.println(userInput12 + " is alternating: " + input12Alt);
        System.out.println(userInput21 + " is alternating: " + input21Alt);
    }
    public static void palindromeChecker() {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        userInput = userInput.toLowerCase();
        int inputLen = userInput.length();
        scanner.close();
        for (int i = 0; i < inputLen ;i++) {
            if(userInput.charAt(i) != userInput.charAt(inputLen - i -1)){
                System.out.println(userInput + " is not a Palindrome");
                return;
            }
        } 
        System.out.println(userInput + " is a Palindrome");
    }

    public static void main(String[] args) throws Exception {
        // task1();
        // findMinMax(makeRandArr());
        // task3();
        // concatString();
        // palindromeChecker();

    }
}












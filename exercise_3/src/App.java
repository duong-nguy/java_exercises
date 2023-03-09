import java.util.Scanner;

public class App {

    public static void simpleCalculator() {
        // Task 1: simple calculator, using from
        // input-ouput operations
        float input1 = 0, input2 = 0;
        float sum, difference, product, quotion;
        boolean isValidInput = false;
        final Scanner scanner = new Scanner(System.in);
        while (!isValidInput) {
            try {

                System.out.print("Enter first number: ");
                input1 = Float.parseFloat(
                        scanner.nextLine());
                System.out.print("Enter second number: ");

                input2 = Float.parseFloat(
                        scanner.nextLine());
                isValidInput = true;

            } catch (NumberFormatException e) {
                System.out.println("Invalid unput. Please try again.");
            }

        }
        scanner.close();
        sum = input1 + input2;
        difference = Math.abs(input1 - input2);
        product = input1 * input2;
        if (input2 != 0) {
            quotion = input1 / input2;
            System.out.printf(
                    " sum: %.2f\n difference: %.2f\n product: %.2f\n quotion: %.2f \n",
                    sum,
                    difference,
                    product,
                    quotion);
            return;
        }
        System.out.printf(
                " sum: %.2f\n difference: %.2f\n product: %.2f\n quotion: NaN \n",
                sum,
                difference,
                product);

    }

    private static void bmiCalculator() {
        // Task 2 - Calculation of the BMI
        // if else if ladder
        float weight = 0, height = 0;
        boolean isValidInput = false;
        double bmi;
        final Scanner scanner = new Scanner(System.in);
        while (!isValidInput) {
            try {

                System.out.print("Enter weight: ");
                weight = Float.parseFloat(
                        scanner.nextLine());
                System.out.print("Enter height: ");

                height = Float.parseFloat(
                        scanner.nextLine());
                if (weight >= 0 & height >= 0)
                    isValidInput = true;
                else
                    System.out.println("Invalid unput. Please try again.");

            } catch (NumberFormatException e) {
                System.out.println("Invalid unput. Please try again.");
            }

        }
        scanner.close();

        bmi = weight / (Math.pow(weight, 2));

        if (bmi < 16.00)
            System.out.println(
                    bmi + " - stavation");
        else if (bmi < 16.99)
            System.out.println(
                    bmi + " - emaciation");
        else if (bmi < 18.49)
            System.out.println(
                    bmi + " - underweight");
        else if (bmi < 22.99)
            System.out.println(
                    bmi + " - normal, low range");
        else if (bmi < 24.99)
            System.out.println(
                    bmi + " - normal, high range");
        else if (bmi < 27.99)
            System.out.println(
                    bmi + " - overweight, low range");
        else if (bmi < 29.99)
            System.out.println(
                    bmi + " - overweight, high range");
        else if (bmi < 34.9)
            System.out.println(
                    bmi + " - 1st degree obesity");
        else if (bmi < 39.99)
            System.out.println(
                    bmi + " - 2nd degree obesity");
        else
            System.err.println(
                    bmi + "3rd degree obesity");

    }

    public static void quadraticEquationCalculator() {
        // Task 3 - Solve quadratic equation with switch
        double a = 0, b = 0, c = 0;
        boolean isValidInput = false;
        final Scanner scanner = new Scanner(System.in);
        while (!isValidInput) {
            try {

                System.out.print("Enter a: ");
                a = Float.parseFloat(
                        scanner.nextLine());

                System.out.print("Enter b: ");
                b = Float.parseFloat(
                        scanner.nextLine());

                System.out.print("Enter c: ");
                c = Float.parseFloat(
                        scanner.nextLine());
                if (a != 0) {
                    isValidInput = true;
                } else
                    System.out.println("Invalid unput. Please try again.");

            } catch (NumberFormatException e) {
                System.out.println("Invalid unput. Please try again.");
            }

        }
        scanner.close();

        Double delta = Math.pow(b, 2) - 4 * a * c;
        int key = Double.compare(delta, 0.0);
        switch (key) {
            case 1:
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("x1 = " + x1 + ", x2 = " + x2);
                break;
            case 0:
                double x = -b / (2 * a);
                System.out.println("x = " + x);
                break;
            default:
                System.out.println("The equation has no real roots");
                break;
        }

    }

    public static void sumOfEvenNumber() {
        // Task 4 - Sum of even number in range(1,100)
        int sum = 0;
        for (int i = 1; i <= 100; i += 2) {
            if (i == 1)
                continue;
            sum += i;
        }
        System.out.println("Sum of even number from (1,100): " + sum);
    }

    static int generator(int min, int max, String mode) {
        int res = (int) (min + Math.random() * (max - min));
        switch (mode) {
            case "even":
                res = res % 2 == 0 ? res : generator(min, max, mode);
                break;
            case "odd":
                res = res % 2 == 1 ? res : generator(min, max, mode);
                break;
        }
        return (int) res;
    }

    public static void minMaxNumber() {
        // Task 5 - Finding the biggest and the
        // smallest numebrs from the set of number
        // drawn by a loop while
        int min = 1, max = 100, i = 0;
        int minNumber = 1000, maxNumber = -1000;
        while (i < 10) {
            // assuming drawn from [1,100);
            int num = generator(min, max, "none");
            System.out.println(num);
            minNumber = num < minNumber ? num : minNumber;
            maxNumber = num > maxNumber ? num : maxNumber;
            i++;
        }
        System.out.println("Min = " + minNumber + "\nMax = " + maxNumber);
    }

    public static void main(String[] args) throws Exception {
        bmiCalculator();
        quadraticEquationCalculator();
        sumOfEvenNumber();
        minMaxNumber();
    }

}

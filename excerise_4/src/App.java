import java.math.BigDecimal;
import java.util.Scanner;

public class App {
    static Scanner scan = new Scanner(System.in);
    public static void task1() {
        RectangleArea rect = new RectangleArea();
        rect.getData();
        rect.computeField();
        rect.fieldDisplay();
    }

    public static void task2() {
        Car car1 = new Car(
                "name", "brand",
                "red", 10,
                2018, new BigDecimal(10));
        System.out.println(car1.toString());

        car1.sell(2);

        System.out.println(car1.getModel());
        System.out.println(car1.getBrand());
        System.out.println(car1.getColor());
        System.out.println(car1.getQuantiy());
        System.out.println(car1.getYear());
        System.out.println(car1.getPrice().toString());

        car1.setBrand("yeahh");
        car1.setModel("yeahh");
        System.out.println(car1.toString());
    }

    public static int DecimalConverter(String number, String base) {
        int decimal;
        switch (base) {
            case "2":
                decimal = Integer.parseInt(number, 2);
                break;
            case "16":
                decimal = Integer.parseInt(number, 16);
                break;
            default:
                decimal = Integer.parseInt(number, 10);
                break;
        }
        return decimal;

    }

    public static String DecimalConverter(int number, String base) {
        String res;
        switch (base) {
            case "2":
                res = Integer.toBinaryString(number);
                break;
            case "16":
                res = Integer.toHexString(number);
                break;
            default:
                res = Integer.toString(number);
                break;
        }
        return res;

    }


    public static void operation(String op) {

        System.out.println("Enter 1st number");
        String number1 = scan.nextLine();
        System.out.println("Enter base system");
        String base1 = scan.nextLine();
        System.out.println("Enter 2nd number");
        String number2 = scan.nextLine();
        System.out.println("Enter base system");
        String base2 = scan.nextLine();
        int number1i = DecimalConverter(number1, base1);
        int number2i = DecimalConverter(number2, base2);
        int res;
        System.out.print("Answer in base: ");
        switch (op) {
            case "+":
                res = number1i + number2i;
                break;

            case "-":

                res = number1i - number2i;
                break;
            case "*":

                res = number1i * number2i;
                break;
            case "/":

                res = number1i / number2i;
                break;
            default:
                res = 0;
                break;
        }
        String outputs = DecimalConverter(res, scan.nextLine());
        System.out.println("Your result: " + outputs);
    }

    public static void numberSysConverter() {
        String input;
        System.out.println(
                "---------------------------------------------------------\n" +
                        "Choose what operation you want to perfrom \n \n" +
                        "A. Convert from any system to the decimal system\n" +
                        "B. Convert from Decimal system to the any system\n" +
                        "C. Summing number from different system\n" +
                        "D. Substracting number from different system\n" +
                        "E. Multiplying number from different system\n" +
                        "F. Dividing number from different system\n \n" +
                        "W. Exit\n");
        loop0:
        do {
            input = scan.nextLine().toUpperCase();
            switch (input) {
                case "A":
                    System.out.println("Enter number");
                    String numberA = scan.nextLine();
                    System.out.println("Enter base system");
                    String baseA = scan.nextLine();
                    int decimal = DecimalConverter(numberA, baseA);
                    System.out.println("Decimal representation: " + decimal);
                    break;
                case "B":
                    System.out.print("Enter a number: ");
                    int numberB = Integer.parseInt(scan.nextLine());
                    String binaryNumber = Integer.toBinaryString(numberB);
                    String hexNumber = Integer.toHexString(numberB);
                    System.out.println(
                            "Number: " + numberB + "\n" +
                                    "Binary: " + binaryNumber + "\n" +
                                    "Hexa: " + hexNumber + "\n");
                    break;
                case "C":
                    operation("+");
                    break;
                case "D":
                    operation("-");
                    break;
                case "E":
                    operation("*");
                    break;
                case "F":
                    operation("/");
                    break;
                case "W":
                    break loop0;
                default:
                    break;
            }
        } while (true);
        scan.close();
    }

    public static void main(String[] args) throws Exception {
        //task1();
        // task2();
        numberSysConverter();
    }
}

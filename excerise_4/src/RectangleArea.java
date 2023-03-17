import java.util.Scanner;

public class RectangleArea {
    private int w = -1,h = -1;
    private int area; 
    public void getData() {
        boolean isValidInput = false;
               final Scanner scanner = new Scanner(System.in);
        while (!isValidInput) {
            try {

                System.out.print("Enter w: ");
                w = Integer.parseInt(
                        scanner.nextLine());
                System.out.print("Enter h: ");

                h = Integer.parseInt(
                        scanner.nextLine());
                if (w >= 0 & h >= 0)
                    isValidInput = true;
                else
                    System.out.println("Invalid unput. Please try again.");

            } catch (NumberFormatException e) {
                System.out.println("Invalid unput. Please try again.");
            }

        }
        scanner.close(); 
    }
    public void computeField(){
        if (w < 0 & h < 0)
           getData(); 
       area = w*h; 
    }
    public void fieldDisplay() {
        System.out.println("Area: " + area);
    }
}











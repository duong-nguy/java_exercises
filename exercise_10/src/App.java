import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class App {
    public static void task1() throws IOException {
        FileInputStream fis;
        int bajt;
        try {
            fis = new FileInputStream("test123.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");;
            return;
        }
        try {
            do {
                bajt = fis.read();
                if (bajt != -1) System.out.print((char) bajt);
            } while (bajt != -1);
        } catch (IOException e) {
            System.out.println("Error reading file");
        } finally {
            fis.close();
        }
    }
    public static void task2() {
        FileInputStream fis;
        int bajt;
        try {
            fis = new FileInputStream("test123.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");;
            return;
        }
        try (fis) {
            do {
                bajt = fis.read();
                if (bajt != -1) System.out.print((char) bajt);
            } while (bajt != -1);
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
    public static void task3() {
        
        FileInputStream fis;
        int bajt;
        try {
            fis = new FileInputStream("test123.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");;
            return;
        }
        try (fis) {
            do {
                bajt = fis.read();
                bajt = bajt == 32 ? 95 : bajt; // 32 = space, 95 dash
                if (bajt != -1) System.out.print((char)bajt);
            } while (bajt != -1);
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
    public static void task4(){
        DataManagement dm = new DataManagement("data.txt");
        System.out.print("Input: ");
        dm.writeDataToFile(dm.readData());
        System.out.print("Input: ");
        dm.writeDataToFile(dm.readData());// ERROR: java.util.NoSuchElementException: No line found
        dm.readDataFromeFile();           // call DataManagement.readData() second time cause this error
    }
    public static void main(String[] args) throws IOException {
        task4();
    }
}

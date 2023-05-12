import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.annotation.Target;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.Buffer;

public class App {
    public static void task1() throws IOException {
        FileInputStream fis;
        int bajt;
        try {
            fis = new FileInputStream("test123.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            return;
        }
        try {
            do {
                bajt = fis.read();
                if (bajt != -1)
                    System.out.print( bajt);
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
            System.out.println("File not found");
            ;
            return;
        }
        try (fis) {
            do {
                bajt = fis.read();
                if (bajt != -1)
                    System.out.print((char) bajt);
            } while (bajt != -1);
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }

    public static void task3() throws FileNotFoundException {
        int bajt;
        try (FileInputStream fis = new FileInputStream("test123.txt");
                FileOutputStream fos = new FileOutputStream("temp.txt")) {
            do {
                bajt = fis.read();
                bajt = bajt == 32 ? 95 : bajt; // 32 = space, 95 dash
                fos.write(bajt);
                if (bajt != -1)
                    System.out.print((char) bajt);
            } while (bajt != -1);
        } catch (IOException e) {
            System.out.println("Error reading file");
        } finally {
            // todo: rename the file
        }
    }

    public static void task4() {
        DataManagement dm = new DataManagement("data.txt");
        System.out.print("Input: ");
        dm.writeDataToFile(dm.readData1());
        System.out.print("Input: ");
        dm.writeDataToFile(dm.readData1());
        dm.readDataFromeFile();
    }
    private static void task5() throws IOException {
        System.out.print("Enter: "); 
        String toFind = System.console().readLine();
        URL url = new URL("https://ewib.nbp.pl/plewibnra?dokNazwa=plewibnra.txt");
        String line;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()))) {
            do {
                line = reader.readLine();
                if (line.startsWith(toFind)){
                    System.out.println(line.split("\t")[1]);
                    break;
                }
            } while (! line.isEmpty());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) throws IOException {

    }
}

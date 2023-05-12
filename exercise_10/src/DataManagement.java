import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DataManagement {
    private String dbName;
    public DataManagement(String dbName){
        this.dbName = dbName;
    }
    public void readDataFromeFile() {
        int bajt;
        try (FileInputStream fis = new FileInputStream(dbName)) {
            do {
                bajt = fis.read();
                if (bajt != -1) System.out.print((char) bajt);
            } while (bajt != -1);
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    } 
    public String readData() {
        String usrInput = "";
        try (Scanner scanner = new Scanner(System.in)) {
            usrInput = scanner.nextLine();
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }
        return usrInput;
    }
    public String readData1() {
        return System.console().readLine();
        
    }
    public void writeDataToFile(String data) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(dbName,true))) {
            writer.append(data + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}

package Laptop;

import java.io.FileWriter;
import java.io.IOException;

public class AddDataToExistingFileMain {
    public static void main(String[] args) throws IOException {

        FileWriter writeInFile = new FileWriter("C:\\Users\\pkom9\\Desktop\\FilePath\\NewFileTest.txt");

            try {
                writeInFile.write("This is a test two.");
                writeInFile.close();
                System.out.println("Successfully wrote in file");
            } catch (IOException exception) {
                System.out.println("Unsuccessful operation.");
                exception.printStackTrace();
            }


    }
}



package Laptop;

import java.io.File;
import java.io.IOException;

public class NewFileCreationMain {
    public static void main(String[] args) throws IOException {

        try {
        File newFile = new File("C:\\Users\\pkom9\\Desktop\\FilePath\\NewFileTest");
        if (newFile.createNewFile()) {
            System.out.println("The file has been created successfully: " + newFile.getName());
        } else {
            System.out.println("File already exists: " + newFile.getName());
        }
    } catch (IOException exception) {
            System.out.println("Error");
            exception.printStackTrace();
        }
    }
}

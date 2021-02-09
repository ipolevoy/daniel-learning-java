package file_io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ListDirectories {
    public static void main(String[] args) throws IOException {


        File file = new File("hw/assignment1.txt");

        System.out.println("File location: " + file.getAbsolutePath());
        System.out.println("This is a directory: " + file.isDirectory());

        System.out.println("Exists: " + file.exists());

        // ------------------------------//

        File file1 = new File("classes/out.txt");
        System.out.println("Created a new file: " + file1.createNewFile());


        FileOutputStream  fout = new FileOutputStream(file1);

        fout.write("Hello world!".getBytes());
        fout.close();

    }
}

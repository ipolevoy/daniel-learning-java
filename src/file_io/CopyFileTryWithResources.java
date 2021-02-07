package file_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileTryWithResources {

    public static void main(String args[]) throws IOException {

        try (FileInputStream in = new FileInputStream("src/file_io/file1.txt");
             FileOutputStream out = new FileOutputStream("out/output.txt")) {

            for (int c = in.read(); c != -1; c = in.read()) {
                out.write(c);
            }
        }
    }
}

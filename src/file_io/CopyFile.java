package file_io;

import java.io.*;

public class CopyFile {

    public static void main(String args[]) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("src/file_io/file1.txt");
            out = new FileOutputStream("out/output.txt");

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {

            if (out != null) {
                out.close();
            }
            if (in != null) {
                in.close();
            }

        }
    }
}

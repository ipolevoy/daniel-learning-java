//package file_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PrintFile2 {

    public static void main(String[] args) throws IOException {

        FileInputStream fin = new FileInputStream("/home/daniel/Projects/daniel-learning-java/src/file_io/file1.txt");

        int x = fin.read();
        System.out.print(x);

        x = fin.read();
        System.out.print(',');
        System.out.print(x);

        x = fin.read();
        System.out.print(',');
        System.out.print(x);

        x = fin.read();
        System.out.print(',');
        System.out.print(x);

    }
}

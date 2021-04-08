package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.IllegalFormatConversionException;

/**
 * How to catch and handle exceptions and how to  handle expensive resources.
 */
public class CatchAndKillExample {

    public static void main(String[] args) {
//        primitiveClose();

        multipleCatches();

    }


    /**
     * Use a Closeable resource, and then CLOSE IT!!!!!
     */
    public static void badClose() {
        try {
            FileInputStream fin = new FileInputStream("./src/exceptions/text.txt");
            System.out.println((char) fin.read());

            // if an exception happens here, doing something else, you will have a dangling unclosed, unreferenced resource

            fin.close(); // CLOSE IT!!!!!!!!!!!
        } catch (Exception e) {
            e.printStackTrace(); // handle properly!!!
        }
    }


    /**
     * Use a Closeable resource, and then CLOSE IT!!!!!
     *
     * The "finally" block will always be called, regardless.
     */
    public static void betterClose(){
        FileInputStream fin = null;

        try {
            fin = new FileInputStream("./src/exceptions/text.txt"); // open the resource
            System.out.println((char) fin.read()); // use the resource
        } catch (Exception e) {
            e.printStackTrace(); // handle exception in case there is a problem
        } finally {
            if (fin != null) {
                try {
                    fin.close(); // CLOSE IT!!!!!!!!!!!
                } catch (Exception ignore) {}
            }
        }
    }


    /**
     * try-with-resources - is the name.
     *
     * Use a Closeable resource, and then CLOSE IT!!!!!
     */
    public static void betterYetClose() {

        try(FileInputStream fin = new FileInputStream("./src/exceptions/text.txt")) { // open the resource
            System.out.println((char) fin.read()); // use the resource
        } catch (Exception e) {
            e.printStackTrace(); // handle exception in case there is a problem
        }
    }

    public static void multipleCatches() {
        try(FileInputStream fin = new FileInputStream("./src/exceptions/does.not.exist")) { // file does not exist
            System.out.println((char) fin.read()); // use the resource
        }catch (FileNotFoundException e){
            System.out.println("bad things happen to good people ");
        }catch (IOException e) {
            e.printStackTrace(); // handle exception in case there is a problem
        }
    }

    //Collapse multiple exceptions into the same catch block
    public static void multipleCatches2() {
        try(FileInputStream fin = new FileInputStream("./src/exceptions/does.not.exist")) { // file does not exist
            System.out.println((char) fin.read()); // use the resource
        }catch (IllegalFormatConversionException | IOException e){
            System.out.println("bad things happen to good people ");
        }
    }
}

package exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Foo {

    public  static void doSomething(int x){
        System.out.println(10/x);
    }

    /**
     * Swallow exception - baaaad
     */
    public  static String readFile(String fileName){
        String fileContent = "";
        try{
            FileInputStream fin = new FileInputStream(fileName);
            ///fileContent....
        }catch(Exception e){
            //do not ever do this!!!
        }
        return fileContent;
    }


    /**
     * Catch/throw exception - decent
     */
    public static String readFile1(String fileName){
        String fileContent = "";
        try{
            FileInputStream fin = new FileInputStream(fileName);
            ///fileContent....
        }catch(IOException e){
            throw new RuntimeException("Oh, man!!", e);// does not have to be checked by compiler
            //never omit the original exception, because it is the key to finding out the problem.

        }
        return fileContent;
    }
}

package stdio;

import java.io.IOException;

public class StdInput {

    public static void main(String[] args) throws IOException {

        System.out.print("Type your name here: ");
        int x = System.in.read();

        System.out.println("you typed: " + (char)x);
    }
}
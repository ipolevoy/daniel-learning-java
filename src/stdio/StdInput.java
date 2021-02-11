package stdio;

import java.io.IOException;

public class StdInput {

    public static void main(String[] args) throws IOException {

        System.out.println("Type your first name here: ");

        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();

        char x = (char) System.in.read();

        while (x != '\n') {
            sb1.append(x);
            x = (char) System.in.read();
        }
        System.out.println("Type your last name here: ");

        char y = (char) System.in.read();
        while (y != '\n') {
            sb2.append( y);
            y = (char) System.in.read();
        }
        System.out.println("Your name is: "  + sb1 + " " + sb2);
    }
}

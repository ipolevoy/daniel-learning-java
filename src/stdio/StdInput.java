package stdio;

import java.io.IOException;

public class StdInput {

    public static void main(String[] args) throws IOException {

        System.out.println("Type your first name here: ");
<<<<<<< HEAD
	
	StringBuffer sb = new StringBuffer();
	StringBuffer bs = new StringBuffer();
	
	int x = System.in.read();
	
	while (x != 33) {
		//System.out.print((char) x);
		sb.append((char) x);
		x = System.in.read();
		}
	System.out.println("Type your last name here: ");
	
	int y = System.in.read();
	 while (y != 33) {
                //System.out.print((char) y);
                bs.append((char) y);
                y = System.in.read();
                }
	System.out.println(sb.toString().trim() + " " + bs.toString().trim());

		System.out.println(sb);
		System.out.println(sb.toString().toUpperCase());

		System.out.print((char) i);
	}
=======

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
>>>>>>> 816cb965f6b3862a3aa3344341681181268996f7
}


//package stdio;

import java.io.IOException;

public class StdInput {

    public static void main(String[] args) throws IOException {
	
        System.out.println("Type your first name here: ");
	
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
//		System.out.println(sb.replace(3,7, "wdad"));
		System.out.println(sb.insert(4, "jay"));
	//x = System.in.read();
       // System.out.println("you typed " + (char) x);

/*	for(int i = 0; (char) System.in.read() != 'A'; i++){

		System.out.print((char) i);
	}
*/		
//		System.out.print(sb);
	}
}

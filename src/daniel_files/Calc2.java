package daniel_files;

public class Calc2 {
	public static void main (String args[]) {

	int x = 2;
	int y = 3;

	int add = x+y;

	System.out.println(add);
	
	int subtract = x-y;

	System.out.println(subtract);

	int multiply = x*y;

	System.out.println(multiply);

	int divide = x/y;

	System.out.println(divide);

	/* Calc1 s=new Calc1(); */

	System.out.println(func(1,2));
	
	}

	public static int func(int a,int b) {
		return (a+b+3);
	}
}

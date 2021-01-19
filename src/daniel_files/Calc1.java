package daniel_files;

public class Calc1 {
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

	Calc1 s=new Calc1();

	System.out.println(s.func(7,8));
	
	}

	int func(int a,int b) {
		return (a + b + 3);
	}
}

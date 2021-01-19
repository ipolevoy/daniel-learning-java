package daniel_files;

public class Calc {
	public static void main (String args[]) {
	
	int a = 112;
	int b = 33;
	int c;
	
	c = add(a,b);

	System.out.println(c);
	System.out.println(subtract(a, b));
	System.out.println(divide(a, b));
	System.out.println(multiply(30, b));
	System.out.println("No Params: " + addConstants());
	addThreeNums(a, b, c);

	}

	static int add (int x, int y) {
		return x + y; 
	}

	static int subtract (int x, int y) {
                return x - y;
	}

	static int multiply (int x, int y) {
                return x * y;
	}

	static int divide (int x, int y) {
                return x / y;
	}

	static void addThreeNums (int x, int y, int z) {
		System.out.println (x + y + z);
	}
	
	static int addConstants () {
                return 75 + 32 +  1223 + 213;
	}
}

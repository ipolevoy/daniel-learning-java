package daniel_files;

public class CalcInstance {

	String s = "Bagel";	
	int a = 2;
	int b = 3;
	int d = 4;

	int add (int x, int y) {
		return x+y; 
	}


	int subtract (int x, int y) {
                return x-y;
	}

	int multiply (int x, int y) {
                return x*y;
	}

	int divide (int x, int y) {
                return x/y;
	}

	void addThreeNums (int x, int y, int z) {
		System.out.println (x+y+z);
	} 	
	
	public CalcInstance () {
		d = a + b;
		b = 3800;
		a = 4000;
	}

	public CalcInstance (int x, int y) {
		d = x * y;
		s = "Turkey";
	}

	public static void main (String args[]) {

        int a=112;
        int b=33;
        int c;
	
	CalcInstance ref = new CalcInstance();


        c = ref.add(ref.a,b);
	ref.b = ref.add(6,5);

        System.out.println(c);
	System.out.println("Hi: " + ref.b);
        System.out.println(ref.subtract(a,b));
        System.out.println(ref.divide(a,b));
        System.out.println(ref.multiply(30, b));
        ref.addThreeNums(a, b, c);
	
	CalcInstance ref2 = new CalcInstance(); // C

	ref2.b = 123;
	System.out.println("Instance ref 2 " + ref2.add(ref2.b, b));
	
	CalcInstance ref3 = new CalcInstance();
	
	System.out.println("My 3rd ref.a " + ref3.a + '\n' + " That's it. " + ref3.b + "\n Hello " + ref3.d + ref3.s);

	CalcInstance ref4 = new CalcInstance(b, 100);
	
	System.out.println(ref4.d + '\n' + " The third " + ref4.b + " " + ref4.s + " My Final Line " + ref3.s); // reference - when you create an instance of the class, you assign a reference or a pointer
	

	}


}

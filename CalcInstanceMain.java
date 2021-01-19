public class CalcInstanceMain {
	
	int a = 2;
	int b = 3;
	int d = 4;

	public static void main (String args[]) {

          int a=112;
          int b=33;
          int c;
	
	CalcInstanceNoMain ref2 = new CalcInstanceNoMain();

        c = ref2.add(ref2.a,b);
	ref2.b = ref2.add(6,5);
	ref2.b = ref2.add(ref2.d,5);

	System.out.println("Wow: " + ref2.b);
        System.out.println(c);
	System.out.println("Hi: " + ref2.b);
        System.out.println(ref2.subtract(a,b));
        System.out.println(ref2.divide(a,b));
        System.out.println(ref2.multiply(30,b));
        ref2.addThreeNums(a,b,c);

        }


}

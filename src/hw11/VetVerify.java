package hw11;

public class VetVerify {
	public static void verify(int weight, int age) {
		if (age>3 && weight>100) {
			throw new OutofBoundsException("Not eligble");
		}
	}
		
	public static void main(String args[]) {
		VetVerify ref = new VetVerify();
		ref.verify(4444,101); 
	}
}

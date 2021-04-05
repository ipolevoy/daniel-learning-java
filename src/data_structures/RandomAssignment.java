package data_structures;
import java.util.*;

public class RandomAssignment {

	double n = 12;
	static double m = 15;

	public static void main (String args[]) {
		RandomAssignment ref = new RandomAssignment();
		double j = 1201;
		System.out.println("Main: " + ref.n);
		double f = ref.cre(j, ref);
		System.out.println("cre: " + f);
		System.out.println("Main2nd: " + ref.n );	
		System.out.println(m);
	
		ref.ate(j, ref);
		System.out.println("Main 3: " + ref.n);
	}

	public double cre(double h, RandomAssignment ref2) {
		ref2.n = ref2.n + 200;
		System.out.println(ref2.n);
		ref2.ate(h + (1000/3000) + ref2.n, ref2);
		this.m = this.m + h;
		double g = h + 3 + ref2.n ;
		return g;
	}

	public void ate(double z, RandomAssignment ref3) {
		System.out.println("Ate: " + (z + 1000));
		ref3.n = ref3.n/z;
		
	}
}


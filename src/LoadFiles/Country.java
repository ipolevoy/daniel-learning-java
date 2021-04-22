import java.io.*;
import java.util.*;

public class Country {
	HashMap<String, Integer> pop = new HashMap<String, Integer>();
	HashMap<String, Double> perCap = new HashMap<String, Double>();
	HashMap<String, Integer> gdp = new HashMap<String, Integer>();
	//HashMap<String, String> useless = new HashMap<>();
	List<String> euro = new LinkedList<String>();
	HashMap<String, String> capitals = new HashMap<String, String>();

	public static void main (String [] args) throws IOException{
        	
		Country ref = new Country();
		CountryCollection clt = new CountryCollection();

	int totalGDP = clt.populateGDP(ref);
	System.out.println(ref.gdp);
	System.out.println("World gdp: " + clt.populateGDP(ref) + '\n');
	System.out.println("-=-------------------------------------------------");

	int totalPop = clt.populatePop(ref);
	System.out.println(ref.pop);
      clt.populatePop(ref);
		System.out.println("TOTAL POP: " + totalPop);
		//System.out.println(ref.gdp);
		System.out.println("====================================================================");
		;
/*	System.out.println("World pop: " + clt.populatePop(ref) + '\n');
		String line = null;	
		while((line = br.readLine()) != null) {
        	ref.euro.add(line.trim());
        } */
       	clt.populateEuro(ref);
		Collections.sort(ref.euro);
		System.out.println(ref.euro);
		System.out.println('\n');
		System.out.println(ref.capitals);

		clt.GDPPerCap(ref);
		System.out.println(ref.perCap);	
		clt.populateUseless(ref.euro);
		
//		HashMap<String, String> useless = new HashMap<>();
		HashMap<String, String> useless = clt.populateUseless(ref.euro);
		System.out.println(useless);
	//	System.out.println(ref.useless);
	
	}

}

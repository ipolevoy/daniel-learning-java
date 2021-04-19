package data_structures;
import java.io.*;
import java.util.*;


public class Country {
	HashMap<String, Integer> pop = new HashMap<String, Integer>();
	HashMap<String, Integer> gdp = new HashMap<String, Integer>();
	List<String> euro = new LinkedList<String>();
	public static void main(String [] args) throws IOException {
		Country ref = new Country();
	
		File myfile = new File("./src/data_structures/country.txt");
		BufferedReader br = new BufferedReader(new FileReader(myfile));

		File myfile2 = new File("./src/data_structures/countrygdp.txt");
		BufferedReader br2 = new BufferedReader(new FileReader(myfile2));

		File myfile3 = new File("./src/data_structures/europe.txt");
        BufferedReader br3 = new BufferedReader(new FileReader(myfile3));

		//FileInputStream fin = new FileInputStream("./src/data_structures/country.txt");

	//	int x = fin.read();
	//	System.out.print(x);

		String line = null;
		String line2 = null;		
		String line3 = null;

		while((line = br.readLine()) != null) {
			String [] parts = line.split(":");
			ref.pop.put(parts[0].trim(), Integer.parseInt(parts[1].trim()));
	
		}
		
		System.out.println(ref.pop);
		
		while((line2 = br2.readLine()) != null) {
			String [] parts = line2.split(":");
			ref.gdp.put(parts[0].trim(), Integer.parseInt(parts[1].trim()));
		}

		System.out.println(ref.gdp);

		while((line3 = br3.readLine()) != null) {
			ref.euro.add(line3.trim());
		}
		System.out.println(ref.euro);
	


		for(Map.Entry<String, Integer> ent : ref.gdp.entrySet()) {
      		System.out.println("Key = " + ent.getKey() + ", Value = " + ent.getValue());
			if (ref.pop.containsKey(ent.getKey())) {
				System.out.println(ref.pop.get(ent.getKey())/ref.gdp.get(ent.getKey())); 
			} else {
				System.out.println(ent.getKey() + " is not there");
			}
      }
	}
}

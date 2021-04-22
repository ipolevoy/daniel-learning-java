package load_files;

import java.util.*;
import java.io.*;

public class CountryCollection {


	public int populateGDP(Country obj) throws IOException {
 		File myfile2 = new File("./src/load_files/CountriesGDP.txt");
        BufferedReader br2 = new BufferedReader(new FileReader(myfile2));
		
	//	CountryCollection coll = new CountryCollection();

        String line2 = null;
        String [] parts;

		int totalGDP = 0;
		
        while((line2 = br2.readLine()) != null) {
             parts = line2.split("\\|");
 			
              if(isNumeric(parts[3])) {
              obj.gdp.put(parts[0].trim(), Integer.parseInt(parts[3].trim()));
			totalGDP = totalGDP + Integer.parseInt(parts[3].trim());
              }
/*			try {
			totalGDP = totalGDP + Integer.parseInt(parts[3].trim());
			} catch (Exception e) {}
			count++;   */
          }
		return totalGDP;
}

	
	public void GDPPerCap(Country obj) {
			double perCapGDP = 0;
		for(Map.Entry<String, Integer> ent : obj.pop.entrySet()) {
           // System.out.println("Key = " + ent.getKey() + ", Value = " + ent.getValue());
			if (obj.euro.contains(ent.getKey().toLowerCase())) {
				if(obj.gdp.containsKey(ent.getKey())) {
					//perCapGDP = ((obj.gdp.get(ent.getKey()))/ent.getValue());
					perCapGDP = ((double)(obj.gdp.get(ent.getKey()))/(double)ent.getValue());
					obj.perCap.put(ent.getKey(), perCapGDP);
			//		System.out.println(ent.getKey() + " = " + perCapGDP);
				//	System.out.println(ent.getKey());
				}
				//System.out.println("Key = " + ent.getKey() + ", Value = " + ent.getValue());
    		}

		}
	}

	public int populatePop(Country obj) throws IOException {
		File myfile3 = new File("./src/load_files/CountriesPopulation.txt");
		BufferedReader br3 = new BufferedReader(new FileReader(myfile3));
		
		String population;
		int totalPop = 0;
		String line3;
		int recordCount = 1;
		while ((line3 = br3.readLine()) != null) {
			if (recordCount <= 2) {
				recordCount++;
				continue;
			}
			population = line3.substring(34,50).trim().replace(",","");
			obj.capitals.put(line3.substring(16,33).trim(), line3.substring(1,15).trim());
			if(isNumeric(population)) {
				obj.pop.put(line3.substring(16,33).trim(), Integer.parseInt(population));
				totalPop = totalPop + Integer.parseInt(population);
			}
		/*	try {
				totalPop = totalPop + Integer.parseInt(population); // Integer.parseInt(line3.substring(34).trim().replace(",",""));
				
				System.out.println(line3.substring(16,33).trim());
				System.out.println(line3.substring(34).trim().replace(",",""));
				System.out.println(totalPop);
			} catch (Exception e) {}*/
//				System.out.println(totalPop);	
		
			//System.out.println(line3.substring(34).trim());	
			if (recordCount== 25) {
				System.out.println("#25");
			}
			recordCount++;
		}
		return totalPop;
	}
	

	public String reverse (String input) {
		if (input == null) {
			return null;
		}

		StringBuilder output = new StringBuilder(input).reverse();
		return output.toString();
	}


	public void populateEuro(Country obj) throws IOException {

		File myfile4 = new File("./src/load_files/CountriesEurope.txt");
        BufferedReader br4 = new BufferedReader(new FileReader(myfile4));

		while((br4.readLine()) != null) {
			obj.euro.add(br4.readLine().trim());
		}
	}

	public HashMap<String, String> populateUseless(List<String> list) throws IOException {
		HashMap<String, String> localUseless = new HashMap<>();
		for (int i = 0; i < list.size(); ++i) {
			localUseless.put(list.get(i), reverse(list.get(i)));
			//obj.useless.put(list.get(i), reverse(list.get(i)));
		}
		return localUseless;
	}
			
		

	public boolean isNumeric(String str) {
    if (str == null) {
       return false;
    }
       try {
          int i = Integer.parseInt(str);
       } catch (NumberFormatException nfe) {
           System.out.println("HERE");
           return false;
       }
     	  return true;
     }
}

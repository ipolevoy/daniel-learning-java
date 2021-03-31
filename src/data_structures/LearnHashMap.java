package data_structures;
import java.util.*;

public class LearnHashMap {

	HashMap<String, Integer> hm = new HashMap<String, Integer>();
	static HashMap<String, Integer> shm = new HashMap<String, Integer>();

	public static void main (String args[]) {
		LinkedList<String> ll = new LinkedList<String>();
	
		HashMap<String, Integer> averageAge = new HashMap<String, Integer>();
		
		averageAge.put("Russia", 34);
		averageAge.put("USA", 27);
		averageAge.put("Finland", 12);
		averageAge.put("Denmark", 16);
		averageAge.put("Mexico", 63);
		averageAge.put("Canada", 45);
		averageAge.put("France", 12);
		averageAge.replace("Finland", 11);
		averageAge.replace("Mexico", 63, 55);

		LearnHashMap ref = new LearnHashMap();
		ref.hmap(averageAge, 5);

		System.out.println(averageAge.putIfAbsent("Norway", 15));
		System.out.println(averageAge.isEmpty());
		System.out.println(averageAge.get("Finland"));
		System.out.println(averageAge.containsKey("Finland"));	
		System.out.println(averageAge.containsValue(14));
		System.out.println(averageAge.size());
	//  System.out.println(averageAge.remove("Finland"));
		System.out.println(averageAge.values());
		System.out.println(averageAge);
		
			
		ref.hmap2(ref); 



	System.out.println(ref.chmap(averageAge));
		shm.put("Thailand", 1);
		ref.hmap(averageAge, 4);

		ref.hm.put("Cambodia", 12);
	}

	public HashMap<String, Integer> chmap (HashMap<String, Integer> h) {
		h.put("Japan", 3);
		return h;
	}

	public void hmap (HashMap<String,Integer> hh, int age) {
		hh.put("Korea", age);
		this.shm.put("Greenland", 15);
		System.out.println(hh);
		System.out.println(this.shm);
		System.out.println(hm);
	}		
	
	public void hmap2 (LearnHashMap ref2) {
		ref2.hm.put("Mongolia", 15);
		System.out.println(ref2.hm);
	}
}


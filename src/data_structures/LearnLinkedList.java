package data_structures;
import java.util.*;

public class LearnLinkedList {

	LinkedList<Integer> i = new LinkedList<Integer>();
	static LinkedList<Integer> ii = new LinkedList<Integer>();
	HashMap<String, Integer> gg = new HashMap<String, Integer>();

	public static void main (String args[]) {
		LinkedList<String> ll = new LinkedList<String>();
		LearnLinkedList rr = new LearnLinkedList();
	
		ll.add("Apple");
		boolean b = ll.add("Bass");
		ll.add("Cat");
		ll.add("Dare");

		System.out.println(ll);		
		ll.add(2, "Epsilon");

		boolean bb = ll.contains("Idiot");
		System.out.println(bb);
		System.out.println(ll);
		System.out.println(b);

	rr.gg.put("Jim", 12);	
			

		for(int i = 0; i < ll.size(); i++) {
			System.out.println("This loop: " + ll.get(i));
			rr.gg.put(ll.get(i), i + 100);
		}

	System.out.println(rr.gg);

		LinkedList<String> l = new LinkedList<String>();

		
		l.add("Zebra");
		l.add("Bass");
		l.add("rain");
		System.out.println(ll.containsAll(l)); 
		ll.remove("Dare");
		System.out.println(ll);
		ll.removeAll(l);
		ll.retainAll(l);
		System.out.println(ll);
		System.out.println(l.size());
		System.out.println(l.get(2));

		ii.add(1);

		LearnLinkedList ref = new LearnLinkedList(); 
		ref.i.add(2);
		ref.i.add(3);
		ref.i.add(14);
		System.out.println(ref.i);

		LinkedList<Integer> j = new LinkedList<Integer>();
		j = (ref.returnLinkedList(ref.i));
		System.out.println(j);
//		this.ii.add(11);
//		this.ii.add(12);
		
		ref.takeListPar(l);
		Collections.sort(l);
		l.forEach(System.out::println);

	}


	

	public void takeListPar(LinkedList<String> low) {
		low.add("Hello");
		this.ii.add(55);
		
		System.out.println(this.ii);
		System.out.println(low);
		
			
			
	}
	
	public LinkedList<Integer> returnLinkedList(LinkedList<Integer> high) {
		int wow = high.get(2);
		high.set(1,wow + 1000);
		return high;
	}
}


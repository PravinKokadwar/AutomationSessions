package HashMapConcepts;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetConcept {

	public static void main(String[] args) {

		//HashSet internally call HashMap
		HashSet<String> hs = new HashSet<String>();
		hs.add("Alpha");
		hs.add("Testing");
		hs.add("Beta");
		hs.add("Gama");
		//hs.add(null);

		System.out.println(hs);
		System.out.println("---------------");
		System.out.println(hs.contains("Beta"));
		//System.out.println(hs.contains(null));
		
		System.out.println("----------------");
		
		Iterator<String> it =  hs.iterator();
        while(it.hasNext()) {
        	
        	System.out.println(it.next());
        }
        
        
	}

}

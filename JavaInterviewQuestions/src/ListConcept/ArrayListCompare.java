package ListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListCompare {

	public static void main(String[] args) {
	
		//1. sort and equals
		ArrayList<String> l1 = new ArrayList<String>(Arrays.asList("P","M","B","C","H"));
		ArrayList<String> l2 = new ArrayList<String>(Arrays.asList("Pune", "Mumbai","Banglore","Chennai","Nagpur"));
		
		ArrayList<String> l3 = new ArrayList<String>(Arrays.asList("P","M","B","C","H"));
		
	    Collections.sort(l1);
		Collections.sort(l2);
		Collections.sort(l3);
		
		// System.out.println(l1.equals(l2)); // return "false" as both arraylist does not contains same elements. 
		System.out.println(l1.equals(l3)); //return "true" as both ArrayList contains same elements.
		
		//System.out.println(l1.retainAll(l2));
		
		//2.Compare two lists -- find out additional elements. 
		
		ArrayList<String> l4 = new ArrayList<String>(Arrays.asList("Pune", "Mumbai","Banglore","Chennai","HYD"));
		ArrayList<String> l5 = new ArrayList<String>(Arrays.asList("Pune", "Mumbai","Banglore","Chennai","Nagpur"));
		//System.out.println(l4.removeAll(l5));
		
		System.out.println("===============");
		
		l4.removeAll(l5); // keep all un-matched elements from l4
		System.out.println(l4);
		
		System.out.println("===============");
		//3. find out missing elements
		
		l5.removeAll(l4);  
		System.out.println(l5);
		
		System.out.println("===============");
		
		//4. Find out the common elements
		
		ArrayList<String> lang1 = new ArrayList<String>(Arrays.asList("Java", "Python","Ruby","C#","JS"));
		ArrayList<String> lang2 = new ArrayList<String>(Arrays.asList("Java", "Python","Ruby","C#","PHP"));
		
		lang1.retainAll(lang2); //keep all common elements from lang1 and lang2
		System.out.println(lang1);

		System.out.println("===============");
	}

}

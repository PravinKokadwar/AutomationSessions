package HashMapConcepts;

import java.util.Hashtable;

public class HashTableDemo {
	
	public static void main(String args[]) {
		
		//HasbTable by default created 11 segments (initial capacity) virtually in back end.
		//HashTable does not allow null Key,Value 
		//hashTable is synchronized, Multiple hashcode have same Index is possible
		//HashTable LoadFactor = 0.75. 
		
		Hashtable<String, Integer> marks = new Hashtable<String, Integer>();
		marks.put("Pravin", 100);
		marks.put("Tom",200);
		marks.put("Peter", 300);
		marks.put("Lisa",400);
		//marks.put(null, 500); // HashTable cannot accept key as "null", throw NullPointerException
		//marks.put("Harry",null); // HashTable cannot accept value as "null" , throw NullPointerException
 		
	    System.out.println(marks.get("Pravin"));
	    System.out.println("--------");
	    System.out.println(marks.get("Lisa"));
	    System.out.println("--------");
		//System.out.println(marks.get(null));
	    //System.out.println("----------");
		//System.out.println(marks.get("Harry"));
	    
	    
	}
	
	

}

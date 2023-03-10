package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class combineArrayList {

	public static void main(String args[]) {

		ArrayList<String> ar3 = new ArrayList<String>();
		ar3.add("Pune");
		ar3.add("Mumbai");
		ar3.add("Delhi");
		ar3.add("Banglore");
		ar3.add("Delhi");
		ar3.add("Mumbai");
		ar3.add("Delhi");
		ar3.add("Delhi");

		ArrayList<String> ar4 = new ArrayList<String>();
		ar4.add("Java");
		ar4.add("Python");

		
		/*
		 * ar3.addAll(ar4); System.out.println(ar3);
		 * 
		 * ar3.addAll(2, ar4); // This method will add ar4 array from second position
		 * System.out.println(ar3);
		 * 
		 * ar3.clear(); // This method will clear all elements form ar3 array
		 * System.out.println(ar3);
		 */		
		
		  /*ArrayList<String> CloneList = (ArrayList<String>)ar3.clone();
		  System.out.println(CloneList);
		  
		  System.out.println(ar3.contains("Mumbai"));
		  System.out.println(ar3.indexOf("Banglore"));
		  */
		
		  ArrayList<String> arlist1 = new ArrayList<String>(Arrays.asList("Java","Python","C#","Javascript"));
          System.out.println(arlist1);   
          
          int k = arlist1.lastIndexOf("Java");
          System.out.println(k);
          
	//	  System.out.println(ar3.lastIndexOf("Delhi"));
		
          // This method will give you only particular elements from the arraylist
          ArrayList<String> arlist2 = new ArrayList<String>(Arrays.asList("Intel","CG","Infosys","MasterCard","Infosys","IBM"));
          System.out.println(arlist2);
          
          arlist2.retainAll(Collections.singleton("Infosys"));
          System.out.println(arlist2);
          
         // Create sub-list
          
          
          
	}

}

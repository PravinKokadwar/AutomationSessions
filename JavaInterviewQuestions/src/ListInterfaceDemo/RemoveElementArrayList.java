package ListInterfaceDemo;

import java.util.ArrayList;
import java.util.List;

// remove()
// removeAll()
// clear()

public class RemoveElementArrayList {
	public static void main(String[] args) {
		List<String> list2 = new ArrayList<>();
		list2.add("Pune");
		list2.add("Banglore");
		list2.add("Chennai");
		list2.add("Delhi");
		list2.add("Mumbai");

		/*
		 * System.out.println(list2);
		 * 
		 * System.out.println("=======");
		 * 
		 * list2.remove(2); System.out.println("First Modified list is => " + list2);
		 * 
		 * list2.remove("Delhi"); System.out.println("Second Modified list is => " +
		 * list2);
		 * 
		 * 
		 * System.out.println("=======");
		 * 
		 */
		
		//2. Remove all elements that exists in a given collection.

		List<String> sublist2 = new ArrayList<>();
		
		sublist2.add("Delhi");
		sublist2.add("Nagpur");
		
		list2.removeAll(sublist2);
		System.out.println(list2);

		//3. clear all elements from the given list. 
		
	    list2.clear();
	    System.out.println(list2);

	}

}

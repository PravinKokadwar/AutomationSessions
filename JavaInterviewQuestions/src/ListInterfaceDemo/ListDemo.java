package ListInterfaceDemo;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		// 1. List allows duplicate elements.
		/*
		 * list.add("Java");
		 * 
		 * list.add("Selenium"); list.add("PHP");
		 * 
		 * System.out.println(list);
		 */

		// 2.List allows us to add null elements in the list.

		/*
		 * list.add(null); System.out.println(list);
		 */
		// 3. List interface maintain insertion order.

		list.add("element1"); // 0 
		list.add("element4"); // 1 
		list.add("element5"); // 2
		list.add("element2");
		list.add("element2");
		list.add("element5");// 3 
		System.out.println(list);

		
		/*
		 * System.out.println(list.get(2)); System.out.println(list.get(3));
		 */
	}

}

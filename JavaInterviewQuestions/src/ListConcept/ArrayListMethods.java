package ListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String args[]) {

		ArrayList<String> ar1 = new ArrayList<String>();

		ar1.add("Java");
		ar1.add("Microprocessor");
		ar1.add("JavaScript");
		ar1.add("Python");

		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("English");
		ar2.add("Marathi");
		ar2.add("Sanskrit");

		// ar1.add("Pune"); System.out.println(ar1);
		// addAll() method is used to add all elements of firstarrayList to second
		// ArrayList().

		// ar1.addAll(ar2); // This method will add all ar2 elements to ar1 arrayList at
		// the end..
		// System.out.println(ar1);
		// ar1.clear(); // This method will clear all ar1 arrayList elements.
		// System.out.println(ar1);

		// clone() method is used for duplicating purpose only
		// ArrayList<String> cloneList = (ArrayList<String>)ar1.clone();
		// System.out.println(cloneList);

		// contains() method is used for to checking presence of element.
		// System.out.println(ar1.contains("Math")); // return true
		// System.out.println(ar2.contains("Csharp")); // return false as ar2 does not
		// contains Csharp

		// System.out.println(ar1.indexOf("Math")>0);

		ArrayList<String> list2 = new ArrayList<String>(
				Arrays.asList("java2", "Database2", "Microprocessor2", "notepad2", "Database2"));
		System.out.println(list2);

		int k = list2.lastIndexOf("notepad2");
		System.out.println(k);

		// list2.remove(2);
		// System.out.println(list2);

		list2.remove("notepad2");
		System.out.println(list2);

		// ArrayList<Integer> numbers = new
		// ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		// numbers.removeIf(num -> num%2 == 0);
		// System.out.println(numbers);

		// ArrayList<Integer> numbers = new
		// ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		// numbers.removeIf(num -> num%2 != 0);
		// System.out.println(numbers);

		//singleton() method gives only same element records of the arrayList.
		ArrayList<String> nameList = new ArrayList<String>(
				Arrays.asList("One", "Two", "Three", "Four", "Five", "Six", "Six", "Eight", "Nine", "Six"));
		System.out.println(nameList);

		nameList.retainAll(Collections.singleton("Six"));
		System.out.println(nameList);

		//sublist() method give us list of element specified as per Index.
		ArrayList<Integer> numbers1 = new ArrayList<Integer>(
				Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20));
		ArrayList<Integer> subList = new ArrayList<Integer>(numbers1.subList(2, 7));
		System.out.println(subList);
		
		

	}

}

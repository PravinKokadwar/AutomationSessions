package ListConcept;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {

	public static void main(String args[]) {

		ArrayList<Object> ar = new ArrayList<Object>();

		ar.add(100); //index position zero 0
		ar.add("testing"); //1
		ar.add('k'); //2
		ar.add(true); //3
		ar.add(12.33); //4
		ar.add(false); //5

		System.out.println(ar);
		System.out.println(ar.get(3));

		System.out.println(ar.size());
		// System.out.println("Lowest Index" +0);
		System.out.println("Highest Index" + " >> " + (ar.size() - 1));
		
		System.out.println("****************************");
		
		// ArrayList with other collection

		ArrayList<String> names = new ArrayList<String>(Arrays.asList("PHP", "Java", "Microprocessor", "Database"));
		System.out.println(names);
		System.out.println(names.size());
		
		System.out.println("****************************");
		
		//Print with Lambda Expression
		ar.stream().forEach(java -> System.out.println(java)); // it will print all elements of ar.add arrayList.
		
		System.out.println("*************************");
		
        names.stream().forEach(php -> System.out.println(php));
	}

}

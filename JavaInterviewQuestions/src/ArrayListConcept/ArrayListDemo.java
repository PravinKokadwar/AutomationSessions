package ArrayListConcept;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<Object> ar = new ArrayList<Object>();
		// ArrayList will maintain indexing to store value.
		// ArrayList are dynamic in nature, it's size get increased as no. of
		// elements are increased.
		ar.add(100);// 0th index
		ar.add(200);// 1st index
		ar.add(true);// 2nd index
		ar.add("testing is in progres");// 3rd index
		ar.add('W');// 5th index
		// System.out.println(ar);
		// System.out.println(ar.get(4));
		// System.out.println(ar.get(7)); //error scenarios
		// System.out.println(ar.get(-1));//error scenarios
		// System.out.println(ar.size());
		// System.out.println(ar.hashCode());

		System.out.println("Lowest Index" + "  " + 0);
		System.out.println("Highest Index" + " " + (ar.size() - 1));

	}

}

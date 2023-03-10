package ArrayListConcept;

import java.util.ArrayList;

public class GenericsArrayList {
	public static void main(String args[]) {

		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		// this arraylist store only integer no. in array
		arr2.add(100);

		ArrayList<Double> arr3 = new ArrayList<Double>();
		// this Arraylist will store only double elements in list.
		arr3.add(15.66);
		System.out.println("The output of ArrayList double is" + arr3.indexOf(arr3));
		// ArrayList<String> arr2 = new ArrayList<>(String);

	}

}

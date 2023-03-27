package SetInterface;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetMethods {
	// program for Add method in set.
	public static void main(String args[]) {
		Set<Integer> data = new LinkedHashSet<Integer>();

		data.add(31);
		data.add(21);
		data.add(41);
		data.add(11);
		data.add(61);
		data.add(51);

		// data.add(51);
		System.out.println("data: " + data);

		System.out.println("--------");

		System.out.println("Does set contains 51 ?" + data.contains(51));
		System.out.println("Does set contains 100 ?" + data.contains(100));

		System.out.println("--------");

		Set<Integer> newData = new LinkedHashSet<Integer>();
		newData.add(31);
		newData.add(21);
		newData.add(41);

		System.out.println("Does data contains newData?" + data.containsAll(newData));
		
		System.out.println("--------");

	}

}

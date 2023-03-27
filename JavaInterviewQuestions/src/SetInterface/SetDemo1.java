package SetInterface;

import java.util.HashSet;
import java.util.Set;

public class SetDemo1 {

	// It doesnot contains Duplicate elements.
	// It creates un-ordered collection or list.
	// It can be used to perform all mathmatical operations like intersection,union, difference.

	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>();
		
		set1.add(100);
		set1.add(200);
		set1.add(300);
		set1.add(400);
		set1.add(500);
		set1.add(600);
		set1.add(400);
		set1.add(700);
		
		System.out.println("The list of set elements are : " + set1);

		set1.remove(300);
		set1.remove(400);
		
		System.out.println("After remove operation set is : " + set1);

	}

}

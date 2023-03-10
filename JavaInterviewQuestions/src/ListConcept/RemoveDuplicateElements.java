package ListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<Integer>(
				Arrays.asList(1, 2, 3, 2, 1, 4, 5, 6, 5, 4, 5, 6, 7, 8, 9, 4, 9));

		// Need to remove duplicate elements from the given ArrayList ??
		// 1. By using LinkedHashSet
		
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>(numbers);
		
		ArrayList<Integer> numberslistWithoutDuplicateElem = new ArrayList<Integer>(linkedHashSet);
		
		System.out.println(numberslistWithoutDuplicateElem);
		
		System.out.println("---------------------");
		
		//2. JDK 8 -- stream
		ArrayList<Integer> markList = new ArrayList<Integer>(
				Arrays.asList(1, 2, 3, 2, 1, 4, 5, 6, 5, 4, 5, 6, 7, 8, 9, 4, 9));

		List<Integer> markListunique = markList.stream().distinct().collect(Collectors.toList());
		System.out.println(markListunique);
		

	}

}

package ListInterfaceDemo;

import java.util.ArrayList;
import java.util.List;

public class CreateArrayListCollectionExample {
// How to create ArrayList from another collection using the 
// ArrayList(Collection c) constructor.

//how to add the elements from an existing collection to the new
//ArrayList using the addAll() method.	

	public static void main(String[] args) {

		// create ArrayList object
		List<Integer> firstFivePrimeNumbers = new ArrayList<>();
		firstFivePrimeNumbers.add(2);
		firstFivePrimeNumbers.add(3);
		firstFivePrimeNumbers.add(5);
		firstFivePrimeNumbers.add(7);
		firstFivePrimeNumbers.add(11);

		List<Integer> firstTenPrimeNumbers = new ArrayList<>(firstFivePrimeNumbers);

		List<Integer> nextFivePrimeNumbers = new ArrayList<>();
		nextFivePrimeNumbers.add(13);
		nextFivePrimeNumbers.add(17);
		nextFivePrimeNumbers.add(19);
		nextFivePrimeNumbers.add(23);
		nextFivePrimeNumbers.add(29);
		
		firstTenPrimeNumbers.addAll(nextFivePrimeNumbers);
		
		System.out.println(firstTenPrimeNumbers);

	}

}

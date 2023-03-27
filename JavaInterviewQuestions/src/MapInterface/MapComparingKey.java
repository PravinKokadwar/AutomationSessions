package MapInterface;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MapComparingKey {

	public static void main(String args[]) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(100, "POS");
		map.put(101, "SalesForce");
		map.put(102, "Merchandize");

		// Returns a Set view of the mappings contained in this map.

		map.entrySet()
				// Returns a sequential Stream with this collection as its source
				.stream()
				// Sorted according to the provided Comparator
				.sorted(Map.Entry.comparingByKey())
				// Performs an action for each element of this stream
				.forEach(System.out::println);

		// Descending Order
		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
				.forEach(System.out::println);

	}

}

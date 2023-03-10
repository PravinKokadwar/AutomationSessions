package HashMapConcepts;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapInitilization {
	// Purpose of program is Different ways to create HashMap in java

	public static void main(String[] args) {
		// 1.Using HashMap Class

		HashMap<String, String> map1 = new HashMap<String, String>();
		Map<String, String> map2 = new HashMap<>();

		// 2.Static way : Static Hashmap, It will create one internal class, get Stack
		// memory exception so usually we avoid it

		System.out.println("--------------------------------------");

		// 3.immutable Map with only one single entry

		Map<String, Integer> map3 = Collections.singletonMap("Jai", 100);
		System.out.println(map3.get("Jai"));
		// map3.put("Tom",200); Cannot Add second entry in Map, throw
		// UnsupportedOperationException

		System.out.println("-----------------------------------------");

		// 4. JDK 8, Creating one 2D array of String using stream and collecting in the
		// form of Map
		// Converting 2D Array into Map and collect and store it
		Map<String, String> map4 = Stream.of(new String[][] { { "Tom", "A Grade" }, { "Peter", "A+ Grade" } })
				.collect(Collectors.toMap(data -> data[0], data -> data[1]));
		System.out.println(map4.get("Tom"));

		System.out.println("-------------------------------------------");

		// Using SimpleEntry , Mutable Map
		Map<String, String> map5 = Stream
				.of(new AbstractMap.SimpleEntry<>("Pravin", "Java"), new AbstractMap.SimpleEntry<>("Navneen", "Python"))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		System.out.println(map5.get("Navneen"));
		map5.put("Tom", "C#"); // Can add multiple values once map get declared.
		System.out.println(map5.get("Tom"));

		System.out.println("-------------------------------------------");

		// Using SimpleEntry , Immutable Map
		Map<String, String> map6 = Stream
				.of(new AbstractMap.SimpleImmutableEntry<>("Pravin", "Java"),
						new AbstractMap.SimpleEntry<>("Navneen", "Python"))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		System.out.println(map6.get("Navneen"));
		map6.put("Lisa", "C#"); // Can add multiple values once map get declared.
		map6.put("Tony", "JavaScript");
		System.out.println(map6.get("Lisa"));
		System.out.println(map6.get("Tony"));

		// JDK 1.9

	}

}

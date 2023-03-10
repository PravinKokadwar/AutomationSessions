package HashMapConcepts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapBasics {

	public static void main(String args[]) {

		// HashMap store value in form of <Key,value>
		// no order - no indexing
		// Key cannot be duplicate
		// Can store n no. of null values but store only one null key
		// Hashmap is not thread safe.

		HashMap<String, String> capitalMap = new HashMap<String, String>();
		capitalMap.put("India", "Delhi");
		capitalMap.put("USA", "Washington DC");
		capitalMap.put("UK", "London");
		capitalMap.put("UK", "Tokyo"); // HashMap will take only latest values from the HashMap list, ignore previous
		// null keys
		capitalMap.put(null, "Berlin");
		capitalMap.put(null, "SouthAfrica"); // HashMap will take only latest values of null keys.
		// null values
		capitalMap.put("Russia", null);
		capitalMap.put("France", null); // HashMap will take only latest values form the list.

		System.out.println(capitalMap.get("India"));
		System.out.println(capitalMap.get("UK"));
		System.out.println(capitalMap.get(null));

		System.out.println(capitalMap.get("Russia"));

		// How to iterate hashMap elements ?? 1. using KeySet() 2. Using entrySet().

		// Iterator : over the keys :by using keySet()

		Iterator<String> it = capitalMap.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			String value = capitalMap.get(key);

			System.out.println("Key = " + key + "Value = " + value);
		}

		System.out.println("***************************");

		// Iterator : over the set(pair) :by using entrySet()

		Iterator<Entry<String, String>> it2 = capitalMap.entrySet().iterator();
		while (it2.hasNext()) {
			Entry<String, String> entry = it2.next();
			System.out.println("key = " + entry.getKey() + "value = " + entry.getValue());

		}

	}

}

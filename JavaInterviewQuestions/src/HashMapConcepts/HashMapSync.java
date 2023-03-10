package HashMapConcepts;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapSync {

	public static void main(String args[]) {

		Map<String, String> map1 = new HashMap<String, String>();
		map1.put("1", "Pravin");
		map1.put("2", "Tom");
		map1.put("3", "Lisa");

        // Create Synchronized Map
		Map<String, String> syncMap = Collections.synchronizedMap(map1);
		System.out.println(syncMap);
		
		//concurrentHashMap: it does not throw any concurrentModificationException
		ConcurrentHashMap<String, String> concurrentMap = new ConcurrentHashMap<String, String>();
		concurrentMap.put("A","Java");
		concurrentMap.put("B","Database");
		concurrentMap.put("C","Math");
		
		System.out.println(concurrentMap.get("B"));
		
		

	}

}

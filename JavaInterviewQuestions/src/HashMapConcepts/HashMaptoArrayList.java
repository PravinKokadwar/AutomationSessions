package HashMapConcepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashMaptoArrayList {

	public static void main(String args[]) {

		HashMap<String, Integer> compMap = new HashMap<String, Integer>();

		compMap.put("Walmart", 1000);
		compMap.put("Cisco", 2000);
		compMap.put("Amazon", 30000);
		compMap.put("Google", 4000);
		compMap.put("faceBook", 5000);

		// System.out.println("compMap size is" + compMap.size());

		// convert hashMap key's into ArrayList

		List<String> compNameList = new ArrayList<String>(compMap.keySet());
		System.out.println(compNameList);
		System.out.println("----------------------");
		for (String t : compNameList) {

			System.out.println(t);
		}
		System.out.println("----------------------");

		// convert hashMap values into ArrayList
		List<Integer> compNameList1 = new ArrayList<Integer>(compMap.values());
		System.out.println(compNameList1);
		
		System.out.println("-----------------");
		
		for (Integer i : compNameList1) {

			System.out.println(i);
		}

	}

}

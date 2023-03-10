package HashMapConcepts;

import java.util.HashMap;

public class HashMapCompare {

	public static void main(String[] args) {

		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");
		System.out.println(map1);

		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(2, "C");
		map2.put(1, "A");
		map2.put(3, "B");
		System.out.println(map2);
		

		HashMap<Integer, String> map3 = new HashMap<Integer, String>();
        map3.put(3, "C");
        map3.put(3, "A");
        map3.put(3, "B");
        map3.put(3, "D");
        System.out.println(map3);
	}

}

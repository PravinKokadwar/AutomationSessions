package HashMapConcepts;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapConcept {

	public static void main(String args[]) {

		//need to follow "Red-black" Tree concept
		//The root is Black
		//All leaves(NIL) are Black
		//if node is Red, both children's are Black only
		//
		TreeMap<Integer, String> map1 = new TreeMap<Integer, String>();
		map1.put(1000, "Java");
		map1.put(2300, "DataBase");
		map1.put(3000, "Science");
		map1.put(4000, "Tech");
		map1.put(11000, "English");

		System.out.println(map1);
        map1.forEach((k,v) -> System.out.println("key = " + k + "value = " + v));
        
        System.out.println(map1.firstKey()); //gives first key in treeMap 
        System.out.println(map1.lastKey()); //gives last key in treeMap

        Set<Integer> keylessthan3K = map1.headMap(3000).keySet(); //headMap method gives key are less then toKey() 
        System.out.println(keylessthan3K); //gives key whose values are less than 3K
        
        Set<Integer> keyGreater3k =  map1.tailMap(3000).keySet();
        System.out.println(keyGreater3k); //gives key whose values are more than 3K
        
        System.out.println("****************");
        
        TreeMap<String, Integer> userMap = new TreeMap<String, Integer>();
        userMap.put("James", 100);
        userMap.put("Tom",250);
        userMap.put("Pravin", 300);
        userMap.put("Caramal", 500);
        userMap.put("Lisa", 650);
        userMap.put("Albert", 700);
        userMap.put("Bobby", 400);
        
        userMap.forEach((k,v) -> System.out.println("key = " + k + "value = " + v));
        //TreeMap sorted the output alphabetically.
        
        //hashMap is used when we are not bothering about sorting order, TreeMap is used 
        //when sorting is required on basis of keys.
	}

}

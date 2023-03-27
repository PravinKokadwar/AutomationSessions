package MapInterface;

import java.util.HashMap;
import java.util.Map;

public class MapDemo3 {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		System.out.println("Initial list of elements: " + hm);
		
		hm.put(100, "DataBase");
		hm.put(101, "DataBase1");
		hm.put(102, "DataBase2");

		System.out.println("After invoking put() method ");
		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		hm.putIfAbsent(103, "DataBase3");
		
		System.out.println("After invoking putIfAbsent() method ");
		for (Map.Entry m : hm.entrySet()) 
		{
			System.out.println(m.getKey() + " " + m.getValue());
		}
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(104, "DataBase4");
		 
		map.putAll(hm);
		
		System.out.println("After invoking putAll() method ");
		for (Map.Entry m : map.entrySet()) 
		{
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

}

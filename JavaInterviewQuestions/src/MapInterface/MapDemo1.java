package MapInterface;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {

	public static void main(String args[]) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(100, "WWW");    // put element in Map.
		map.put(101, "BSD");
		map.put(102, "GMIL");
		//map.put(100, "AOPS");
		//map.put(300, null);
		
		//map.put(102, "GMIL"); // duplicate entry
		// Elements can traverse in any order
		
		for (Map.Entry m : map.entrySet()) 
		{
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

}

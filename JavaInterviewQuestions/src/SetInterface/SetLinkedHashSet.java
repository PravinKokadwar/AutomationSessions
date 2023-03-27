package SetInterface;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetLinkedHashSet {

	public static void main(String[] args) {
		Set<String> set2 = new LinkedHashSet<>();
		
		set2.add("Java");
		set2.add("MicroProcessor");
		set2.add("DB");
		set2.add("TOC");
		
		set2.add(null);
		set2.add("DB"); //duplicate entry
		// set2.add("TOC"); //duplicate entry

		System.out.println(set2);

	}

}

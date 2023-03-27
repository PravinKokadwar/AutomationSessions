package SetInterface;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo2 {

	public static void main(String[] args) {
		// SortedSet<String> set = new TreeSet<>();

		TreeSet<Integer> set = new TreeSet<Integer>();
		
		set.add(24);
		set.add(66);
		set.add(12);
		set.add(15);
		
		System.out.println("Initial TreeSet is " + set );
		
		 System.out.println("Lowest Value: " + set.pollFirst());
		 
		 System.out.println("Highest Value: " + set.pollLast());
		 
		
		
	}

}

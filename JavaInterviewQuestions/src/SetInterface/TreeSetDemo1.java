package SetInterface;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo1 {
	public static void main(String[] args) {

		// TreeSet class contains unique elements only like HashSet.
		// TreeSet class access and retrieval times are quite fast.
		// TreeSet class doesn't allow null element.
		// TreeSet class is non synchronized.
		// TreeSet class maintains Ascending order.

		//SortedSet<String> set = new TreeSet<>();
		TreeSet<String> al = new TreeSet<String>();
		
		al.add("Z-Associates");
		al.add("Intel");
		al.add("FaceBook");
		al.add("Whirlpool");
		// al.add(null);
		al.add("Instagram");
		al.add("JustDial");

		// Traversing elements

		Iterator<String> itr = al.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}

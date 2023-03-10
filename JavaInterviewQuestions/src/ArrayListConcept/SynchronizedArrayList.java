package ArrayListConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {

	public static void main(String[] args) {

		// 1.Synchronized ArrayList method is used in

		List<String> nameslist = Collections.synchronizedList(new ArrayList<String>());
		nameslist.add("Tom");
		nameslist.add("Steve");
		nameslist.add("Pravin");
		nameslist.add("Shivaji");
		nameslist.add("Shubham");

		// for to Add, remove values in upper nameslist, we don't need explicit
		// synchronization
		// but to fetch/traverse the values from this list - we have to use explicit
		// synchronization

		synchronized (nameslist) {

			Iterator<String> it = nameslist.iterator();

			while (it.hasNext()) {

				System.out.println(it.next());
			}

		}

		// 2. copyOnWriteArrayList - it's class

		CopyOnWriteArrayList<String> empList = new CopyOnWriteArrayList<String>();
		empList.add("Pravin");
		empList.add("Steve");
		empList.add("Lisa");
		empList.add("Jack");
		System.out.println(empList);

		Iterator<String> it = empList.iterator();
		while (it.hasNext()) {

			System.out.println(it.next());
		}

	}

}

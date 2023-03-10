package ListConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {

	public static void main(String[] args) {
		
		//How to synchronize the ArrayList in java ?? by using below 2 ways, 
		//1.Collections.synchronizedList
		//2.copyonWriteArrayList - it's class -- Thread Safe/Synchronized 

		// 1. Collections.synchronizedList 
		List<String> namesList = Collections.synchronizedList(new ArrayList<String>());
		namesList.add("Java");
		namesList.add("Python");
		namesList.add("Ruby");

		// for Add, Remove no need of Synchronization
		// To fetch/traverse the values from the list -- need to use explicit
		// synchronizaton

		synchronized (namesList) {

			Iterator<String> it = namesList.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());

			}
		}

		// 2.copyonWriteArrayList - it's class -- Thread Safe/Synchronized

		CopyOnWriteArrayList<String> empList = new CopyOnWriteArrayList<String>();
		empList.add("Tom");
		empList.add("Steve");
		empList.add("Lisa");
		
		//In this class,we don't need any explicit synchronization for any operation : add/remove/traverse

		Iterator<String> it = empList.iterator();
		while (it.hasNext()) {

			System.out.println(it.next());
		}

	}

}

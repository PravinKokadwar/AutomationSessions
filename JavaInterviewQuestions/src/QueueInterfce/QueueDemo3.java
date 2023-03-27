package QueueInterfce;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo3 {

	public static void main(String args[]) {
		
		PriorityQueue<String> queue = new PriorityQueue<String>();

		queue.add("Atos");
		queue.add("Compucom");
		queue.add("HCL");
		//queue.add(null); 
		queue.add("Syntel");
		queue.add("TCS");
		

		System.out.println("head:" + queue.element());

		// System.out.println("head:" + queue.peek());

		System.out.println("iterating the queue elements:");

		Iterator itr = queue.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		queue.remove();
		
		queue.poll();
		
		System.out.println("After removing two elements:");

		Iterator<String> itr2 = queue.iterator();

		while (itr2.hasNext()) 
		{
			System.out.println(itr2.next());
		}
	}

}
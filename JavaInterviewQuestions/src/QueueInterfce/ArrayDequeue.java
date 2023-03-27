package QueueInterfce;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeue {

	public static void main(String[] args) {
		// Creating Deque and adding elements
		Deque<String> deque = new ArrayDeque<String>();
		
		deque.add("Ravi");
		deque.add("Vijay");
		deque.add("Ajay");

		// Traversing elements

		for (String str : deque) {
			System.out.println(str);
		}
		
		System.out.println("----------");
		
		deque.remove("Ravi");
		
		System.out.println(deque);
		
		System.out.println("-----------");
		
		deque.removeFirst();
		System.out.println(deque);
		
		System.out.println("------------");
		
		deque.poll();
		
		System.out.println(deque);
		
		System.out.println("-------------");
		
		
	}

}

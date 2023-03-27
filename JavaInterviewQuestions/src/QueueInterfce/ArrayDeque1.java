package QueueInterfce;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDeque1 {

	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<String>();

		deque.offer("Samsung");
		deque.offer("LG");
		deque.add("iPhone");

		deque.offerFirst("Motorola");

		System.out.println("After offerFirst Traversal => ");

		for (String s : deque) 
		{
			System.out.println(s);
		}
		// deque.poll();
		// deque.pollFirst();//it is same as poll()

		deque.pollLast();
		
		System.out.println("After pollLast() Traversal...");
		
		for (String s : deque) 
		{
			System.out.println(s);
		}
	}

}

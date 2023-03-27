package QueueInterfce;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo4 {

	public static void main(String[] args) {

		Queue<Integer> que = new LinkedList<>();
				
		for (int i = 0; i < 5; i++)
			que.add(i);

		System.out.println("Elements of queue are :- " + que);
		int removedele = que.remove();
		System.out.println("removed element-" + removedele);

		System.out.println(que);
		// To view the head of queue
		int head = que.peek();
		
		System.out.println("head of queue-" + head);

		// Rest all methods of collection
		// interface like size and contains
		// can be used with this
		// implementation.
		int size = que.size();
		System.out.println("Size of queue-" + size);
	}

}

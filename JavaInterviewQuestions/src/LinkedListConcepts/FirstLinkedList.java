package LinkedListConcepts;

public class FirstLinkedList {

	Node head;

	// This class created for nodes which contains data + nextPointer
	class Node {

		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;

		}

	}

	public void printLinkedlist() {
		Node n = head;
		while (n != null) { // Loop will continue till last Node points to null
			System.out.println(n.data);
			n = n.next;

		}

	}

	public static void main(String[] args) {

		FirstLinkedList linkobj = new FirstLinkedList();

		// Mapping of first,second,third node to each other.
		Node first = linkobj.new Node(10);
		linkobj.head = first;

		Node second = linkobj.new Node(20);
		first.next = second;

		Node third = linkobj.new Node(30);
		second.next = third;

		linkobj.printLinkedlist();

	}

}

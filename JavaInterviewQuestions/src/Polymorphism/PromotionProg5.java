package Polymorphism;

public class PromotionProg5 {

	void show(int t) {

		System.out.println("This is int method");
	}

	void show(int... y) {
		System.out.println("Varargs method");
		// This method is used for to display no. of the element in the list.
		// This method is having least priority i.e. if no other method matched
		// then only varargs method will get chance.
	}

	public static void main(String args[]) {

		PromotionProg5 PP5 = new PromotionProg5();
		PP5.show(7);
		// PP5.show(34,43,57,79,69);
		PP5.show();
	}

}

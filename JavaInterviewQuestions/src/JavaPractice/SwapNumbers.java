package JavaPractice;

public class SwapNumbers {

	public static void main(String args[]) {

		/*
		 * int a = 10, b = 20; int c; c = a; a = b; b = c;
		 * 
		 * System.out.println("The value of a is" + ":" + a);
		 * System.out.println("The value of b is" + " : " + b);
		 */

		// ----------------- not using 3rd variables----------------

		int d = 10, e = 20;
		d = d + e; // 30 d=30;
		e = d - e; // 10
		d = d - e; // 20

		System.out.println("The value of d is" + ":" + d);
		System.out.println("The value of e is" + " : " + e);

	}

}

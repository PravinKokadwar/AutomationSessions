package ExceptionHandling;

public class Exception2 {

	public static void main(String args[]) {

		Exception2 obj2 = new Exception2();
		obj2.run();

	}

	void run() {
		try {
			int a = 100, b = 0, c;
			c = a / b;
			System.out.println(c);
		} catch (ArithmeticException e) {

			e.printStackTrace();
			
			//System.out.println(e);
		}
	}

}

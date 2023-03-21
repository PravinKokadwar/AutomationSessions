package ExceptionHandling;

public class Exception1 {
	int i, n = 5;

	public void calculate() {

		while (i <= n) {
			System.out.println(i);
			i++;
		}
	}

	public static void main(String args[]) {
		try {
			int a = 100, b = 0, c;
			c = a / b;
			System.out.println(c);
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("Exception handled");

		Exception1 E1 = new Exception1();
		E1.calculate();

	}

}

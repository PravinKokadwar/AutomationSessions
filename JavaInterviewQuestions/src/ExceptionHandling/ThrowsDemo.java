package ExceptionHandling;

public class ThrowsDemo {
	
	//Java "throws" keyword is used in the method signature to declare an exception 
	//which might be thrown by the function while the execution of the code.
	//Using "throws" keyword, we can declare both checked and unchecked exceptions. 
	//However, the "throws" keyword can be used to propagate checked exceptions only.
	//The "throws" keyword is followed by class names of Exceptions to be thrown.
	//"throws" keyword is used with the method signature.
	// ArithmeticException <> SQLException <> IOException <> 

	// defining a method
	public int divideNum(int m, int n) throws ArithmeticException {
		int div = m / n;
		return div;
	}

	public static void main(String[] args) {
		ThrowsDemo obj = new ThrowsDemo();
		try {
			System.out.println(obj.divideNum(45, 0));
		} catch (ArithmeticException e) {
			System.out.println("\nNumber cannot be divided by 0");
		}

		System.out.println("Rest of the code is getting executed");
	}

}

package ExceptionHandling;

public class ExceptionthrowDemo {

	// Throwing Unchecked Exception
	// Method to check if person is eligible to vote or not
	public static void validate(int age) {
		if (age < 18) {
			// throw Arithmetic exception if not eligible to vote
			throw new ArithmeticException("Person is not eligible to vote");
		} else {
			System.out.println("Person is eligible to vote!!");
		}
	}
	public static void main(String args[]) {
		// calling the method
		validate(13);
		System.out.println("Rest of the code");
	}

}

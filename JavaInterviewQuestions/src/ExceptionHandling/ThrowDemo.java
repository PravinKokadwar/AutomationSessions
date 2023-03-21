package ExceptionHandling;

public class ThrowDemo {

	//throw keyword throw the exception explicitly from a method or a block of code.
	//The throw keyword is followed by an instance of Exception to be thrown.
	//throw is used within the method.
	//We are allowed to throw only one exception at a time i.e. we cannot throw 
	//multiple exceptions.
	
	public void checkNum(int num) {
		if (num < 1) {
			throw new ArithmeticException("\n Number is negative, cannot calculate square");
		} else {
			System.out.println("Square of " + num + " is " + (num * num));
		}
	}

	public static void main(String[] args) {
		ThrowDemo obj = new ThrowDemo();
		obj.checkNum(6);
		System.out.println("Rest of the code");
	}

}

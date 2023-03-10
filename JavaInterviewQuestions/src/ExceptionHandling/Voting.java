package ExceptionHandling;

import java.util.Scanner;

class YoungerAgeException extends RuntimeException {

	YoungerAgeException(String msg) {

		super(msg);
	}

}

class Voting {

	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter your Age");
		int age = s.nextInt();

		try {

			if (age < 18) {

				// throw keyword can be used in Unchecked exception scenarios.
				//if programmer wants to create manual exception, then we can use throw keyword. 
				//throw keyword crates exception object after which it's passed to JVM.
				//If main method does not handle exception, then it goes to Default Exception Handler

				throw new YoungerAgeException("Your are not eligilble for voting");

			}

			else {

				System.out.println("You can vote successfully");
			}
		}

		catch (YoungerAgeException e) {

			e.printStackTrace();
		}
		System.out.println("Hello India");
	}
}
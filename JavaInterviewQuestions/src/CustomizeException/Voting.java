package CustomizeException;

class UnderAgeException extends Exception {

	UnderAgeException() {
		super("You are under age");

	}

	UnderAgeException(String message) {
		super(message);

	}

}

public class Voting {

	public static void main(String args[]) {

		int age = 54;

		try {
		if (age < 18) {

			//This program is for Customized exception which comes under Checked (Compile time) exception. 
			throw new UnderAgeException("You are not eligilbe for voting");
		}

		else {

			System.out.println("You can vote now");
		}}
		catch(UnderAgeException e)
		{
			
			e.printStackTrace();
		}
	}

}

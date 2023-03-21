package ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionthrowDemoChecked {
    // Program for Throwing Checked Exception.
	// function to check if person is eligible to vote or not.
	
	public static void method() throws FileNotFoundException {

		FileReader file = new FileReader("C:\\Users\\pravin-kokadwar\\Downloads\\RewardsCertificate.pdf");
		BufferedReader fileInput = new BufferedReader(file);

		throw new FileNotFoundException();

	}	
	public static void main(String args[]) {
		try {
			method();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Rest of the code");
	}

}

package Encapsulation;

class human {

	protected String stream;

	protected void display() {

		System.out.println("Hello, I am a " + stream + " Student");

	}

	// The protected access specifier protects the class methods and
	// members similar to the private access specifier. The main difference
	// is that the access is limited to the entire package,
	// unlike only a class with the private access specifier.

}

public class EncapTestProt extends human {

	public static void main(String[] args) {

		EncapTestProt ETP = new EncapTestProt();
		ETP.stream = "Computer Sciencs and Engineering";
		ETP.display();

	}

}

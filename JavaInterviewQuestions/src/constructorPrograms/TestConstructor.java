package constructorPrograms;

public class TestConstructor {

	// Constructor is used for object initialization.
	// Constructors return an instance of a class, so they can't have any other return values. 
	// Constructor must have No explicit return type.
	// Constructor cannot be abstract, static, final and synchronized.
	// It is called constructor because it constructs the values at the time of
	// object creation.
	// Java compiler creates a default constructor

	public TestConstructor() {

		System.out.println("Bike is running");
	}

	public static void main(String[] args) {

		TestConstructor TC1 = new TestConstructor();

	}

}

package constructorPrograms;

public class parameterizedConstructor {

	int id;
	String name;
	
    //The parameterized constructor is used to provide different values to distinct 
	//objects.
	
	parameterizedConstructor(int i, String s) {
		id = i;
		name = s;

	}

	void display() {

		System.out.println(id + "   " + name);
	}

	public static void main(String args[]) {

		parameterizedConstructor PC3 = new parameterizedConstructor(123, "Selenium");
		parameterizedConstructor PC4 = new parameterizedConstructor(234, "Programming");

		PC3.display();
		PC4.display();

	}

}

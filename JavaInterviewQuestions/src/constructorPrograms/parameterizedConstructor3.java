package constructorPrograms;

public class parameterizedConstructor3 {

	String name;
	int id;
     
	// program for Copying values without constructor.
	
	public parameterizedConstructor3(int i, String r) {

		name = r;
		id = i;

	}

	public parameterizedConstructor3() {

	}

	void display() {

		System.out.println(id + "   " + name);
	}

	public static void main(String args[]) {

		parameterizedConstructor3 PC6 = new parameterizedConstructor3(123, "Pravin");
		parameterizedConstructor3 PC7 = new parameterizedConstructor3();

		PC7.id = PC6.id;
		PC7.name = PC6.name;

		PC6.display();
		PC7.display();

	}

}

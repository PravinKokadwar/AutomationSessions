package constructorPrograms;

public class parameterizedConstructor {

	int id;
	String name;

	parameterizedConstructor(int i, String s) {
		id = i;
		name = s;

	}

	void display() {

		System.out.println(id + "   " + name);
	}

	public static void main(String args[]) {

		parameterizedConstructor PC3 = new parameterizedConstructor(123, "Pravin");
		parameterizedConstructor PC4 = new parameterizedConstructor(234, "Naveen");

		PC3.display();
		PC4.display();

	}

}

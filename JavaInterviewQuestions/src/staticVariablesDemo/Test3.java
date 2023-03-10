package staticVariablesDemo;

public class Test3 {

	static void display() {

		System.out.println("This is display method");
	}

	public static void main(String args[]) {

		/*
		 * Test3 obj3 = new Test3(); obj3.display();
		 */
		// due to static method, we don't need to create object of the class.

		Test3.display();
		// We can access other class static method by using classname.staticMethodname.
		Test4.show();

	}
}

class Test4 {

	static void show() {

		System.out.println("This is show method");
	}

}

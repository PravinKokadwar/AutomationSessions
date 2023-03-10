package staticVariablesDemo;

public class StaticNonstatic {

	static int age = 25;
	String name = "Ram";

	public static void main(String args[]) {

		// how to call static methods and variables
		// 1. direct calling
		sum();
		// 2. calling by class name

		StaticNonstatic.sum();
		
		//how to call non-static variables and methods
		StaticNonstatic obj = new StaticNonstatic();
		obj.sendMail();
		System.out.println(obj.name);

	}

	public void sendMail() {

		System.out.println("This is Non-static Send mail method");
	}

	public static void sum() {

		System.out.println("This is static Sum method");
	}

}

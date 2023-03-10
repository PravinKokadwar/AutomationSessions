package JavaPractice;

public class ConstructorOverloadProg {

	// class instance variables
	String name;
	int age;

	public ConstructorOverloadProg() {
		System.out.println("This is default constructor");
		System.out.println("============");

	}

	public ConstructorOverloadProg(int i) {
		System.out.println("This is second Parameterized constructor");
		System.out.println(i);
		System.out.println("============");

	}

	public ConstructorOverloadProg(int i, int j) {

		System.out.println("This is third Parameterized constructor");
		System.out.println(i + "   " + j);
		System.out.println("============");

	}

	public ConstructorOverloadProg(String name, int age) // this are local variables
	{
		this.name = name; // this.instanceVariable = localVariables
		this.age = age;
		System.out.println("This is fourth Parameterized constructor");

	}

	public static void main(String args[]) {

		ConstructorOverloadProg COP = new ConstructorOverloadProg();
		ConstructorOverloadProg COP1 = new ConstructorOverloadProg(100);
		ConstructorOverloadProg COP2 = new ConstructorOverloadProg(100, 200);
		ConstructorOverloadProg COP3 = new ConstructorOverloadProg("Pravin", 22);

		System.out.println(COP3.name);
		System.out.println(COP3.age);
	}

}

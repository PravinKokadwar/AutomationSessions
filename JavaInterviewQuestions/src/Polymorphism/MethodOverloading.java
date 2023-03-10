package Polymorphism;

public class MethodOverloading {
	// This is also called as Compile Time or Static Polymorphism.
	// Complier can handle this polymorphism.
	// Two methods within same class having Same name, different argument.
	// No.of args, Sequence of args, types of args should be different.

	void show(int i, String y) {

		System.out.println("100");
	}

	void show(String r, int q) {

		System.out.println("200");
	}
	
	void show(String r,String e) {
		
		System.out.println("300");
	}
	
	void show(int u, char p) {
		
		System.out.println("400");
	}

	public static void main(String[] args) {

		MethodOverloading MO = new MethodOverloading();
		MO.show("Automation", 8);
		System.out.println("=========");
		MO.show(5, "JavaPrograms");
		System.out.println("=========");
		MO.show(5, 'h');
		
	}

}

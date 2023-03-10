package Polymorphism;

class MethodOveridingDemo22 {

	void show(int y, float p) {
		System.out.println("This is parent method");
	}
}
//In method overriding, two method have same name, 
//defined in different class and having same argument
//No. of argument, sequence of argument,Type of argument should be same
//Most Imp: Need to use Inheritance concept. child class extends parent class.

class MethodOveridingDemo23 extends MethodOveridingDemo22 {

	void show(float i, int k) {
		System.out.println("This is child method");
	}

	public static void main(String[] args) {
		MethodOveridingDemo22 MOD22 = new MethodOveridingDemo22();
		
		MOD22.show(12,56.8f);
		
		System.out.println("===================");
		
		MethodOveridingDemo23 MOD23 = new MethodOveridingDemo23();
		MOD23.show(23.7f, 23);
	}
}

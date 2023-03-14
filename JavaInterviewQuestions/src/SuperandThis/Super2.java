package SuperandThis;

class Parent1 {

	//The super keyword is used to invoke an immediate parent class method.
	
	void display() {
		System.out.println("Parent method.");
	}
}

class Child1 extends Parent1 {

	void display() {
		System.out.println("Child method.");
	}

	void print() {

		super.display();
		// display method from child class
		display();
	}
}

public class Super2 {

	public static void main(String[] args) {
		// creating instance of child class
		Child1 obj = new Child1();
		obj.print();
	}

}

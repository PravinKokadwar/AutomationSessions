package SuperandThis;

//The super keyword is used to invoke an immediate parent class constructor.

class Parent3 {

	// parent class constructor
	Parent3() {
		System.out.println("This is parent class constructor.");
	}
}

class Child3 extends Parent3 {

	Child3() {
		// invoking parent class constructor
		super();
	}
}

public class Super3 {

	public static void main(String[] args) {
		
		Child3 obj = new Child3();
	}

}

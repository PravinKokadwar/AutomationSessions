package InterfaceDemo;

//Creating abstract class that provides the implementation of one method of 
//Human interface  
abstract class Nature implements Human {
	public void eat() {
		System.out.println("Human can eat food");
	}
}

//Creating subclass of abstract class, now we need to provide the implementation of 
//rest of the methods

class Behaviour extends Nature {
	public void walk() {
		System.out.println("Human can walk");
	}

	public void run() {
		System.out.println("Human can run");
	}

	public void sleep() {
		System.out.println("Human can sleep");
	}
}

class TestInterface5 {

	public static void main(String[] args) {

		Human HN = new Behaviour();
		HN.walk();
		HN.run();
		HN.eat();
		HN.sleep();

	}

}

package OOPsConcept.copy;

class Animal4 {

	// method in the superclass
	public void eat() {
		System.out.println("Dog can eat food quickly");
	}
}

// Dog inherits Animal
class Dog4 extends Animal4 {

	// overriding the eat() method
	@Override
	public void eat() {

		// call method of superclass
		
		super.eat();
		
		//Here, the super keyword is used to call the eat() 
		//method present in the superclass.
		
		System.out.println("Dog can eat food slowly");
	}

	// new method in subclass
	public void bark() {
		System.out.println("Dog can bark loudly");
	}
}

class Inheritance4 {
	public static void main(String[] args) {

		// create an object of the subclass
		Dog4 labrador = new Dog4();

		// call the eat() method
		labrador.eat();
		labrador.bark();
	}
}
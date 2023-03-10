package OOPsConcept.copy;

class Animal2 {

	// method in the superclass
	public void eat() {
		System.out.println("Dog can eat Veg");
	}
}

// Dog inherits Animal
class Dog2 extends Animal2 {

	// overriding the eat() method

	@Override
	public void eat() {
		System.out.println("Dog can eat Non-veg");
	}

	// new method in subclass
	public void bark() {
		System.out.println("Dog can bark");
	}
}

class Inheritance3 {
	public static void main(String[] args) {

		// create an object of the subclass
		Dog2 labrador = new Dog2();

		// call the eat() method
		labrador.eat();
		labrador.bark();
	}
}

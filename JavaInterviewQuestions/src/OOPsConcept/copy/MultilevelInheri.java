package OOPsConcept.copy;

//This is Multi Level Inheritance.
class plane {

	void fly() {
		System.out.println("Plane is in Air");
	}
}

class plane2 extends plane {

	void fly2() {

		System.out.println("Plane is in cloud");
	}
}

class plane3 extends plane2 {

	void fly3() {
		System.out.println("Plane is in monsoon");
	}
}

public class MultilevelInheri {
	public static void main(String[] args) {

		plane3 PL3 = new plane3();
		PL3.fly();
		PL3.fly2();
		PL3.fly3();

	}

}
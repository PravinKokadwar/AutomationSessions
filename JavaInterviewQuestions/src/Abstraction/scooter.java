package Abstraction;

abstract class Vehicle {
	
	abstract void start();
}

class car extends Vehicle {

	void start() {

		System.out.println("Car start with the keys");
	}

}

class scooter extends Vehicle {

	void start() {

		System.out.println("Scooter start with Kick");
	}

	public static void main(String[] args) {

	//	Vehicle VE = new car();
		
		Vehicle VE = new scooter();

		// car c= new car();
		// c.start();
		VE.start();

		System.out.println("================");

		// scooter sc = new scooter();
		// sc.start();

		Vehicle VE2 = new scooter();
		VE2.start();

	}
}
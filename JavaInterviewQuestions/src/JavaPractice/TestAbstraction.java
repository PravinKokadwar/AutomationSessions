package JavaPractice;

abstract class bike {

	bike() {

		System.out.println("Bike is created");
	}

	abstract void run();

	void changegear() {

		System.out.println("Gear changed");
	}
}

class honda extends bike {

	void run() {
		System.out.println("Running safely");
	}
}

public class TestAbstraction {

	public static void main(String args[]) {

		bike obj = new honda();
		obj.run();
		obj.changegear();
	}

}

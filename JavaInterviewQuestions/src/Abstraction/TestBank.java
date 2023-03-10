package Abstraction;

abstract class Bank {

	abstract int getRateOfInterest();
}

class SBI extends Bank {

	int getRateOfInterest() {
		return 8;
	}
}

class ICICI extends Bank {

	int getRateOfInterest() {

		return 9;
	}
}

class TestBank {

	public static void main(String[] args) {

		Bank B1;
		B1 = new SBI();

		System.out.println("SBI rate of Interest is: " + B1.getRateOfInterest() + "%");

		B1 = new ICICI();
		System.out.println("ICICI rate of Interest is:" + B1.getRateOfInterest() + "%");

	}

}

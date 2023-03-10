package JavaPractice;

abstract class Bank {

	abstract int getRateOfInterest();
}

class SBI extends Bank {

	int getRateOfInterest() {
		return 5;
	}}

	class PNB extends Bank {

		int getRateOfInterest() {
			return 10;
		}

	}

class TestBank {

	public static void main(String args[]) {

		Bank b = new SBI();
		Bank c = new PNB();

		System.out.println("Rate of intrest is" + b.getRateOfInterest() + "%");
		
		System.out.println("Rate of interest is" + c.getRateOfInterest() + "%");

	}
}

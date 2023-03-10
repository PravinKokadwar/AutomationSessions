package InterfaceDemo;

interface Bank {
	float rateOfInterest();
}

class SBI implements Bank {
	public float rateOfInterest() {
		return 9.15f;
	}
}

class PNB implements Bank {
	public float rateOfInterest() {
		return 9.7f;
	}
}

public class TestInterface2 {
	public static void main(String[] args) {
		Bank b = new SBI();
		System.out.println("SBI ROI is : " + b.rateOfInterest());
		
		Bank c = new PNB();
		System.out.println("PNB ROI is : " + c.rateOfInterest());
	}
}

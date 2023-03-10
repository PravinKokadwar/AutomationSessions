package OOPsConcept.copy;

class Mobile {

	void dial() {

		System.out.println("Please dial the number");
	}
}

class RingTone extends Mobile {

	void Ring() {

		System.out.println("The mobile is ringing");
	}
}

class HelloTune extends Mobile {

	void HelloT() {
		System.out.println("This is mobile HelloTune");
	}
}

public class HierarchicalInheri {

	public static void main(String[] args) {

		HelloTune HT = new HelloTune();
		HT.dial();
		HT.HelloT();
		// HT.RingTone(); // it will give us compile time error

	}
	
}

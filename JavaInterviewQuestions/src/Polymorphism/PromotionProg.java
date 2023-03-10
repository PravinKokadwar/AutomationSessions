package Polymorphism;

public class PromotionProg {
	
	void show(int i) {
		
		System.out.println("1000");
	}

	void show(String r) {
		
		System.out.println("2000");
	}
	
	public static void main(String args[]) {
		
		PromotionProg PP = new PromotionProg();
		
		// we are passing char in below method but program picked up first method outcome
		// Character is get promoted to integer (Automatic Promotion) happened.
		PP.show('r');
	}
	
	
}

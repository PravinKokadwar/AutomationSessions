package Polymorphism;

public class PromotionProg3 {

	void show(StringBuffer r) {

		System.out.println("StringBuffer method");
	}

	void show(String h) {

		System.out.println("string method");
	}

	public static void main(String args[]) {

		PromotionProg3 PP3 = new PromotionProg3();
		PP3.show("abt");
		System.out.println("======");
		PP3.show(new StringBuffer("art"));
		
		//PP3.show(null);  
		//In this case it will throw ambigeous error after running the program
	}

}

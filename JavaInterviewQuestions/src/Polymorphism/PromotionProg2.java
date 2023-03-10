package Polymorphism;

public class PromotionProg2 {

	void show(Object r) {
		//parent class
		
		System.out.println("140");
	}
	
	void show(String r) {
		//child class
		
		System.out.println("150");
	}
	
	public static void main(String args[]) {
		
		PromotionProg2 PP2 = new PromotionProg2();
		// In this program also, character is getting promoted to Object data type.
		
		//PP2.show('w');
		
		//As we know that, Object is parent class of all classes in java.
		//Compiler will always give precedence to child type argument then compared to parent type argument 
		PP2.show("Rainbow");
	}
	
}

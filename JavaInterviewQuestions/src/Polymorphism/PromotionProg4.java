package Polymorphism;

public class PromotionProg4 {
	
	
	void show(int e, float y) {
		
		System.out.println("int float method");
	}
	
	void show(float u, int p) {
		
		System.out.println("float int method");
	}
	
	public static void main(String args[]) {
		
		PromotionProg4 PP4 = new PromotionProg4();
		PP4.show(12.8f, 19);
		
		System.out.println("========");
		
		PP4.show(43, 23.8f);
		System.out.println("========");
		
		//PP4.show(12, 14);
		//In this method we can not convert int to float data type, program shows ambigous error
		
		//PP4.show(11.8f, 23.0f);
		//In this case, we are getting "No suitable method found for show(float, float);
	}
	
	
	
	

}

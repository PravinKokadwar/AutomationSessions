package JavaPractice;

public class OperatorExample {

	public static void main(String[] args) {

		/*
		 * int x = 10; System.out.println(x++); // 11 System.out.println(++x); //12
		 * System.out.println(x--); // 11 System.out.println(--x); //10
		 */		
		
		int a =10, b=-10;
		boolean c = true; 
		boolean d= false;
		System.out.println(~a);   //(minus of total positive value which starts from 0) 
		System.out.println(~b); //9 (positive of total minus, positive starts from 0)  
		System.out.println(!c);
		System.out.println(!d);
		
		System.out.println("========");
		
		// System.out.println(c);
		
		System.out.println("Program for left shift operators");
		System.out.println(10<<2); // 10*2^2 = 40
		System.out.println(10<<3); //10*2^3 = 60
		System.out.println(20<<2); //20*2^2 = 80
		System.out.println(15<<2); //15*2^2 = 60
		
		System.out.println("Program for right shift operators");
		System.out.println(10>>2); // 10/2^2 = 10/4 = 2
		System.out.println(20>>2); //20/2^2 = 20/4 = 5
		System.out.println(20>>3); //20/2^3 = 20/8 = 2
		
		System.out.println("========");
		
		
		
		
	}

}

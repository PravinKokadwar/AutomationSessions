package JavaPractice;

import java.util.Scanner;

public class ScannerPractice {

	public static void main(String args[]) {

		Scanner SC = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = SC.next();

		System.out.println("==========");

		System.out.println("Enter your Age");
		int age = SC.nextInt();

		System.out.println("=======");

		System.out.println("Enter your gender");
		char gender = SC.next().charAt(0);

		System.out.println("=======");

		System.out.println("Enter your phone no.");
		long phoneno = SC.nextLong();

		System.out.println("------------");
		
        System.out.println("Name"+ ":"+name);
        System.out.println("Age" + ":"  +age);
        System.out.println("Gender"+":"+gender);
        System.out.println("PhoneNo"+":"+phoneno);
		
		
	}

}

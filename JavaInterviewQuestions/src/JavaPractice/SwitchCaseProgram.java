package JavaPractice;

import java.util.Scanner;

public class SwitchCaseProgram {

	public static void main(String args[]) {

		Scanner SC = new Scanner(System.in);

		System.out.println("Enter the first no.");
		int no1 = SC.nextInt();

		System.out.println("Enter the Second no.");
		int no2 = SC.nextInt();

		System.out.println("Select Symbol(+,-,*,/)");
		String sym = SC.next();
		int result;
		switch (sym) {
		case "+":
			result = no1 + no2;
			System.out.println("Addition is : " + result);
			break;

		case "-":
			result = no1 - no2;
			System.out.println("Substraction is:" + result);
			break;

		case "*":
			result = no1 * no2;
			System.out.println("Multiplication is :" + result);
			break;

		case "/":
			result = no1 / no2;
			System.out.println("Division is :" + result);
			break;

		default:
			System.out.println("Invalid symbol");
			break;

		}

	}

}

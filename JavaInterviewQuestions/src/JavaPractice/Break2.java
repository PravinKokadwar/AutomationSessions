package JavaPractice;

import java.util.Scanner;

public class Break2 {

	public static void main(String[] args) {

		double number, sum = 0;

		Scanner input = new Scanner(System.in);

		while (true) {

			System.out.println("Enter the number :: ");

			// take double input from user
			number = input.nextDouble();

			// if the number is negative, loop terminates

			if (number < 0) {
				break;

			}
			sum = sum + number;
		}
		System.out.println("Sum " + sum);

	}

}

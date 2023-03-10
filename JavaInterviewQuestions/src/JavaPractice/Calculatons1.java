package JavaPractice;

public class Calculatons1 {

	void fact(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {

			fact = fact * i;
		}
		System.out.println("Factorial of number is : " + "  " +fact);
	}

	public static void main(String[] args) {
		new Calculatons1().fact(5);
	}

}

package JavaPractice;

public class Continue2 {

	public static void main(String[] args) {
		// for loop
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				// using continue statement
				continue;// it will skip statement where i==5.
			}
			System.out.println(i);
		}
	}

}

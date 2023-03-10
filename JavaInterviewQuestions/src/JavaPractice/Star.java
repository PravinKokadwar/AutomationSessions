package JavaPractice;

public class Star {

	public static void main(String args[]) {

		for (int i = 0; i <= 4; i++) { // row are always constant

			for (int j = 4; j >= 1; j--) { // columns depends on rows

				if (j > i) { 

					System.out.print(" * ");
				} else {

					System.out.print(" ");
				}
			}

			System.out.println();
		}
	}
}

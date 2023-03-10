package JavaPractice;

class A6 {
	public static void main(String args[]) {

		int i, j, row = 6;
		//i for rows, j for columns
		
		for (i = 0; i < row; i++) { //rows

			for (j = 2 * (row - i); j >= 0; j--) { // spaces

				System.out.print(" ");
			}
			for (j = 0; j <= i; j++) { //columns

				System.out.print("* ");
			}
			System.out.println();
		}

	}
}
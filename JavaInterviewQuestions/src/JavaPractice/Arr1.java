package JavaPractice;

public class Arr1 {

	public static void main(String[] args) {
		int[][] arr2 = { { 10, 20, 30, 40, 50 }, { 2, 4, 6, 8, 10 }, { 3, 6, 9, 12 } };

		/*
		 * System.out.println("The length of row 1:" + arr2[0].length);
		 * System.out.println("The length of row 2:" + arr2[1].length);
		 * System.out.println("The length of row 3:" + arr2[2].length);
		 */
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.println(arr2[i][j]);
			}

		}

	}

}

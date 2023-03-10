package JavaPractice;

public class BubbleSort {

	public static void main(String args[]) {

		int[] a = { 36, 11, 18, 22, 9, 67, 48, 31, 19 , 31, 1 };
		int temp;

		for (int i = 0; i < a.length; i++) // this loop is for counting elements in array
		{
			for (int j = 0; j < a.length - 1; j++) // this loop is for comparing adjustent elements
			{
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;

				}

			}

		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");

		}

	}

}

package JavaPractice;

import java.lang.reflect.Array;

public class TestArray {

	public static void main(String args[]) {

		String[] aMake = { "BMW", "HONDA", "SUZUKI", "TOYOTA", "TATA" };
		Print_Array(aMake);
	}

	private static void Print_Array(String[] array) {
		for (int i = 0; i <= array.length - 1; i++) {
			System.out.println("Printing all the values of the array" + "::" + array[i]);
		}

	}

}

package StringDemos;

public class PalandromeString {

	public static void main(String args[]) {

		String str1 = "India";
		String rev = "";

		for (int i = str1.length() - 1; i >= 0; i--) {

			rev = rev + str1.charAt(i);
		}

		if (str1.equals(rev)) {

			System.out.println("This is palandrome string");
		} else {

			System.out.println("This is not palandrome string");
		}
	}

}

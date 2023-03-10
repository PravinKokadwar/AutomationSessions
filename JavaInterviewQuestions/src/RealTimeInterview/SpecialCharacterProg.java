package RealTimeInterview;

public class SpecialCharacterProg {
	// Need to find special characters from the string.

	public static void main(String args[]) {
		String str1 = "wisdom@#$%";
		int count = 0;

		for (int i = 0; i < str1.length(); i++) {

			if (!Character.isDigit(str1.charAt(i)) && !Character.isLetter(str1.charAt(i))
					&& !Character.isWhitespace(str1.charAt(i)))

			{
				count++;
			}
		}

		if (count == 0) {

			System.out.println("Thare are no special characters in the string");
		} else {

			System.out.println("Special Charactrs found in given string and count is"+" >> "+ + count);
		}

	}
}

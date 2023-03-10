package RealTimeInterview;

public class findforString {

	// Objective of this program is to check for rotation of string.

	public static void main(String[] args) {

		String str2 = "ABCD";
		String str3 = "CDAB";

		if (isRotation(str2, str3)) {
			System.out.println("Rotation of string is present");
		}

		else {
			System.out.println("Rotation not found");
		}

	}

	public static boolean isRotation(String str2, String str3) {

		return (str2.length() == str3.length() && ((str2 + str2).indexOf(str3) != -1));

	}

}

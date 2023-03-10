package StringDemos;

public class MaxRepChar {

	public static void main(String args[]) {

		String str3 = "This is program for to find maximum repeated character in string";
		str3=str3.replaceAll("\\s", ""); //this method will remove all spaces in the string.
		
		int[] arr = new int[127]; // all mentioned character have value less then 127 ASCII values.

		for (int i = 0; i < str3.length(); i++) // this loop is used for traversing the above string i.e.abbccc till end

		{

			arr[str3.charAt(i)] = arr[str3.charAt(i)] + 1; // will add 1 in index position of the array

		}

		int max = -1;
		char c = ' ';

		for (int i = 0; i < str3.length(); i++) {

			if (max < arr[str3.charAt(i)]) {

				max = arr[str3.charAt(i)];
				c = str3.charAt(i);
			}
		}
		System.out.println("The maximum repeated character in the string is" + "::"+ c);
	}

}

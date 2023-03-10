package StringDemos;

public class Demo9 {

	public static void main(String args[]) {
		// This program is for String conversion methods uses.
		// toUpperCase(), toLowerCase(), valueOf(), toCharArray().

		String s = "CapiTal dElHi";

		// case conversion method

		System.out.println(s.toUpperCase());

		System.out.println("--------------");

		System.out.println(s.toLowerCase());

		System.out.println("--------------");

		// type conversion method.

		int a = 10, b = 20; // valueOf() method (static method) is used to convert any other data types to String()
						
		System.out.println(a + b);      //output will be 30
		
		System.out.println("--------------");
		
		String s1 = String.valueOf(a);    // here int values of 'a' get converted on String
		
		String s2 = String.valueOf(b);    // here int value of 'b' get converted to string

		System.out.println(s1 + s2);      //this operation will add this two strings

		System.out.println("--------------");

		char[] c = s.toCharArray();   //Used for convert existing string to new character array
		
		System.out.println(c);

		System.out.println("--------------");
	}
}

package StringDemos;

public class Demo6 {

	public static void main(String args[]) {
		String s = "India is great";

		System.out.println(s.subSequence(3, 8)); // it will take count from 3rd position till last position-1.

		System.out.println("-------------------");

		System.out.println(s.substring(4)); // will take count from 4th position onwards.

		System.out.println("-------------------");

		System.out.println(s.substring(2, 9)); // will print 2nd position to 8th position.

		System.out.println("--------------------");

		System.out.println(s.substring(0, 0));

		System.out.println("--------------------");

		System.out.println(s.subSequence(0, -1)); // negative flow (StringIndexOutOfBoundsException)

		System.out.println("--------------------");

	}

}

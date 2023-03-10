package StringDemos;

public class StringDemo2 {

	public static void main(String args[]) {

		byte[] b = { 101, 102, 103 }; // byte array defined with valid test data.

		String s2 = new String(b); // byte array can be passed in String constructor.
		System.out.println(s2);

		char[] c = { 'q', 'w', 'e' };
		String s3 = new String(c); // char array can be passed in String constructor.
		System.out.println(s3);

		/*
		 * Why char array is preferred over string for storing password ? String objects
		 * are stored in String Literal pool(SCP) for re-usability and garbage collection in
		 * not applicable in SCP. With an array, you can explictly wipe out data after you done with it.
		 * you can overwrite array with any new contents and password wont be present in system
		 */
		
	}

}

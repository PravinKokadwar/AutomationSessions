package ExceptionHandling;

public class IllegalArgumentException {

	public static void main(String[] args) {
		// String s set an empty string and calling getLength()
		
		String s = "";
		try {
			System.out.println(getLength(s));
		} catch (Exception e) {
			System.out.println("IllegalArgumentException caught");
		}

		// String s set to a value and calling getLength()
		
		s = "JavaProgramming";
		try {
			System.out.println(getLength(s));
		} catch (Exception e) {
			System.out.println("IllegalArgumentException caught");
		}

		// Setting s as null and calling getLength()
		
		s = null;
		try {
			System.out.println(getLength(s));
		} catch (Exception e) {
			System.out.println("IllegalArgumentException caught");
		}
	}

	// Function to return length of string s. It throws
	// IllegalArgumentException if s is null.
	
	
	public static int getLength(String s) throws Exception {
		if (s == null)
			throw new Exception("The argument cannot be null");
		return s.length();
	}

}

package StringDemos;

public class StringBufferDemo3 {

	public static void main(String args[]) {

		StringBuffer sb3 = new StringBuffer("Java programs");

		// System.out.println(sb3.insert(6, "TT"));

		// System.out.println(sb3.subSequence(3, 8));
		// System.out.println(sb3.substring(2, 7));

		sb3.ensureCapacity(100);
		System.out.println(sb3.capacity());

		/*
		 * StringBuffer sb4 = sb3.append("Higher");
		 * 
		 * System.out.println("-------");
		 * 
		 * System.out.println(sb3.equals(sb4));
		 * 
		 * System.out.println(sb3.capacity());
		 * 
		 * System.out.println(sb3.append("Hello"));
		 */
		// System.out.println(sb3.charAt(6));

		// System.out.println(sb3.delete(4, 9));

		// System.out.println(sb3.deleteCharAt(5));

	}

}

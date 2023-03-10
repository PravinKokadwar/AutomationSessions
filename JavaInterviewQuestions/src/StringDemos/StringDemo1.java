package StringDemos;

public class StringDemo1 {

	public static void main(String args[]) {

		String s = "Pravin"; // will create only 1 object i.e. in SCP
		String s1 = new String("Pravin"); // will create two object 1 in JHM(Java heap memory) and 1 in SCP.

		System.out.println(s1.charAt(3));
		
		System.out.println("abc");
		String cde = "cde";
		System.out.println("abc" + cde);
		String c = "abc".substring(2, 3);
		String d = cde.substring(1, 2);

	}

}

package StringDemos;

public class Demo7 {

	public static void main(String args[]) {
		
		
		String s1 = "This is String upation is program";
		
		System.out.println(s1.replace("s", "W"));    //it will replace s with W letter. We can't use regular expression in replace() method.
		
		System.out.println("--------------------");
		
		System.out.println(s1.replace("is", "was"));    //it will replace "is" with "was".
		
		System.out.println("--------------------");

		System.out.println(s1.replaceFirst("is", "has"));   //it will replace only first "is" with "has".
		
		System.out.println("--------------------");
		
		System.out.println(s1.replaceAll("is", "were"));
		
		System.out.println("--------------------");
		
		System.out.println(s1.replaceAll("is(.)", "could"));   //we can use regular expression in replaceAll() method
		
		System.out.println("--------------------");
		
		System.out.println(s1.replaceAll("is(.*)", "could"));   //we can use regular expression in replaceAll() method
		
		System.out.println("--------------------");
		
	}
}

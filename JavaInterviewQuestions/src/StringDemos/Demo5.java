package StringDemos;

public class Demo5 {
	
	public static void main(String args[]) {
		
		String s1 = "pravin";
		String s2 = "PRAVIN";
 		//if(s1.equals(s2))   // this method will upper/lower case things.
		//if(s1.compareTo(s2))
		if (s1.equalsIgnoreCase(s2)) // this method will ignore upper/lower case things.
		{
			
			System.out.println("Two string are equal");
		}		
		
		else {
			
			System.out.println("Two strings are not equal");
		}
	}
	

}

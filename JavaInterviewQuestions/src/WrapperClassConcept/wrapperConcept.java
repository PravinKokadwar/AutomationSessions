package WrapperClassConcept;

public class wrapperConcept {
	
	public static void main(String args[]) {
		
	 String a= "200";
	 char b = 'R';
	 System.out.println(a + 100);
	 
	 // data conversion from String to integer
	 int q = Integer.parseInt(a);
	 System.out.println(q+100);
	 System.out.println("==================");
	 
	 // data conversion from String to double integer
	 
	 String w = "20.00";
	 double e = Double.parseDouble(w);
	 System.out.println(e+10);
	 System.out.println("==================");
	 
	 //data conversion from String to boolean
	 String k= "true";
	 boolean t = Boolean.parseBoolean(k);
	 System.out.println(t);
	 
	 
	 
	 
		
		
	}

	
	
	
}

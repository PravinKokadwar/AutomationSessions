package StringDemos;

public class StringBufferDemo {

	public static void main(String args[]) {

		//String objects are Immutable while StringBuffer() objects are mutable(not creating new objects every time)
		
		StringBuffer sb2 = new StringBuffer();
		System.out.println(sb2.capacity());       //16 char. is default capacity of SB object.
		System.out.println("-----------");
		
		sb2.append("Jave is simple programming language");
		System.out.println(sb2.capacity());       //(16*2)+2 OR (16+1)*2
		
		System.out.println("------");
		
		sb2.append("India");
		System.out.println(sb2.capacity());
		
		
		
		 
		

	}

}

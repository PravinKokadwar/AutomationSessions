package ListInterfaceDemo;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class IteratorDemo {
	
	public static void main(String[] args) {
		
		List<String> courses = Arrays.asList("C", "C++", "PHP", "COBOL", "DB2");
		
		//basic for loop 
		for(int i=0;i<courses.size();i++) {
			System.out.println(courses.get(i));
		}
		
		//Advanced for-each loop
		for(String course:courses)
		{
			System.out.println(course);
		}
		
		//basic loop with iterator
		for (Iterator iterator = courses.iterator(); iterator.hasNext();) {
			String course = (String) iterator.next();
			System.out.println(course);
		}		
		
		
		
		
	}

}

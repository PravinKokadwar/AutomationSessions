package StringDemos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo10 {

	public static void main(String[] args) {

		/*
		 * List<String> liststr = Arrays.asList("abc", "def", "ghi"); String str =
		 * liststr.stream().collect(Collectors.joining(","));
		 * 
		 * System.out.println(str.toString());
		 */		
		
		
		/*
		 * String s = "Pravin Kokadwar";
		 * System.out.println("Substring starting from Index 6"+ s.substring(6));
		 * System.out.println("Substring starting from Index zero to sinxth" +
		 * s.substring(0,6));
		 */
		
		String text = new String("Hello, my name is pravin");
		
		String[] sentence = text.split("\\.");
		System.out.println(Arrays.toString(sentence));
		
		
		

	}

}

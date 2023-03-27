package ListInterfaceDemo;

import java.util.ArrayList;
import java.util.List;

public class AccessElementsFromArrayListExample {
// How to check if an ArrayList is empty using isEmpty() method.
// How to find the size of an ArrayList using the size() method.
// How to access the element at a particular index in an ArrayList using get() method.
// How to modify the element at a particular index in an ArrayList using set() method.	

	public static void main(String[] args) {
		
		
		List<String> topProgrammingLanguages = new ArrayList<>();
		//check if an ArrayList isEmpty().
		System.out.println("Is the topProgrammingLanguages list empty ?" + topProgrammingLanguages.isEmpty());
		
		topProgrammingLanguages.add("Java");    //0
		topProgrammingLanguages.add("Ruby");    //1
		topProgrammingLanguages.add("Pearl");   //2
		topProgrammingLanguages.add("Python");  //3
		topProgrammingLanguages.add("GoLanguage"); //4
		//System.out.println(topProgrammingLanguages);
		System.out.println("=========");
		//find the Size of ArrayList.
		System.out.println("Top programming languages are : " + " "  + topProgrammingLanguages.size() + " " + "are the BEST");
		
		System.out.println("=========");
		// Retrieve the element at givem index.
		String bestProgrammingList = topProgrammingLanguages.get(3);
		System.out.println("bestProgrammingList =>" + bestProgrammingList);
		
		System.out.println("=========");
		
		//Modify element at given index.
		topProgrammingLanguages.set(3, "AI");
		System.out.println(topProgrammingLanguages);
		
	}

}

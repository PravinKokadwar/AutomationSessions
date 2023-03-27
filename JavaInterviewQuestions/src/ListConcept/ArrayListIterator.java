package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListIterator {

	public static void main(String args[]) {

		List<String> studentList = new ArrayList<String>();
		//ArrayList<String> studentList = new ArrayList<String>();
		studentList.add("Om");
		studentList.add("Shanti");
		studentList.add("Om");
		studentList.add("Shivay");

		Iterator<String> it = studentList.iterator();
		while (it.hasNext()) {

			System.out.println(it.next());
		}

	}

}

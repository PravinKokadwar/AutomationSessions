package ListConcept;

import java.util.ArrayList;

public class VirtualCapacity {

	public static void main(String args[]) {

		// virtual capacity of ArrayList is 10.
		// Physical capacity of ArrayList is Zero.

		ArrayList<Object> arobj = new ArrayList<Object>();

		System.out.println("The physical capacity of ArrayList is" + " : " + arobj.size()); // PC

		arobj.add(100);
		arobj.add("Selenium");
		arobj.add('r');
		arobj.add(true);

		System.out.println("The physical capacity of ArrayList is" + " : " + arobj.size()); // PC
		
		//How to change the VirtualCapacity of ArrayList
		//We can check virtualCapacity of ArrayList by using Debugging Mode of program.
		
		ArrayList<Object> arobj1 = new ArrayList<Object>(20);
		arobj1.add(1000);
		
		System.out.println("The VirtualCapacity of ArrayList is" + " : " +arobj1.size());

	}

}

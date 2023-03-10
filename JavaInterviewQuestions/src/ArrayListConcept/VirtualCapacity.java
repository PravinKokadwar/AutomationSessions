package ArrayListConcept;

import java.util.ArrayList;

public class VirtualCapacity {
	public static void main(String args[]) {
		// VirtualCapacity(VC) of ArrayList is 10, PhysicalCapacity(PC) is zero.
		ArrayList<Object> ar1 = new ArrayList<Object>();
		System.out.println("The initial PhysicialCapacity of ArrayList is  " + ">>" + " >> " + ar1.size());
        
		ar1.add(500);
		
		System.out.println("The size of ArrayList is" + ar1.size());
 		
		ar1.add(200);
		ar1.add(300);
		ar1.add(400);
		System.out.println("The size of ArrayList is" +ar1.size());
			}

}

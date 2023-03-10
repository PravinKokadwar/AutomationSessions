package OOPsConcept.copy;

public class Test1 {

	public static void main(String args[]) {

		// When same method is present in Parent class as well as in child class with
		// same name and same no.
		// of arguments, is called Method overriding or Runtime polymorphism or Dynamic polymorphism 

		// Static polymorphism >> compile time polymorphism
		
		BMW obj2 = new BMW();
		obj2.start();
		obj2.theftSafety();
		obj2.stop();
		obj2.refuel();

		System.out.println("********");

		Car obj1 = new Car();
		obj1.start();
		obj1.stop();
		obj1.refuel();

		System.out.println("********");
		
		Vehicle obj4 = new Vehicle();
		obj4.engine();
		
		System.out.println("********");
		
		//Top Casting
		
		Car c1 = new BMW(); //child class object can be referred by parent class reference variable >> Dynamic polymorphism >> Run time polymorphism
		c1.start(); // only common method will get inherited 
		c1.stop();
		c1.refuel();
		
		//Down casting >> throwing exception as "ClassCastException"
		/* BMW c2 = (BMW) new Car(); */
		
	}

}

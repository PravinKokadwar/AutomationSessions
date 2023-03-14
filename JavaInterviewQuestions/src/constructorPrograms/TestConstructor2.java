package constructorPrograms;

public class TestConstructor2 {

	//This are instance variable.
	int age;
	String name;
     
	// 0 and null values provides by default constructor.
	//method to display the value of age and name.
	//JVM creates default constructor and provide 0 and null values. 
	
	void display() {

		System.out.println(age + " " + name);
	}

	public static void main(String args[]) {

		TestConstructor2 TC2 = new TestConstructor2();
		TestConstructor2 TC3 = new TestConstructor2();
		//TestConstructor2 TC4 = new TestConstructor2();
		
		TC2.display();
		TC3.display();
		//TC4.display();
	}

}
package constructorPrograms;

public class parameterizedConstructor2 {

	String name;
	int emp_id;

	public parameterizedConstructor2(String name, int emp_id) {
		this.name = name;
		this.emp_id = emp_id;
		
		//this keyword is refercene variable for current class object.

	}
	
	void display() {
		
		System.out.println(name + "  " + emp_id);
	}

	public static void main(String args[]) {
		
		parameterizedConstructor2 PC4 = new parameterizedConstructor2("Nitin", 2340008);
		parameterizedConstructor2 PC5 = new parameterizedConstructor2("Prashant", 234556);
		
		PC4.display();
		PC5.display();

	}

}

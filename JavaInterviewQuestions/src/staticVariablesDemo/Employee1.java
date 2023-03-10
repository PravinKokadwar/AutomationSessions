package staticVariablesDemo;

public class Employee1 {

	int emp_id;
	String name;
	static String company = "HP";

	// due to static variable "company", it take only one time memory in class or method area.
	// it allocate memory while class loading time.
	// due to static variable, our program is memory efficient (take less memory).
	
	public Employee1(int emp_id, String name) {
		this.emp_id = emp_id;
		this.name = name;
	}

	void display() {
		System.out.println(emp_id + " " + name + " "+ company);

	}

	public static void main(String args[]) {

		Employee1 emp1 = new Employee1(100, "Ram");
		emp1.display();
		Employee1 emp2 = new Employee1(101, "Sham");
		emp2.display();
		Employee1 emp3 = new Employee1(102, "Shyam");
		emp3.display();

	}

}

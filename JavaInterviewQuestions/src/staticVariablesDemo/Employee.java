package staticVariablesDemo;

public class Employee {

	// company name is same for all 1000 of employess, so we will make variable as Static
	// un-necessary it take lot of memory in heap area of JVM so due to avoid it we use static variable.
	int emp_id;
	String name;
	String company;

	public Employee(int emp_id, String name, String company) {
		this.emp_id = emp_id;
		this.name = name;
		this.company = company;
	}

	void display() {

		System.out.println(emp_id + " " + name + " " + company);

	}

	public static void main(String args[]) {

		Employee e1 = new Employee(100, "Pravin", "HP");
        e1.display(); 
        Employee e2 = new Employee(101, "Amit", "HP");
        e2.display();
        Employee e3 = new Employee(102,"Sumit", "HP");
        e3.display();
	}

}

package JavaPractice;

public class sampleConstructor {

	String name; // this are instance variable.
	int emp_id;
	
	public sampleConstructor(String name, int emp_id) {
		this.name = name;
		this.emp_id = emp_id;
		
		//constructor is mainly used for object initialization. 
	}

	public static void main(String[] args) {

		sampleConstructor con1 = new sampleConstructor("Pravin", 100);
		sampleConstructor con2 = new sampleConstructor("John", 200);
		
		System.out.println("Employee1"+ " "+" >> " + con1.name + " "+ " >> " +  con1.emp_id);
		System.out.println("Employee2"+ " "+ " >> " +  con2.name + " "+ " >> " + con2.emp_id);
		
		
	}

}

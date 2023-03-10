package JavaPractice;

class Student77 {

	// this are instance variables
	int rollno;
	String name, course;
	float fee;

	// this is parameterized constructor
	Student77(int rollno, String name, String course) {
		this.rollno = rollno; //this.instance variable = local variables
		this.name = name;
		this.course = course;
	}

	Student77(int rollno, String name, String course, float fee) {
		/*
		 * this.rollno = rollno; this.name = name; this.course = course; this.fee = fee;
		 */
		this(rollno, name, course);
		this.fee = fee;
	}

	void display() {

		System.out.println(rollno + "::" + name + "::" + course + "::" + fee);
	}
	
	void display1() {
		
		System.out.println(rollno+ "::" + name + "::" + course );
	}

}

class Student {

	public static void main(String args[]) {

		Student77 STD77 = new Student77(100, "Pravin", "Computer");
		Student77 STD78 = new Student77(101, "Roy", "IT", 4500f);

		STD77.display1();
		STD78.display();

	}

}
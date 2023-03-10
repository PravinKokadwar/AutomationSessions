package Encapsulation;

class Test6 {

	private int emp_id;

	// We can achieve Encapsulation by declaring all variables as private only.
	// Mechanism by which variables and methods bind together as single unit.

	public void setEmp_ID(int emp_ID1) {

		// this method is used for to set new value for the variable.
		emp_id = emp_ID1;

	}

	public int getEmp_ID() {
		// this method is used for to retrieve the value of the variables.

		return emp_id;
	}
}

class Test5 {

	public static void main(String args[]) {

		Test6 T4 = new Test6();

		T4.setEmp_ID(1001);

		System.out.println(T4.getEmp_ID());

	}

}
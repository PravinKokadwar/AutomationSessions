package staticVariablesDemo;

class Test03 {

	// static variable always belongs to class not an object.
	// static variable is used for memory management. 

	static int i = 10; 
}

class Test02 {

	public static void main(String args[]) {
		// we can use static variables using class object only.

		System.out.println(Test03.i);

	}

}

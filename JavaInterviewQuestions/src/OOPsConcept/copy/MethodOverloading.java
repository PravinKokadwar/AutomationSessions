package OOPsConcept.copy;

public class MethodOverloading {

	public static void main(String args[]) {
		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(10, 20);
		obj.sum(15.55);

	}

	public static void main(int r) {

	}

	public static void main(int r, int t) {

	}
	// Method overloading >> when method name is same with different argument within same class.
	// We cannot create method inside other method.
	// Duplicate methods (same method name with same no. of argument) are not
	// allowed.
	// This is called as Compile time polymorphism
	// main method can be overloaded

	public void sum() {

		System.out.println("Sum mehtod >> Zero Parameters");
	}

	public void sum(int w) {
		System.out.println("The Sum method with 1 input parameters");
		System.out.println(w);
	}

	public void sum(double e) {
		System.out.println("The sum method with 1 double input parameter");
		System.out.println(e);

	}

	public void sum(int r, int t) {
		System.out.println("The sum method with 2 input parameters");
		System.out.println(r + t);
	}

}

package staticVariablesDemo;

public class MultipleStaticBlocks {

	static {

		System.out.println("This is first static block");
	}

	static {

		System.out.println("This is second static block");
	}

	public static void main(String args[]) {

		System.out.println("I'm in main method");
	}

}

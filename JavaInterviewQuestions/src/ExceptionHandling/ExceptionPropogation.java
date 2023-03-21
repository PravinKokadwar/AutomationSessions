package ExceptionHandling;

public class ExceptionPropogation {

	//Exception can be handled in any method in call stack either in the main() method, 
	//p() method, n() method or m() method.
	
	void m() {
		int data = 50 / 0; //this is exception line.
	}

	void n() {
		m();
	}

	void p() {
		try {
			n();
		} catch (Exception e) {
			System.out.println("exception handled");
		}
	}

	public static void main(String args[]) {
		
		ExceptionPropogation obj = new ExceptionPropogation();
		obj.p();
		System.out.println("Normal flow");
	}

}

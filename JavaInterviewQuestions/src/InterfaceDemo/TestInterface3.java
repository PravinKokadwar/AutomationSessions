package InterfaceDemo;

interface Printable {
	void print();
}

interface Showable {
	void show();
}

class TestInterface3 implements Printable, Showable {
	public void print() {
		System.out.println("Java Support");

	}

	public void show() {
		System.out.println("Multiple Inheritance by using Interface");
	}
	
	public static void main(String[] args) {
		TestInterface3 TI3 = new TestInterface3();
		TI3.print();
		TI3.show();
	}

}

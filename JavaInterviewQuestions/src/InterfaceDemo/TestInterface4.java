package InterfaceDemo;

interface Print1 {
	void print();
}

interface Show1 extends Print1 {
	void show();
}

class TestInterface4 implements Show1 {
	public void print() {
		System.out.println("Java support");
	}

	public void show() {
		System.out.println("Multiple Inheritance easily");
	}

	public static void main(String[] args) {
		TestInterface4 obj = new TestInterface4();
		obj.print();
		obj.show();
	}

}

package JavaPractice;

class TestRectangle {

	int length;
	int width;

	void insert(int l, int w) {

		length = l;
		width = w;
	}

	void calculateArea() {
		System.out.println(length * width);
	}
}

class Rectangle {

	public static void main(String args[]) {
		TestRectangle R1 = new TestRectangle();
		TestRectangle R2 = new TestRectangle();

		R1.insert(10, 25);
		R2.insert(13, 15);

		R1.calculateArea();
		R2.calculateArea();

	}
}

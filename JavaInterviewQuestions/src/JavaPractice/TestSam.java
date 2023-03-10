package JavaPractice;

class TestSam {
	
	void method1(TestSam obj) {
		
		System.out.println("Method is invoked");
	}
 void print() {
	 
	 // this keyword is used to pass as an argument in the method. it's mainly used in event handling
	 method1(this);
 }
 
 public static void main(String args[]) {
	 
	 TestSam TS = new TestSam();
	 TS.print();
	 
 }
}

package JavaPractice;

public class Addition {

	String Name = "CompuCom";
	int ID = 101;

	void display() {

		System.out.println(Name + " " + ID);

	}

	void display2() {
		String Name = "Krishna";
		int ID = 200;

		System.out.println(Name + " " + ID);
	}

	public static void main(String args[]) {

		Addition ADD = new Addition();
		ADD.display();
		ADD.display2();

	}

}

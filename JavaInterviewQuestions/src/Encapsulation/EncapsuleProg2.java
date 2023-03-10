package Encapsulation;

class Person {

	private int age;
	// always use Private access modifier for hiding the variable values.
	//need to use Getter (retrieve value) and Setter (Set new value and update value) method. 

	public int getAge() {

		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

public class EncapsuleProg2 {

	public static void main(String args[]) {

		Person pr = new Person();

		pr.setAge(25);

		System.out.println("My current age is" + " " + pr.getAge());

	}

}

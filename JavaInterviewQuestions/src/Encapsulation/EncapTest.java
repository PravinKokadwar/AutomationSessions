package Encapsulation;

class Student {

	private int rank;

	//private access The private access specifier provides access to 
	//the data members, and the data methods limit to the class itself.
	
	
	public int getRank() {

		return rank;

	}

	public void setRank(int rank) {

		this.rank = rank;

	}

}

public class EncapTest {

	public static void main(String[] args) {

		Student S1 = new Student();
		S1.setRank(100);
		System.out.println("Student rank is" + S1.getRank());

	}

}

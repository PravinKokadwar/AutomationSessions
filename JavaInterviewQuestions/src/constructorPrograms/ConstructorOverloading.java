package constructorPrograms;

public class ConstructorOverloading {

	int id;
	String name;
	int Payment;

	public ConstructorOverloading(int k, String r) {

		id = k;
		name = r;

	}

	public ConstructorOverloading(int k, String r, int t) {
		id=k;
		name=r;
		Payment = t;
		
	}
	
	void display() {
		System.out.println(id+" "+name+"  "+ Payment);
	}
	
	public static void main(String[] args) {
		
		
		ConstructorOverloading CO = new ConstructorOverloading(100, "Java");
		
		CO.display();
		
		ConstructorOverloading CO1 = new ConstructorOverloading(200, "Selenium", 2000);
		CO1.display();
		
	}
	
	
}

package CloneDemo;

public class ShallowDemo implements Cloneable {

	int id;
	String name;

	public ShallowDemo(int id, String name) {
		super();
		this.id = id;
		this.name = name;

	}
    
	public String voice() {
		return "ShallowDemo [id = " + id + ",  name = " + name + "]";
	}

	public static void main(String args[]) throws CloneNotSupportedException   {

		ShallowDemo SD = new ShallowDemo(100, "Pravin");
		System.out.println("ob1" + SD);
		
		ShallowDemo SD2 = (ShallowDemo) SD.clone();
		System.out.println("ob2" + SD2);

	}

}

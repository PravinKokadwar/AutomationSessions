package CloneDemo;

public class Student implements Cloneable {
	
	//This program is for Deep clone where we clone object with Address(reference) also.
	
	int id;
	String name;
	Address add;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Student Object1 = (Student) super.clone();
		Object1.setAdd((Address) Object1.getAdd().clone());
		return Object1;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", add=" + add + "]";
	}

	public static void main(String[] args) throws CloneNotSupportedException {

		Address add = new Address();
		add.setCity("Pune");
		add.setPin(412207);

		Student s = new Student();
		s.setId(1);
		s.setName("Pravin");
		s.setAdd(add);

		System.out.println(s);
		Student s1 = (Student) s.clone();
		s1.add.setCity("Pune");
		System.out.println(s1);

	}

}

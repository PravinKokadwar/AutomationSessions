package Encapsulation;

public class Account {

	//private data members.
	
	private long Acc_No;
	private String name, email;
	private float amount;

	//public getter/setter method.
	
	public long getAcct_no() {

		return Acc_No;
	}

	public void setAcct_No(long Acc_No) {
		this.Acc_No = Acc_No;

	}

	public String getName() {

		return name;

	}

	public void setname(String name) {

		this.name = name;
	}

	public String getEmail() {

		return email;
	}

	public void setemail(String email) {
		this.email = email;

	}

	public float getamount() {
		return amount;
	}

	public void setamount(float amount) {
		this.amount = amount;
	}

}

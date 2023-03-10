package Encapsulation;

public class TestEncapsulation {

	public static void main(String[] args) {
		// creating instance of Account class
		Account ACCT = new Account();

		// setting values through setter methods.

		ACCT.setAcct_No(123456);
		ACCT.setname("John");
		ACCT.setemail("John1@yahoo.com");
		ACCT.setamount(1000f);

		// getting values through getter methods.

		System.out
				.println(ACCT.getAcct_no() + "==" + ACCT.getName() + "==" + ACCT.getEmail() + "==" + ACCT.getamount());
	}
}

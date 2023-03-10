package OOPsConcept.copy;

public class HSBCBank implements USBank, BrazilBank { 
	
	//we are achieving multiple inheritance (HSBCBank class inherit all methods from USBank and BrazilBank interface) 
	// called IS-a relationship
	//If class is implementing any Interface, then it's mandatory to define/override all the methods of Interface.

	//below 3 methods are overriding from interface USBank
	
	public void credit() {

		System.out.println("HSBC Credit");
	}

	public void debit() {
		System.out.println("HSBC Debit ");

	}

	public void transferMoney() {
		System.out.println("HSBC transferMoney");

	}

	//Below 2 methods are separate HSBCBank class (own) methods
	
	public void carLoan() {

		System.out.println("HSBCBank Car loan department");
	}

	public void educationLoan() {

		System.out.println("HSBCBank educationLoan department");
	}
	
	//Accessing method form BrazilBank interface.
	
	public void BrazilBank() {
		System.out.println("This is Brazil Bank mutualFund method");
	}

	@Override
	public void BrazilmutualFund() {
		// TODO Auto-generated method stub
		
	} 
	

}

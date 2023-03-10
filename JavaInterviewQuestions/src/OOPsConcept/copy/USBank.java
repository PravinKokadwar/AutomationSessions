package OOPsConcept.copy;

public interface USBank {

	int min_bal = 500;

	public void credit();

	public void debit();

	public void transferMoney();

	// Interface contains only method declaration
	// No method body allowed, only method prototype
	// In interface we can declare variables, variables are by default static in nature
	// Variable values are not changed, it's final/constant in nature
	// No static method in interface
	// No Main method in interface
	// We cannot create the object of interface
	// Interface are abstract in nature - 100% Abstraction 

}

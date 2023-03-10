package OOPsConcept.copy;

public class Test2 {

	public static void main(String args[]) {

		
		System.out.println(USBank.min_bal);
		
		//USBank.min_bal = 500; We cannot change Interface USBank integer value once defined, it's final
		
		HSBCBank HB = new HSBCBank();
		HB.credit();
		HB.debit();
		HB.transferMoney();
		HB.carLoan();
		HB.educationLoan();

		// Runtime polymorphism >> Dynamic polymorphism
		// child class can be referred by parent class reference variable

		USBank UB = new HSBCBank();
		UB.credit();
		UB.debit();
		UB.transferMoney();

	}

}

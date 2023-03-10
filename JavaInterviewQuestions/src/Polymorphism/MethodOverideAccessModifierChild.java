package Polymorphism;

//Child class method accessibility (protected is less, public is more ) should be more as compared to Parent class.
//overridden method (child class) access modifier should be greater then parent class access modifier.

class MethodOverideAccessModifierParent {

	protected void show() {
		System.out.println("This is parent class");

	}

}

class MethodOverideAccessModifierChild extends MethodOverideAccessModifierParent {

	public void show() {

		System.out.println("This is child class");
	}

	public static void main(String args[]) {
		MethodOverideAccessModifierParent MOAMP = new MethodOverideAccessModifierParent();
		MOAMP.show();

		MethodOverideAccessModifierChild MOAMC = new MethodOverideAccessModifierChild();
		MOAMC.show();

	}
}

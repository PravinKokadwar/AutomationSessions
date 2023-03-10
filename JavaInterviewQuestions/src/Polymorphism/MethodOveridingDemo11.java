package Polymorphism;

class MethodOveridingDemo12 {

	Object show() {

		System.out.println("This is Parent(Super) class");
		return null;
	}
}

//Jave 5.0 onwards it's possible to have different retrun type for a overiding
//method in child class but child class return type should be sub-type of parent 
//class return type. This is called as Covarent Return Type for example "Object" is parent 
//class of all class in java and String, StringBuffer, StringBuilder, Number, Character, Boolean, Void etc comes under it. 

class MethodOveridingDemo11 extends MethodOveridingDemo12 {

	String show() {
		System.out.println("This is Child(Sub-class) class");
		return null;
	}

	public static void main(String args[]) {

		MethodOveridingDemo12 MOD12 = new MethodOveridingDemo12();
		MOD12.show();
		
		MethodOveridingDemo11 MOD11 = new MethodOveridingDemo11();
		MOD11.show();
		
	}

}

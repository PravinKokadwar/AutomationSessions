package StringDemos;

public class Demo4 {

	public static void main(String args[]) {

		String name = null;
		if (name.isEmpty()) {

			//isEmpty() method is not valid for empty string. 
			
			System.out.println("The name is empty");
		} else {

			System.out.println("The name is not empty");
		}

	}

}

package ExceptionHandling;

public class ArrayIndexOutOfBoundsException {

	public static void main(String[] args) {
		// array of subjects. There are 5 elements.
		String[] subjects = { "Java", "Python", "Ruby", "C++", "PHP" };

		// for loop iterates from 0 to 5 (length of array)
		for (int i = 0; i <= subjects.length; i++) {
			// when ‘i’ reaches 5, it becomes invalid index and exception will be thrown
			System.out.print(subjects[i] + " ");
		}

		
		
	}
}

package JavaPractice;

public class student2 {

	public static void main(String[] args) {

		String address = "Delhi, India";

		if (address.endsWith("India")) {
			if (address.contains("Meerut")) {

				System.out.println("Your city is Meerut");
			} else if (address.contains("Noida"))

			{
				System.out.println("Your city is Noida");

			} else {

				System.out.println(address.split(",")[0]);
			}
		} else {

			System.out.println("you are not living in INDIA");
		}

	}

}

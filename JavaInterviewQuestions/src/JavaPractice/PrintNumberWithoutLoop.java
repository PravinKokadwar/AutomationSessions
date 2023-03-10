package JavaPractice;

public class PrintNumberWithoutLoop {

	// print 1 to 100 without using any loop

	public static void main(String args[]) {
         printNum(1);
	}

	//1. Recursive function 
	public static void printNum(int num) {

		if (num <= 100) {
			System.out.println(num);
			num++;
			printNum(num);

		}
	}

}

package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class ReadandWrite {

	void ReadFile() throws FileNotFoundException {
		//throws keyword can be used for compile time (Checked) exception.	
		//It will give alert message to caller method (here PSVM() method) about exception need to handle by 
		//using try-catch block. 

		FileInputStream fis = new FileInputStream("c:/abc.txt");

	}

	void WriteFile() throws FileNotFoundException {

		String text = "this is demo program";
		FileOutputStream fos = new FileOutputStream("c:/abd.txt");

	}

}

class Test7 {

	public static void main(String args[]) {

		ReadandWrite rw = new ReadandWrite();
		try {
			rw.ReadFile();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			rw.WriteFile();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println("This is throws programs");

	}

}

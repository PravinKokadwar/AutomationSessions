package ThreadJoinDemo;

public class SingleTaskMultipleThread extends Thread {

	public void run() {

		System.out.println("This is second way of creating thread");
	}

	public static void main(String args[]) {

		SingleTaskMultipleThread thrd11 = new SingleTaskMultipleThread();
		thrd11.start();   // this method will execute run() method.

		SingleTaskMultipleThread thrd12 = new SingleTaskMultipleThread();
		thrd12.start();    // this method will execute run() method second time.
		                   // We can create any no. on thread here

	}

}

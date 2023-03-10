package ThreadJoinDemo;

public class ThreadSleepDemo2 extends Thread {

	public void run() {

		System.out.println("This program is for using methods to run thread");

		try {

			for (int i = 0; i <= 5; i++) {
				System.out.println(i + " : " + Thread.currentThread().getName());
				Thread.sleep(2000);
             //Sleep() method throw interrupted exception.
			}

		}

		catch (Exception e) {

			System.out.println(e);

		}
	}

	public static void main(String args[]) {

		ThreadSleepDemo2 demo2 = new ThreadSleepDemo2();
		// demo2.start();
		demo2.run(); // We cannot use method to run thread as it doesn't run threads simultaneously.

		ThreadSleepDemo2 demo3 = new ThreadSleepDemo2();
		// demo3.start();
		demo3.run();  // We cannot use method to run thread as it doesn't run threads simultaneously.  
	}
}

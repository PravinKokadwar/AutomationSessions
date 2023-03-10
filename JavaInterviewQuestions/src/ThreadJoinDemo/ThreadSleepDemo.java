package ThreadJoinDemo;

public class ThreadSleepDemo extends Thread {
	
	//This program is used for Multi-threading.
	//We cannot use method instead of methods.

	public void run() {

		System.out.println("This is first run of the program");

		try {

			for (int i = 0; i < 5; i++) {

				System.out.println(i + ":" + Thread.currentThread().getName());
				Thread.sleep(2000);
				//Sleep() method throw interrupted exception 
			}
		} catch (Exception e) {

			System.out.println(e);
		}
	}

	public static void main(String args[]) {
		

		ThreadSleepDemo demo1 = new ThreadSleepDemo();
		demo1.start();

		ThreadSleepDemo demo2 = new ThreadSleepDemo();
		demo2.start();

		ThreadSleepDemo demo3 = new ThreadSleepDemo();
		demo3.start();

	}

}
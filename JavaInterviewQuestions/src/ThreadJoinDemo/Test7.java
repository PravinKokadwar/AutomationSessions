package ThreadJoinDemo;

public class Test7 extends Thread {

	static Thread mainThread;

	public void run() {

		try {
			mainThread.join(); // This code of line will be used for wait for main thread to complete after which child thread will join main thread.
			for (int i = 0; i <= 5; i++) {

				System.out.println("Child thread: " + i);
				Thread.sleep(2000);
			}

		} catch (Exception e) {
			System.out.println(e);

		}
	}

	public static void main(String args[]) {

		mainThread = Thread.currentThread();
		Test7 obj = new Test7();
		obj.start();

		try {
			for (int i = 0; i <= 5; i++) {

				System.out.println("Main thread: " + i);
				Thread.sleep(2000);
			}

		} catch (Exception e) {
			System.out.println(e);

		}

	}

}
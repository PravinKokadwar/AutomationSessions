package ThreadJoinDemo;

public class SingleTaskSingleThread extends Thread {

	public void run() {

		System.out.println("This is task1");

	}

	public static void main(String args[]) {

		SingleTaskSingleThread thread1 = new SingleTaskSingleThread();
		thread1.start();

	}

}

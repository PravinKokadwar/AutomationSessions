package ThreadJoinDemo;

class MyThread extends Thread {

	public void run() {

		System.out.println("This is first task in list");

	}

}

public class SingleTaskSingleThread1 {

	public static void main(String args[]) {

		MyThread thrd1 = new MyThread();
		thrd1.start();    // this method will execute run() method.

	}

}

package ThreadJoinDemo;

class MyThread2 extends Thread {

	public void run() {

		System.out.println("This program is for single task multiple thread");
	}

}

public class SingleTaskMultipleThread1 {

	public static void main(String args[]) {

		MyThread2 thrd2 = new MyThread2();
		thrd2.start();

		System.out.println("----------------");

		MyThread2 thrd3 = new MyThread2();
		thrd3.start();

		System.out.println("----------------");

		MyThread2 thrd4 = new MyThread2();
		thrd4.start();
		
		System.out.println("----------------");

	}

}

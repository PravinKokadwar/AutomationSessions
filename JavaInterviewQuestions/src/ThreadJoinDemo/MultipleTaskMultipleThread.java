package ThreadJoinDemo;

class MyThread3 extends Thread {

	public void run() {

		System.out.println("This program is for Multiple Task and Multiple threads");
	}

}

class MyThread4 extends Thread {

	public void run() {

		System.out.println("This is second task");

	}
}

class MyThread5 extends Thread {

	public void run() {

		System.out.println("This is third task");
	}
}

public class MultipleTaskMultipleThread {

	public static void main(String args[]) {

		MyThread3 thrd3 = new MyThread3();
		thrd3.start();

		MyThread4 thrd4 = new MyThread4();
		thrd4.start();

		MyThread5 thrd5 = new MyThread5();
		thrd5.start();

	}

}

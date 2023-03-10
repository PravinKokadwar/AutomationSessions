package MethodofThreadClass;

public class DeamonThreadDemo extends Thread {

	public void run() {

		
		System.out.println(Thread.currentThread().isDaemon());
		System.out.println("Daemon Thread");

	}

	public static void main(String args[]) {

		// Thread.currentThread().setDaemon(true);

		System.out.println("Main thread");

		DeamonThreadDemo dem1 = new DeamonThreadDemo();
		dem1.setDaemon(true);   // here we can set main thread as Daemon thread.
		dem1.start();

	}

}

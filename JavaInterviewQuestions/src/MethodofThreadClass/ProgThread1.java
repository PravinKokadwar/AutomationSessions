package MethodofThreadClass;

public class ProgThread1 extends Thread {

	public void run() {

		Thread.currentThread().setName("First Thread");
		System.out.println("Thread task : " + Thread.currentThread().getName());

	}

	public static void main(String args[]) {

		System.out.println("Hello : " + Thread.currentThread().getName());

		ProgThread1 pgth = new ProgThread1();
		pgth.setName("Prog22");
		pgth.start();

		ProgThread1 pgth2 = new ProgThread1();
		pgth2.setName("Prog23");
		pgth2.start();
		
		System.out.println(Thread.currentThread().isAlive());

	}

}

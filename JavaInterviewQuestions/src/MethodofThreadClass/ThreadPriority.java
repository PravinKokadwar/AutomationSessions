package MethodofThreadClass;

public class ThreadPriority extends Thread {

	public void run() {

		System.out.println("Child Thread Priority is : " + " " + Thread.currentThread().getPriority());
		//Child thread always inherit priorities from Parent thread only.

	}

	public static void main(String args[]) {

		System.out.println("Main Thread old Priority" + " " + Thread.currentThread().getPriority());// y dafult main
																									// class priority is
																									// 5 only.
		Thread.currentThread().setPriority(8);
		
		/*
		 * Thread.currentThread().setPriority(MAX_PRIORITY);
		 * Thread.currentThread().setPriority(MIN_PRIORITY);
		 * Thread.currentThread().setPriority(NORM_PRIORITY);
		 */
		System.out.println("Main Thread new Priority" + " " + Thread.currentThread().getPriority());

		ThreadPriority TP = new ThreadPriority();
		TP.start();

	}

}

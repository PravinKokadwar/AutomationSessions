package ThreadJoinDemo;

public class YieldDemo extends Thread {

	public void run() {

		System.out.println("This is first method");

		for (int i = 0; i <= 5; i++) {

			System.out.println(i + " : " + Thread.currentThread().getName());
		}

	}

	public static void main(String args[]) {

		YieldDemo YD = new YieldDemo();
		YD.start();
        Thread.yield();   // it will stop main method and executed above methods.
		for (int i = 0; i <= 5; i++) {

			System.out.println(i + " : " + Thread.currentThread().getName());
		}

	}

}

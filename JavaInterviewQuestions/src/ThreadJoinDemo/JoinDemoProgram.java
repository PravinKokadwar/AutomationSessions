package ThreadJoinDemo;

class Medical extends Thread {

	public void run() {

		try {
			System.out.println("Medical tetst round start");
			Thread.sleep(3000);
			System.out.println("Medical tetst round Completed");

		}

		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class TestDriver extends Thread {

	public void run() {

		try {
			System.out.println("Test Driving  test round start");
			Thread.sleep(3000);
			System.out.println("Test Driving test round Completed");

		}

		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class OfficerSignature extends Thread {

	public void run() {

		try {
			System.out.println("Officer Signature  test round start");
			Thread.sleep(3000);
			System.out.println("Officer Signature test round Completed");

		}

		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
public class JoinDemoProgram {
	
	public static void main(String args[]) throws InterruptedException {
		
		Medical MD = new Medical();
		MD.start();
		
	    MD.join();   //This method will be used to wait Medical method to wait un-till TestDriver method complete it's task.
		
		TestDriver TD = new TestDriver();
		TD.start();
		
	    TD.join();   //This method will be used to wait TestDriver method to wait un-till OfficerSignature method complete it's task.
		
		OfficerSignature OS = new OfficerSignature();
		OS.start();
		
	}

}

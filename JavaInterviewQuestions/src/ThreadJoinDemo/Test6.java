package ThreadJoinDemo;

public class Test6 extends Thread {

	public void run() {
	
	try
	{

		for (int i = 0; i <= 5; i++) {

			System.out.println("Child Thread: " + i);
			Thread.sleep(2000);

		}
	}

	catch(Exception e)
	{

		System.out.println(e);
	} }

	public static void main(String args[]) throws InterruptedException {

		Test6 ts6 = new Test6();
		ts6.start();
		
		ts6.join(); // This will execute child thread first and then main thread will be executed.
		            // Main thread wait for child thread to be completed.
		
		
		
		try
		{
			
				for (int i=0;i<=5;i++) {
					
					System.out.println("Main Thread: " +i);
					Thread.sleep(2000);
					
				} }
				
				catch(Exception e) {
					
					System.out.println(e);
				}
		
		
	}
	} 

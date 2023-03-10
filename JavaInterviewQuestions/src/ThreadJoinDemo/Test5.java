package ThreadJoinDemo;

public class Test5 extends Thread {

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

	public static void main(String args[]) {

		Test5 ts5 = new Test5();
		ts5.start();
		
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

package multithreading;

public class ThreadExample5  implements Runnable{
	Thread t;
	ThreadExample5(){
		t=new Thread(this);
		System.out.println("music player is running  ");
		t.start();
		t.interrupt();
		
	}
	public void run()
	{
		try {
			while(true)
			{
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e) {
			System.out.println(" Received whatspp notification");
		}
	}
	public static void main(String args[])
	{
	new ThreadExample5(); 
	}
}

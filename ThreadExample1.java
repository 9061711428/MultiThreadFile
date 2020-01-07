package multithreading;

class Numbers extends Thread// extend Thread class
{
	public void run() 
	{
		for (int i = 0; i < 10; i++)

			System.out.println("Thread is running:" + i);

	}
}

class Numbers1 extends Thread {
	public void run() 
	{
		for (int i = 10; i < 20; i++)
			System.out.println("Thread2 is running:" + i);

	}
}

public class ThreadExample1 {
	public static void main(String args[]) 
	{
		Numbers thread1 = new Numbers();// invoke Numbers Class
		Numbers1 thread2 = new Numbers1();
		// Multi-threading
		thread1.start();
		thread2.start();

	}

}

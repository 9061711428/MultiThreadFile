package multithreading;

public class DeamonThreadExample2 extends Thread{
	public void run()
	{
		System.out.println("Thread name is :"+Thread.currentThread().getName());//Get Current Thread name
		System.out.println("Check if its DaemonThread :"+Thread.currentThread().isDaemon());
		
	} 
	public static void main(String args[])
	{
		DeamonThreadExample2 t1=new DeamonThreadExample2();
		DeamonThreadExample2 t2=new DeamonThreadExample2();
		t1.start();
		//Exception as the thread is already started
		t1.setDaemon(true);
		t2.start();
	}
}


package multithreading;

public class ThreadUsingInterface implements Runnable{
	public static void main(String args[])
	{
		ThreadUsingInterface  ts=new ThreadUsingInterface();
		Thread t1=new Thread(ts);//invoke Thread
		t1.start();//calling start(),automatically call run() method
				
	}
	public void run()
	{
		System.out.println("Am in run method by implementing runnable");
	}

}

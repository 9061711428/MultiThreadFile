package multithreading;
class Numberss implements Runnable{
	public void run()
	{
		for(int i=0;i<4;i++)
		{
			System.out.println(i);
		}
	}
	
}
public class MultithreadingExample2 {
	public static void main(String args[])
	{
		Runnable runnableobj=new Numberss();//can be reference of Runnable Interface
		Numberss obj1=new Numberss();
		Thread thread1=new Thread(runnableobj);//Invoke Threadclass constructor
		Thread thread2=new Thread(obj1);
		thread1.start();
		thread2.start();
		
	}
}

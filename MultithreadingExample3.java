package multithreading;
class Musicplayer extends Thread{//Musicplayer extends from Thread class
	public void run()
	{
		System.out.println("Music is playing");
	}
}
class Msword implements Runnable{//Msword implements from Runnable Interface
	public void run()
	{
		System.out.println("Typing Ms word ");
	}
}
public class MultithreadingExample3 {
	public static void main(String args[]) {
		Musicplayer thread1=new Musicplayer();
		Runnable runnableobj=new Msword();//can be reference of Runnable interface
		Thread thread2=new Thread(runnableobj);//invoke Threadclass
		thread1.start();
		thread2.start();
		
	}

}

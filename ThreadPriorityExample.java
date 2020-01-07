package multithreading;

public class ThreadPriorityExample extends Thread{
	public void run()
	{
		System.out.println("running thread name is :"+Thread.currentThread().getName());//Get Current Thread name
		System.out.println("running thread priority is :"+Thread.currentThread().getPriority());	//Get Current Thread priority
	}
	public static void main(String args[])
	{
		ThreadLocal <Number> obj_local=new ThreadLocal <Number>();//create ThreadLocal variable Number type
		ThreadLocal <String> obj=new ThreadLocal <String>();//create ThreadLocal variable String type
		obj_local.set(100);//set value to object using set() method
		System.out.println("value="+obj_local.get());//get value to object using get() method
		obj_local.set(90);
		System.out.println("value="+obj_local.get());
		obj.set("Java");
		System.out.println("value ="+obj.get());
		obj.remove();//remove value using remove() method
		System.out.println("value ="+obj.get());
		obj_local.remove();
		System.out.println("value="+obj_local.get());
		ThreadPriorityExample m1=new ThreadPriorityExample();
		ThreadPriorityExample m2=new ThreadPriorityExample();
		m1.setPriority(Thread.MIN_PRIORITY);//set MIN_PRIORITY
		m2.setPriority(Thread.MAX_PRIORITY);//set MAX_PRIORITY
		m1.start();
		m2.start();
	}

}

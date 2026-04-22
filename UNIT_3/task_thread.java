import java.util.*;
class thread1 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Good morning");
		}
	}
}
class thread2 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Good evening");
		}
	}
}

class task_thread
{
	public static void main(String[] args)
	{ 
		thread1 t1=new thread1();
		t1.start();
		thread2 t2=new thread2();
		t2.start();
	}
}
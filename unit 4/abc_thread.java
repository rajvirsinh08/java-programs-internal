import java.util.*;

// Thread A
class ThreadA extends Thread
{
	public void run()
	{
		for(int i=1; i<=20; i++)
		{
			System.out.println("A");
		}
	}
}

// Thread B
class ThreadB extends Thread
{
	public void run()
	{
		for(int i=1; i<=30; i++)
		{
			System.out.println("B");
		}
	}
}

// Thread C
class ThreadC extends Thread
{
	public void run()
	{
		for(int i=1; i<=15; i++)
		{
			System.out.println("C");
		}
	}
}

public class abc_thread
{
	public static void main(String[] args)
	{
		ThreadA t1 = new ThreadA();
		ThreadB t2 = new ThreadB();
		ThreadC t3 = new ThreadC();
		
		t1.start();
		t2.start();
		t3.start();
	}
}
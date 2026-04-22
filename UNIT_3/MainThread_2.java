class message
{
	synchronized void hello(int n)  //syncronize ek time p ek thread chalti h
		try
	{
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println(n+"X"+i+"="+(n*i));
				Thread.sleep(500);
			}
		}
		catch(Exception e)
		{
		}
	}
	synchronized void hi(int n)
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println(n+"X"+i+"="+(n*i));
				Thread.sleep(500);
			}
		}
		catch(Exception e)
		{	
		}
	}
	
}
class thread1 extends Thread
{
	message m;
	thread1(message m)
	{
		this.m=m;
	}
	public void run()
	{
		m.hello(2);
	}
}

class thread2 extends Thread
{
	message m;
	thread2(message m)
	{
		this.m=m;
	}
	public void run()
	{
		m.hi(5);
	}
}


class MainThread_2
{
	public static void main(String[] args) throws Exception
	{
		message m1=new message();
		thread1 t1=new thread1(m1);
		thread2 t2=new thread2(m1);
		t1.start();
		t2.start();
		
	}
}
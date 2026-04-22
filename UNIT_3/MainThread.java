class Threadone extends Thread
{
	public void run()
	{
		try
		{
			while(true)
			{
				System.out.println(Thread.currentThread().getName());
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Error");
		}	
	}
}

class Threadtwo extends Thread
{
	public void run()
	{
		try
		{
			while(true)
			{
				System.out.println(Thread.currentThread().getName());
				Thread.sleep(4000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Error");
		}		
	}
}


class MainThread
{
	public static void main(String[] args) throws Exception
	{
		Threadone t1=new Threadone();
		t1.setName("Thread-1");
		Threadtwo t2=new Threadtwo();
		t2.setName("Thread-2");
		System.out.println("thread status"+t1.isAlive());
		t1.start();
		t2.start();
		System.out.println("thread status"+t1.isAlive());
		System.out.println("Total Active thread"+ t1.activeCount());
		t1.interrupt();
	}
}
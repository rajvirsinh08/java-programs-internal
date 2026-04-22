class LifeCycleDemo extends Thread
{
	public void run()
	{
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println("Error");
		}	
	}
	public static void main(String[] args) throws Exception
	{
		LifeCycleDemo l1=new LifeCycleDemo();
		System.out.println("Thread created :"+l1.getState());
		l1.start();
		System.out.println("After Creation :"+l1.getState());
		
		System.out.println("Waiting Stage :"+l1.getState());
		l1.join();
		System.out.println("After sleep :"+l1.getState());
	}
}
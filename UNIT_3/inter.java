class Buffer
{
	int data;
	boolean available = false;
	
	synchronized void produce(int val)
	{
		while(available)
		{
			try
			{ wait(); }
			catch(Exception e){}
		}
		data=val;
		System.out.println("Produced:"+data);
		available=true;
		notify();
	}

	synchronized void consume()
	{
		while(!available)
		{
			try{
				wait();
			}
			catch(Exception e){}
		}
		System.out.println("Consumed:"+data);
		available=false;
		notify();
	}
}

class producer extends Thread
{
	Buffer b;

	producer(Buffer b)
	{
		this.b=b;
	}

	public void run()
	{
		for(int i=0;i<5;i++)
		{	
			b.produce(i);
		}
	}
}

class consumer extends Thread
{
	Buffer b;

	consumer(Buffer b)
	{
		this.b=b;
	}

	public void run()
	{
		for(int i=0;i<5;i++)
		{	
			b.consume();
		}
	}
}

class inter
{
	public static void main(String args[])
	{
		Buffer b=new Buffer();

		producer p=new producer(b);
		consumer c=new consumer(b);

		p.start();
		c.start();
	}
}
class Buffer 
{
    String message;
    boolean available = false;

    synchronized void send(String msg) 
	{
        while (available)
			{
            try 
			{
                wait();
            } 
			catch (Exception e) 
			{
                
            }
        }
        message = msg;
        System.out.println("Sender: " + message);
        available = true;
        notify();
    }

    synchronized void receive() 
	{
        while (!available)
			{
            try {
                wait();
            } 
			catch (Exception e)
			{
                
            }
        }
        System.out.println("Receiver: " + message);
        available = false;
        notify();
    }
}

class Sender extends Thread 
{
    Buffer b;

    Sender(Buffer b) 
	{
        this.b = b;
    }

    public void run() 
	{
        String[] msgs = {"hii", "hello","Bye"};
        for (String msg : msgs)
			{
            b.send(msg);
        }
    }
}

class Receiver extends Thread 
{
    Buffer b;

    Receiver(Buffer b)
	{
        this.b = b;
    }

    public void run() 
	{
        for (int i = 0; i <3; i++) 
		{
            b.receive();
        }
    }
}

public class InterThread1 
{
    public static void main(String[] args) 
	{
        Buffer obj = new Buffer();
        Sender s = new Sender(obj);
        Receiver r = new Receiver(obj);

        s.start();
        r.start();
    }
}

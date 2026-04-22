class Bank 
{
    int bal = 1000;

    synchronized void withdraw(int amt) 
	{
        System.out.println(Thread.currentThread().getName() + " wants to withdraw: " + amt);
        if (bal >= amt) 
		{
            try 
			{
                Thread.sleep(1000);
            } catch (Exception e) 
			{
                System.out.println(e);
            }
            bal = bal - amt;
            System.out.println(Thread.currentThread().getName() + " completed withdrawal. Remaining balance: " + bal);
        } else 
		{
            System.out.println("Insufficient balance for " + Thread.currentThread().getName());
        }
    }
}

class Thread1 extends Thread 
{
    Bank b;
    int amt;

    Thread1(Bank b, int amt, String name) 
	{
        super(name);
        this.b = b;
        this.amt = amt;
    }

    public void run() 
	{
        b.withdraw(amt);
    }
}

public class BankThread 
{
    public static void main(String args[]) 
	{
        Bank obj = new Bank();

        Thread1 t1 = new Thread1(obj, 500, "Thread-1");
        Thread1 t2 = new Thread1(obj, 700, "Thread-2");
        Thread1 t3 = new Thread1(obj, 600, "Thread-3");

        t1.start();
        t2.start();
        t3.start();
    }
}
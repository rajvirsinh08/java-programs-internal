import java.util.Scanner;

class Train 
{
    int seat = 1;

    synchronized void book(int amt) 
	{
        System.out.println(Thread.currentThread().getName() + " wants to book: " + amt);
        if (seat >= amt) 
		{
            try 
			{
                Thread.sleep(1000);
            } catch (Exception e) 
			{
                System.out.println(e);
            }
            seat = seat - amt;
            System.out.println(Thread.currentThread().getName() + " booked successfully. Remaining seats: " + seat);
        } 
		else 
		{
            System.out.println("No seat available for " + Thread.currentThread().getName());
        }
    }
}

class Passenger extends Thread 
{
    Train t;
    int amt;

    Passenger(Train t, int amt, String name) 
	{
        super(name);
        this.t = t;
        this.amt = amt;
    }

    public void run() 
	{
        t.book(amt);
    }
}

public class TrainThread 
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Train obj = new Train();

        System.out.print("Enter seat request for Passenger-1: ");
        int p1 = sc.nextInt();
        System.out.print("Enter seat request for Passenger-2: ");
        int p2 = sc.nextInt();
        System.out.print("Enter seat request for Passenger-3: ");
        int p3 = sc.nextInt();

        Passenger t1 = new Passenger(obj, p1, "Passenger-1");
        Passenger t2 = new Passenger(obj, p2, "Passenger-2");
        Passenger t3 = new Passenger(obj, p3, "Passenger-3");

        t1.start();
        t2.start();
        t3.start();

        sc.close();
    }
}
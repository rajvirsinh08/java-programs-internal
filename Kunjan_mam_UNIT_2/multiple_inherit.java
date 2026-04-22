//alos Demo of super keyword
import java.util.*;
//bluprint of class cannot have object as it only holds general information about class
interface Theory 
{
	//attributes are automatically public final static 
	//(initialize onhly once cannot be changed cann be called without creation of object )
	int tno=3;
	//methods are automatically public abstract(no body)
	void tinput();
	void toutput();
	
	//method can be static after java 8.0(can have body)
	static void show()
	{
		System.out.println("No of theory subjects"+tno);
	}
}
interface practical 
{
	
	int pno=2;
	void pinput();
	void poutput();
	
	static void show()
	{
		System.out.println("No of practical subjects"+pno);
	}
}
//extends can only have one inherit multiple is not allowed
//so  we us e interface and it's implements keyword
class marksheet implements theory,prctical
{
	String tsubs=new String(tno);
	int tmarks=new  int[tno];
	String psubs=new String(pno);
	int pmarks=new  int[pno];
	int total;
	double percent;
	char grade;
	void tinput(Scanner sc)
	{
		for(int i=0;i<tno;i++)
		{
			sc.nextLine();
			System.out.println("Enter theory Subject [i]");
			tsubs[i]=sc.nextLine();
			System.out.println("Enter thoery marks [i]");
			tmarks[i]=sc.nextInt();
		}
	}
	void pinput(Scanner sc)
	{
		for(int i=0;i<pno;i++)
		{
			sc.nextLine();
			System.out.println("Enter practical Subject [i]");
			psubs[i]=sc.nextLine();
			System.out.println("Enter practical marks [i]");
			pmarks[i]=sc.nextInt();
		}
	}
	void calculate()
	{
		for(int i=0;i<tno;i++)
		{
			total+=tmarks[i]);
		}
		for(int i=0;i<pno;i++)
		{
			total+=pmarks[i]);
		}
		Sytem.out.pritnln("Total"+total);
		percent=total/5;
		System.out.println("Percentage"+percent)
	}
	void toutput()
	{
		for(int i=0;i<tno;i++)
		{
			System.out.println(tsubs[i]+": "+tmarks[i]);
		}
	}
	void poutput()
	{
		for(int i=0;i<pno;i++)
		{
			System.out.println(psubs[i]+": "+pmarks[i]);
		}
	}
	
	
}
public class multiple_inherit.java
{
	public static void main(String[] args)
	{
		Scanner sc =new  Scanner(System.in);
		marksheet m=new marksheet();
		m.tinput(sc);
		m.pinput(sc);
		m.calculate();
		m.toutput();
		m.poutput();
	}
}
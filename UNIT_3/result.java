package p2;
import java.util.*;

public class result
{	
	int m1,m2,m3;
	int total;
	String dept;
	public void get()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("______Result______");
		System.out.println("Enter marks 1 ");
		m1=sc.nextInt();
		System.out.println("Enter marks2 ");
		m2=sc.nextInt();
		System.out.println("Enter marks 3 ");
		m3=sc.nextInt();
	}
	public void disp()
	{
		System.out.println("Marks 1 "+m1);
		System.out.println("Marks 2 "+m2);
		System.out.println("Marks 3 "+m3);
		total=m1+m2+m3;
		System.out.println("total: "+total);
		System.out.println("__________________");
	}
}
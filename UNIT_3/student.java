package p1;
import java.util.*;

public class student
{
		int rollno;
		String name;
		String dept;
	public void get()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("______Student info_____");
		System.out.println("Enter rollno ");
		rollno=sc.nextInt();
		System.out.println("Enter name");
		sc.nextLine();
		name=sc.nextLine();
		System.out.println("Enter department");
		dept=sc.nextLine();
	}
	public void disp()
	{
		System.out.println("\nRollno: "+rollno);
		System.out.println("Name: "+name);
		System.out.println("Department: "+dept);
	}
}
//Employee Master
import java.util.*;
class Emp
{
	int id;
	String name;
	String dept;
	String desig;
	float sal;
	
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id: ");
		id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name: ");
		name=sc.nextLine();
		System.out.println("Enter Department: ");
		dept=sc.nextLine();
		System.out.println("Enter Designation: ");
		desig=sc.nextLine();
		System.out.println("Enter Salary: ");
		sal=sc.nextFloat();
	}
	void output()
	{
		System.out.println("Employee Detials");
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
		System.out.println("Department: "+dept);
		System.out.println("Designation: "+desig);
		System.out.println("Salary: "+sal);
	}
	public static void main(String[] args)
	{
		Emp e=new Emp();
		e.input();
		e.output();
	}
}
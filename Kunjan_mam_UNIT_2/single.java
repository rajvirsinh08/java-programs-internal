//alos Demo of super keyword
import java.util.*;
class person 
{
	String name;
	int age;
	String gen;
	
	public person(String name,int age,String gen)
	{
		// Scanner sc=new Scanner(System.in);
		// System.out.println("Enter Name : ");
		// name=sc.nextLine();
		// System.out.println("Enter Age : ");
		// age=sc.nextInt();
		// sc.nextLine();
		// System.out.println("Enter Gender : ");
		// gen=sc.nextLine();
		this.name=name;
		this.age=age;
		this.gen=gen;
	}
	
	void show()
	{
		System.out.println("\nPerson Details");
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Gender : "+gen);
	}
}
class student extends person
{
	int rollno;
	String dept;
	int sem;
	
	public student(String name,int age,String gen,int rollno,String dept,int sem)
	{
		// Scanner sc = new Scanner(System.in);
		// System.out.println("Enter Rollno");
		// rollno=sc.nextInt();
		
		// sc.nextLine();
		// System.out.println("Enter dept");
		// dept=sc.nextLine();
		// System.out.println("Enter Semester");
		// sem=sc.nextInt();
		super(name,age,gen);
		this.rollno=rollno;
		this.dept=dept;
		this.sem=sem;
		
	}
	void display()
	{
		System.out.println("\nStudent Details");
		System.out.println("Rollno : "+rollno);
		System.out.println("Department : "+dept);
		System.out.println("Semester : "+sem);
	}
}
public class single
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name=sc.nextLine();
		
		System.out.println("Enter Age : ");
		int age=sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter Gender : ");
		String gen=sc.nextLine();
		
		System.out.println("Enter Rollno");
		int  rollno=sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter dept");
		String dept=sc.nextLine();
		
		System.out.println("Enter Semester");
		int sem=sc.nextInt();
		
		student s=new student(name,age,gen,rollno,dept,sem);
		s.show();
		s.display();
	}
}
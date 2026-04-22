import java.util.*;
public class Student
{
	int id;
	String name;
	String dptmnt;
	int sem;
	String gen;
	void input(int id,String name,String dptmnt,int sem,String gen)
	{
		this.id=id;
		this.name=name;
		this.dptmnt=dptmnt;
		this.sem=sem;
		this.gen=gen;
		output();
	}
	void output()
	{
		System.out.println("Id : "+id);
		System.out.println("Name : "+name);
		System.out.println("Department : "+dptmnt);
		System.out.println("Semester : "+sem);
		System.out.println("Gender : "+gen);
		
	}
	public static void main(String[] args)
	{
		Student std1=new Student();
		Student std2=new Student();
		/*
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Id ");
		int id=sc.nextInt();
		System.out.println("Enter Name ");
		sc.nextLine();
		String nm=sc.nextLine();
		System.out.println("Enter Department ");
		String dpt=sc.nextLine();
		System.out.println("Enter Semester ");
		int sm=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Gender ");
		String gn=sc.nextLine();
		System.out.println("Student");
		std2.input(id,nm,dpt,sm,gn);
		std2.output(); */
		std1.input(101,"Kevin","MCA",2,"Male");
		
	}
}
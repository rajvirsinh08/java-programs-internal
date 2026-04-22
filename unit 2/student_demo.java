import java.util.*;

class Student{
	int rollno;
	String name;
	double marks;
	
	//default constructor
	public Student(){
		System.out.println("Default construcctor calling..");
		rollno=0;
		name="";
		marks=0;
	}
	//parameterized constructor
	public Student(int r,String n,double m){
		System.out.println("\nParameterized called..");
		rollno=r;
		name=n;
		marks=m;
	}
	//setter methodss
	void setdata(int r,String n,double m){
		this.rollno=r;
		this.name=n;
		this.marks=m;
	}
	void getdata(){
		System.out.println("Student details:");
		System.out.println("Rollno:"+rollno);
		System.out.println("Name :"+name);
		System.out.println("Marks: "+marks);
	}
}

public class student_demo{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		Student s1=new Student();
		s1.getdata();
		
		System.out.println("Enter roll no:");
		int r=sc.nextInt();
		
		System.out.println("Enter name:");
		String n=sc.next();
		
		System.out.println("Enter marks:");
		double m=sc.nextDouble();
		
		Student s2=new Student(r,n,m);
		s2.getdata();
		
		Student s3=new Student();
		s3.setdata(101,"vansh",85.6);
		s3.getdata();
	}
}
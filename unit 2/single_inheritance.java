import java.util.*;

class Person{
	String name,gender;
	int age;
	
	public Person(String name,String gender,int age){
		this.name=name;
		this.gender=gender;
		this.age=age;
	}
	void show(){
		System.out.println("Person details");
		System.out.println("NAme:"+name);
		SYstem.out.println("Gender:"+gender);
		System.out.println("Age:"+age);
	}
}
class Student extends Person{
	int rollno,sem;
	String dept;
	
	public Student(int rollno,String name,String dept,int sem){
		super(name,"Male",20);
		
		this.rollno=rollno;
		this.name=name;
		this.dept=dept;
		this.sem=sem;
	}
	void display(){
		System.out.println("Student details:");
		System.out.println("Roll No:"+rollno);
		System.out.println("Name:"+name);
		System.out.println("Department:"+dept);
		System.out.println("Semester:"+sem);
	}
}
public class single_inheritance{
	public static void main(String args[]){
		Student s1=new Student(101,"Vansh","MCA",2);
		s1.show();
		s1.display();
	}
}
import java.util.*;

class college{
	int rollno;
	String name;
	
	static String dept="MCA";
	static String university="CPICA";
	
	college(int r,String n){
		this.rollno=r;
		this.name=n;
	}
	static void showstatic(){
		System.out.println("Static details:");
		System.out.println("Department:"+dept);
		System.out.println("university:"+university);
		
	}
	
	void display(){
		System.out.println("\n--- Student Details ---");
		System.out.println("Roll No : " + rollno);
		System.out.println("Name : " + name);
		System.out.println("Department : " + dept);
		System.out.println("University : " + university);
	}
}


public class static_example{
	public static void main(String args[]){
		college s1=new college(101,"vansh");
		college s2=new college(102,"raj");
		
		college.showstatic();
		
		s1.display();
		s2.display();
	}
}
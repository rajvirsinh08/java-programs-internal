import java.util.*;

class Student
{
	int rollno;
	String name;
	
	Student(int r, String n)
	{
		this.rollno = r;
		this.name = n;
	}
	
	// Override toString()
	public String toString()
	{
		return "Roll No : " + rollno + " Name : " + name;
	}
	
	// Override equals()
	public boolean equals(Object obj)
	{
		Student s = (Student)obj;
		
		if(this.rollno == s.rollno && this.name.equals(s.name))
			return true;
		else
			return false;
	}
}

public class object_class_example
{
	public static void main(String[] args)
	{
		Student s1 = new Student(101, "Vansh");
		Student s2 = new Student(101, "Vansh");
		
		// toString()
		System.out.println("Student 1 : " + s1);
		System.out.println("Student 2 : " + s2);
		
		// equals()
		if(s1.equals(s2))
			System.out.println("\nBoth Students are Same");
		else
			System.out.println("\nBoth Students are Different");
		
		// hashCode()
		System.out.println("\nHashCode of s1 : " + s1.hashCode());
		System.out.println("HashCode of s2 : " + s2.hashCode());
	}
}
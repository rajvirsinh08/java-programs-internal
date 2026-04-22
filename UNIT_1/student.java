import java.util.*;

class Student
{
		// Attribute
		int rno;
		String name;
		String dept;
		int sem;
		String gender;
		
		// Methods 
		void input(){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Roll No : ");
			rno = sc.nextInt();
		}
		void output(){
			System.out.println("Roll No : "+rno);
		}
		
	public static void main(String[] args)
	{
		Student s = new Student();
		s.input();
		s.output();
	}
}
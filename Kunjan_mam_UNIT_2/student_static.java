import java.util.*;
public class student_static
{
	int enroll;
	String name;
	String dptmnt="MCA";
	String uni="SVGU";
	student_static(int enroll,String name)
	{
		this.enroll=enroll;
		this.name=name;
	}
	void output()
	{
		System.out.println("Enrollment no : "+enroll);
		System.out.println("Name : "+name);
		System.out.println("Department : "+dptmnt);
		System.out.println("university : "+uni);
		
	}
	static
	{
		System.out.println("Thsi runs before main()");
	}
	public static void main(String[] args)
	{
		System.out.println("This is main()");
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter Enrollment no");
		int enr=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name");
		String nm=sc.nextLine();
		student_static std1=new student_static(enr,nm);
		std1.output();
		student_static std2=new student_static(102,"Jatin");
		std2.output();
		
		
			
	}
}
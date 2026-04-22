import java.util.*;

interface Exam
{
	boolean pass(int mark);
}

interface Classify
{
	String division(int avg);
}

class Result implements Exam, Classify
{
	// Pass or Fail
	public boolean pass(int mark)
	{
		if(mark >= 50)
			return true;
		else
			return false;
	}
	
	// Division
	public String division(int avg)
	{
		if(avg >= 60)
			return "First";
		else if(avg >= 50)
			return "Second";
		else
			return "No Division";
	}
}

public class result_example
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Marks : ");
		int m = sc.nextInt();
		
		System.out.print("Enter Average : ");
		int avg = sc.nextInt();
		
		Result r1 = new Result();
		
		// Pass check
		if(r1.pass(m))
			System.out.println("Result : Pass");
		else
			System.out.println("Result : Fail");
		
		// Division
		System.out.println("Division : " + r1.division(avg));
	}
}
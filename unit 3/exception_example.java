import java.util.*;

class exception_example
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		try
		{
			System.out.print("Enter First Number : ");
			int a = sc.nextInt();
			
			System.out.print("Enter Second Number : ");
			int b = sc.nextInt();
			
			int result = a / b;   // may cause exception
			
			System.out.println("Result : " + result);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Error : Cannot Divide by Zero");
		}
		
		catch(Exception e)
		{
			System.out.println("General Exception Occurred");
		}
		
		finally
		{
			System.out.println("Program End (Finally Block Executed)");
		}
	}
}
import java.util.*;

class exception_advanced
{
	// method using throws
	static void checkNumber(int n) throws ArithmeticException
	{
		if(n < 0)
		{
			throw new ArithmeticException("Number is Negative");
		}
		else
		{
			System.out.println("Number is Positive");
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		try
		{
			System.out.print("Enter Number : ");
			int num = sc.nextInt();
			
			checkNumber(num);   // method call
			
			System.out.print("Enter Value for Division : ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int result = a / b;
			System.out.println("Result : " + result);
		}
		
		// Multiple catch blocks
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Error : " + e.getMessage());
		}
		
		catch(InputMismatchException e)
		{
			System.out.println("Invalid Input (Enter Integer Only)");
		}
		
		catch(Exception e)
		{
			System.out.println("General Exception");
		}
		
		finally
		{
			System.out.println("Program End");
		}
	}
}
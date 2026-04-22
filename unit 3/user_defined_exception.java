import java.util.*;

// Custom Exception Class
class MyException extends Exception
{
	public MyException(String msg)
	{
		super(msg);
	}
}

class user_defined_exception
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
			
			if(b == 0)
			{
				// throw custom exception
				throw new MyException("Cannot Divide by Zero");
			}
			
			int result = a / b;
			System.out.println("Result : " + result);
		}
		
		catch(MyException e)
		{
			System.out.println("Custom Exception : " + e.getMessage());
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
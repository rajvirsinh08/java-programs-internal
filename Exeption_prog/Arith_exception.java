/*
Exception Handling
*/
import java.util.*;
class Arith_exception
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter first number");
			int n1=sc.nextInt();
			System.out.println("Enter second number");
			int n2=sc.nextInt();
			if(n1<=0||n2<=0)
			{
				throw new ArithmeticException("Values must be > 0");
			}
			System.out.println("Addition: "+(n1+n2));
			System.out.println("Subtraction: "+(n1-n2));
			System.out.println("Multiplication: "+(n1*n2));
			System.out.println("Division"+(n1/n2));
		}
		catch(ArithmeticException d)
		{
			//System.out.println("You cannot Divide a value by zero!!");
			System.out.println(d.getMessage());
		}
		catch(InputMismatchException i)
		{
			System.out.println("input should be number only!!");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Code Reached the END");
		}
	}
}
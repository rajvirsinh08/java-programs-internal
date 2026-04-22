/*
Exception Handling
*/
import java.util.*;

class Employee_except
{
	//In static methos only static variable can be used
	public static String name;
	public static int age;
	//static class thats why u don't need to create object 
	//Exception is not a runtime error so u need to declare that this method throws error with throws keywoard
	//only runtime errors wil be handled for other exception u need to declare it at the start of the method
	//throws keywoard is used to declare an exception and 
	//throw keywoard is used to generate an exception
	
	public static void check(Scanner sc)throws Exception
	{
		System.out.println("Enter name");
		name=sc.nextLine();
		System.out.println("Enter age");
		age=sc.nextInt();
		if(age<18)
		{
			 throw new Exception("Age must be > 18");
		}
		else
		{
			System.out.println("Name: "+name+"\n age:"+age+" You are eligible");
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			check(sc);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("Code Reached the End");
		}
	}
}

































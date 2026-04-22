import java.util.*;
public class Q4_voting
{	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your age");
		int age = sc.nextInt();
		if(age > 18)
		{
			System.out.println("ELigible for Voting");
		}else
		{
			System.out.println("Not Eligible For voting");
		}
		
	}
}
import java.util.*;
public class Fact
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number for Factorial: ");
		int n = sc.nextInt();
		int fact = 1;
		for(int i=1;i<=n;i++)
		{
			fact = fact * i;
			
		}
		System.out.println(fact);
	}
}
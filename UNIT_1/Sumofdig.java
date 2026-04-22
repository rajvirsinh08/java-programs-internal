import java.util.*;
public class Sumofdig
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number for Sum of Digit: ");
		int n = sc.nextInt();
		int sum = 0;
		int rem;
		while(n>0)
		{
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.println("sum is :"+sum);
		
	}
}
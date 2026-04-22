import java.util.*;
public class Revnum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number for Sum of Digit: ");
		int n = sc.nextInt();
		int rev = 0;
		int rem;
		while(n>0)
		{
			rem=n%10;
			System.out.println(rem);
			rev= (rev*10) + rem;
			System.out.println(rev);
			n=n/10;
			System.out.println(n);
			
		}
		System.out.println("Reverse is :"+rev);
		
	}
}
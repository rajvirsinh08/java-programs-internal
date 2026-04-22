import java.util.*;
public class SumEven
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to print even number till that ");
		int n = sc.nextInt();
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
				sum=sum+i;
				
			}
		}
		System.out.println("Sum is "+sum);
	}
}
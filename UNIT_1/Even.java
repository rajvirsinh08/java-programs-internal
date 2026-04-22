import java.util.*;
public class Even
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to print even number till that ");
		int n = sc.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
		
	}
}
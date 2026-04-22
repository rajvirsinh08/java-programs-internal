import java.util.*;
public class Q5_neg_pos
{	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number ");
		int num = sc.nextInt();
		if(num > 0)
		{
			System.out.println("Positive number");
		}else if(num < 0)
		{
			System.out.println("Negative number");
		}
		else
		{
			System.out.println("Zero number");
		}
	}
}
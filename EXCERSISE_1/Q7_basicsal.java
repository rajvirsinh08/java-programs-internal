import java.util.*;
public class Q5_max3
{	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		System.out.println("n1 "+n1);
		System.out.println("n2 "+n2);
		System.out.println("n3 "+n3);
		if(n1>n2 && n1>n3)
		{
			System.out.println(n1+"is the greatest");
		}else if(n2>n3 && n2>n1)
		{
			System.out.println(n2+"is the greatest");
		}else
		{
			System.out.println(n3+"is the greatest");
		}
	}
}
import java.util.*;
public class Q3_simple_inrtst
{	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter principle r n");
		int p = sc.nextInt();
		System.out.println("Enter  rate of intrest");
		int r = sc.nextInt();
		System.out.println("Enter no of years");
		int n = sc.nextInt();
		System.out.println("p "+p);
		System.out.println("r "+r);		
		System.out.println("n "+n);		
		float SI=((p*r*n)/100);
		System.out.println("Simple intrest is"+SI);
		
	}
}
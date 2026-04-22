import java.util.*;
public class Q5_max3
{	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number ");
		int basic = sc.nextInt();
		float grossal;
		float da;
		float hra;
		System.out.println("basic "+basic);
		if(basic <= 10000)
		{
			da = (basic*20)/100;
			hra = ((basic*80)/100);
			grossal=basic+da+hra;
			System.out.println("Gross Salary"+grossal);
		}else if (basic > 10000 && basic <= 20000)
		{
			da = (basic*25)/100;
			hra = ((basic*90)/100);
			grossal=basic+da+hra;
			System.out.println("Gross Salary"+grossal);
		}
		else if(basic > 20000)
		{
			da = (basic*30)/100;
			hra = ((basic*95)/100);
			grossal=basic+da+hra;
			System.out.println("Gross Salary"+grossal);
		}else{
			System.out.println("invalid input");
		}
	}
}
import java.util.*;

public class task_tab
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int strt=sc.nextInt();
		int stp=sc.nextInt();
		System.out.print("\t");
		for(int i=strt;i<=stp;i++)
		{
			System.out.print(i+"\t");
		}
		System.out.println("\n________________________________________________________________________________");
		System.out.println();
		for(int i=strt;i<=stp;i++)
		{
			System.out.print(i+" |\t");
			for(int j=strt;j<=stp;j++)
			{
				System.out.print(+(i*j)+"\t");
			}
			System.out.println();
		}
	}
}
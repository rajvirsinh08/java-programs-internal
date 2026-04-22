import java.util.*;
public class Task
{
	public static void main(String[] args)
	{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		for(int i=a;i<=10;i++)
		{
			for(int j=1;j<=b;j++)
			{
				System.out.print(j+" x "+i+" = "+(i*j)+"     ");
			}
			System.out.println();
		}
	}
}
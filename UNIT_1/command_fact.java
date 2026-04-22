import java.util.*;

public class command_fact
{
	public static void main(String[] args)
	{
		int n1 = Integer.parseInt(args[0]);
		int fact = 1;
		for(int i=1;i<=n1;i++)
		{
			fact = fact * i;
		}
		System.out.println(fact);
	}
}
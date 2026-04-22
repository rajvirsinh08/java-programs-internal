import java.util.*;
public class Forloop
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to itrerate loop: ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println(i);
		}
	}
}
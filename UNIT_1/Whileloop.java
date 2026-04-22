import java.util.*;
public class Whileloop
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to itrerate loop: ");
		int n = sc.nextInt();
		int i = 1;
		while(i<=n)
		{
			System.out.println(i);
			i++;
		}
	}
}
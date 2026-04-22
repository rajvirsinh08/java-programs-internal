import java.util.*;
public class Dowhileloop
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to itrerate loop: ");
		int n = sc.nextInt();
		int i = 1;
		do
		{
			System.out.println(i);
			i++;
		}while(i<=n);
	}
}
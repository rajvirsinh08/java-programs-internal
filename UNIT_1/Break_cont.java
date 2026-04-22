import java.util.*;
public class Break_cont
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to itrerate loop: ");
		int n = sc.nextInt();
		/* for(int i=1;i<=n;i++)
		{
			System.out.println(i);
			if(i==3)
			{
				System.out.println("break");
				break;
			}
			
		} */
		for(int i=1;i<=n;i++)
		{
			
			if(i==3)
			{
				System.out.println("break");
				continue;
			}
			System.out.println(i);
		}
	}
}
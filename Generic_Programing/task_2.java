import java.util.*;
interface Myinterface
{
	public void disp(int x);
}
class task_2
{
	public static void main(String[] args)
	{
		Myinterface myint = (x) -> 
		{
			if(x%2==0)
			{
				System.out.println(x+"is Even");
			}else
			{
				System.out.println(x+"is odd");
			}
		};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		myint.disp(n);
	}
}
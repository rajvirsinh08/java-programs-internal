import java.util.*;
interface Factorial
{
	public int disp(int n);
}
class lambda_blockexpr
{
	public static void main(String[] args)
	{
		Factorial f = (n) ->{
			int fact=1;
			for(int i=1;i<=n;i++)
			{
				fact=fact*i;
			}
			return fact;
		};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		System.out.println("Factorial of "+n+" is: "+f.disp(n));
	}
}
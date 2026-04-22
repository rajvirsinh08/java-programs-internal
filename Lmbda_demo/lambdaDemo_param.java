import java.util.*;
interface Myinterface
{
	public int disp(int x);
}
class lambdaDemo_param
{
	public static void main(String[] args)
	{
		Myinterface myint = (x) -> x * x;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		System.out.println("The Square of "+n+" is "+myint.disp(n));
	}
}
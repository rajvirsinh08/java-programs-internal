import java.util.*;
interface arithmetic
{
	public double disp(int x,int y);
}
class lambdaDemo_param_2
{
	public static void main(String[] args)
	{
		arithmetic add = (x,y) -> x + y;
		arithmetic sub = (x,y) -> x - y;
		arithmetic mul = (x,y) -> x * y;
		arithmetic div = (x,y) -> x / y;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number");
		int n=sc.nextInt();
		System.out.println("Enter 2nd number");
		int n2=sc.nextInt();
		System.out.println("Arithmetic operations using lambda");
		System.out.println("Addition: "+add.disp(n,n2));
		System.out.println("Subtraction: "+sub.disp(n,n2));
		System.out.println("Multiplication: "+mul.disp(n,n2));
		System.out.println("Division: "+div.disp(n,n2));
	}
}
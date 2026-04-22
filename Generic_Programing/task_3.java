import java.util.*;
interface Myinterface
{
	public void disp(String x);
}
class task_3
{
	public static void main(String[] args)
	{
		Myinterface myint = (x) -> System.out.println("String length is "+x.length());
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String n = args[0];
		myint.disp(n);
	}
}
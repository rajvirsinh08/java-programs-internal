import java.util.*;
interface Myinterface
{
	public void disp(String x);
}
class task_4
{
	public static void main(String[] args)
	{
		Myinterface myint = (x) -> 
		{
			System.out.println("String Lower case is "+x.toLowerCase());
			String rev="";
			System.out.println("String in reverse: ");
			for(int i=x.length()-1;i>=0;i--)
			{
				System.out.print(x.charAt(i));
			}
			
		};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String n = sc.nextLine();
		myint.disp(n);
	}
}
//method overloading
import java.util.*;
class Logical
{
	int method(int no)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		//netural no;
		for(int i=1;i<=n;i++)
		{
			 sum=sum+i;
		}
		return sum;
	}
	 int method(int no1)
	 {
		int n;
		while(n>0)
		{
		int rm=n%10;
		int dig=(rm*10)+n;
		int rev=n/10;
		}
		return dig;
	 }
	public static void main(String args[])
	{
		Logical l1=new Logical();
		System.out.println(l1.method(10));
		System.out.println(l1.method(10));

	}
}

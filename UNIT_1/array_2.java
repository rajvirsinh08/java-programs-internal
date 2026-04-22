import java.util.*;

public class array_2
{
	public static void main(String[] args)
	{
		/* int a[]={10,30,50,70,90,110};
		float a[]={10.25f,30.56f,50.92f,70.522f,90.41f,110.23f};
		char a[]={'k','e','v','i','n'}; 
		String a[]={"My","Name ","is","Kevin"};*/
		int a[];
		int b[];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of Array");
		int s=sc.nextInt();
		a=new int[s];
		b=new int[s];
		System.out.println("Enter Elements of 1st array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter Elements of 2nd array");
		for(int i=0;i<a.length;i++)
		{
			b[i]=sc.nextInt();
		}
		System.out.println("A Array");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("B Array");
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		int sum[];
		sum=new int[s];
		for(int i=0;i<sum.length;i++)
		{
			sum[i]=a[i]+a[i];
		}
		System.out.println("Sum Array");
		for(int i=0;i<sum.length;i++)
		{
			System.out.println(sum[i]);
		}
	}
}
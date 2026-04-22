import java.util.*;

public class array_1
{
	public static void main(String[] args)
	{
		/* int a[]={10,30,50,70,90,110};
		float a[]={10.25f,30.56f,50.92f,70.522f,90.41f,110.23f};
		char a[]={'k','e','v','i','n'}; 
		String a[]={"My","Name ","is","Kevin"};*/
		int a[];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of Array");
		int s=sc.nextInt();
		a=new int[s];
		System.out.println("Enter Elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		/* for(int i=0;i<a.length;i++)
		{
			System.out.println("a["+i+"]: "+a[i]);
		}
		System.out.println("Sum of ELements");
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		System.out.println("Sum of ELement is : "+sum); 
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println("even: "+a[i]);
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println("odd: "+a[i]);
			}
		}
		*/
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}else if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("Maximum is : "+max);
		System.out.println("Minimum is : "+min);
	}
}
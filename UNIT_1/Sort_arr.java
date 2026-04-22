import java.util.*;

public class Sort_arr
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
		
		System.out.println("Enter Elements of 1st array");
		
		for(int i=0;i<s;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Unsorted array");
		
		for(int i=0;i<s;i++)
		{
			System.out.println(a[i]);
		}
		
		for(int i=0;i<s;i++)
		{
			for(int j=i+1;j<s;j++)
			{
				if(a[i] > a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Sorted array");
		for(int i=0;i<s;i++)
		{
			System.out.println(a[i]);
		}
	}
}
import java.util.*;

public class Search_arr
{
	void search(int a[],int s)
	{	
		boolean f = false;
		int loc=0;
		for(int i=0;i<a.length;i++)
		{
			
			if(a[i]==s)
			{
				f=true;
				loc=i;
				break;
				
			}
		}
		if(f == true)
		{
			System.out.println("Element "+s+" found at "+loc+" Index");
		}else
		{
			System.out.println("ELement not found");
		}
	}
	public static void main(String[] args)
	{
		/* int a[]={10,30,50,70,90,110};
		float a[]={10.25f,30.56f,50.92f,70.522f,90.41f,110.23f};
		char a[]={'k','e','v','i','n'}; 
		String a[]={"My","Name ","is","Kevin"};*/
		int a[];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Size of Array");
		int n=sc.nextInt();
		a=new int[n];
		
		System.out.println("Enter Elements of 1st array");
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter Element you want to search");
		int ele=sc.nextInt();
		Search_arr sr=new Search_arr();
		sr.search(a,ele);
	}
}
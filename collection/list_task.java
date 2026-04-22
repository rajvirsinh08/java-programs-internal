import java.util.*;

class list_task
{
	public static void main(String[] args)
	{
		ArrayList<Integer>l1=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many elements to insert");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter "+(i+1)+" Element: ");
			int val=sc.nextInt();
			l1.add(val);
		}
		System.out.println(l1);
		
		//System.out.println("Sum of All Elements");
		//int sum=0;
		ArrayList<Integer>even=new ArrayList<>();
		ArrayList<Integer>odd=new ArrayList<>();
		int ecount=0,ocount=0;
		for(int e:l1)
		{
			//sum=sum+s;
			if(e%2==0)
			{
				even.add(e);
				ecount++;
			}
		}
		System.out.println(even);
		for(int o:l1)
		{
			if(o%2!=0)
			{
				odd.add(o);
				ocount++;
			}
		}
		System.out.println(odd);
		//System.out.println("Sum is "+sum);
		System.out.println("\neven count is "+ecount);
		System.out.println("odd count is "+ocount);
	}
}
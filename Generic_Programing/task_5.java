import java.util.*;
interface Myinterface
{
	public void disp(String x);
}
class task_5
{
	public static void main(String[] args)
	{
		Myinterface myint = (x) -> 
		{
			x=x.toLowerCase();
			int vcount=0;
			for(int i=0;i<=(x.length()-1);i++)
			{
				if(x.charAt(i)=='a'||x.charAt(i)=='e'||x.charAt(i)=='i'||x.charAt(i)=='o'||x.charAt(i)=='u')
				{
					vcount++;
				}
			}
			System.out.println("Vowe count of "+x+" is "+vcount);
			
		};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String n = sc.nextLine();
		myint.disp(n);
	}
}
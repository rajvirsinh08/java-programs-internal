import java.util.*;

public class str_rev
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String to reverse");
		String s1=sc.nextLine();
		String pal="";
		System.out.print("\nreverse: ");
		for(int i=s1.length()-1;i>=0;i--)
		{
			System.out.print(s1.charAt(i));
			pal=pal+s1.charAt(i);
		}
		if(s1.equals(pal))
		{
			System.out.println("\nThe String is palindrom");
		}else
		{
			System.out.println("\nThe String is Not palindrom");
		}
	}
}
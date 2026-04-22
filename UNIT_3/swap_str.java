import java.util.*;

public class swap_str
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first String");
		String s1=sc.nextLine();
		System.out.println("Enter first String");
		String s2=sc.nextLine();
		String temp;
		System.out.println("Before Swap");
		System.out.println("s1 "+s1+", s2 "+s2);
		temp=s1;
		s1=s2;
		s2=temp;
		System.out.println("Before Swap");
		System.out.println("s1 "+s1+", s2 "+s2);
	}
}
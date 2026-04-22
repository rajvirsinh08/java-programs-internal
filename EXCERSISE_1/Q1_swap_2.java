import java.util.*;
public class Q1_swap_2
{	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers to swap");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Before Swap");
		System.out.println("\nA= "+a+"\nB= "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swap");
		System.out.println("A= "+a+"\nB= "+b);
		
	}
}
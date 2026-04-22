import java.util.*;
public class Q1_swap
{	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers to swap");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int temp;
		System.out.println("Before Swap");
		System.out.println("\nA= "+a+"\nB= "+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("After Swap");
		System.out.println("A= "+a+"\nB= "+b);
		
	}
}
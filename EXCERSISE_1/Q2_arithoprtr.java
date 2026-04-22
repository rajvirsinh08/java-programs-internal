import java.util.*;
public class Q2_arithoprtr
{	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers to arithmatic operator");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		System.out.println("N1 "+n1);
		System.out.println("N2 "+n2);		
		System.out.println("Addition "+ (n1+n2));
		System.out.println("Subtraction "+ (n1-n2));
		System.out.println("Multiplication "+ (n1*n2));
		System.out.println("Division "+ (n1/n2));
		System.out.println("Modulas "+ (n1%n2));
		
	}
}
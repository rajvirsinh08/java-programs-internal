import a1.Calculator;
import java.util.*;
public class arith_pack
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int n1=sc.nextInt();
		System.out.println("Enter and number");
		int n2=sc.nextInt();
		
		Calculator c=new Calculator();
		int adds=c.add(n1,n2);
		System.out.println("Addition of 2 numbers: "+adds);
		int subs=c.sub(n1,n2);
		System.out.println("Subtraction of 2 numbers:  "+subs);
		int muls=c.mul(n1,n2);
		System.out.println("Multiplication of 2 numbers: "+muls);
		float divs=c.div(n1,n2);
		System.out.println("Division of 2 numbers: "+divs);
		float mods=c.mod(n1,n2);
		System.out.println("Modulas of 2 numbers: "+mods);
	}
	
}
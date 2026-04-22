import java.util.*;
import p1.addition;
import p1.subtraction;
public class package_ex
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int n1=sc.nextInt();
		System.out.println("Enter and number");
		int n2=sc.nextInt();
		addition a = new addition();
		int adds=a.add(n1,n2);
		System.out.println("Addition of 2 numbers"+adds);
		subtraction s = new subtraction();
		int subs=s.sub(n1,n2);
		System.out.println("Subtraction of 2 numbers"+subs);
	}
}
import java.util.*;

public class command_max
{
	public static void main(String[] args)
	{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		System.out.println("a: "+a+"\nb: "+b+"\nc: "+c);
		if(a>b && a>c)
			System.out.println(a+" : is MAX");
		else if(b>a && b>c)
			System.out.println(b+" : is MAX");
		else
			System.out.println(c+" : is MAX");
	}
}
import java.util.*;
public class Stringtask
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("First String");
		String s=sc.nextLine();
		System.out.println("Second String");
		String s1=sc.nextLine();
		System.out.println("String : "+s);
	
		System.out.println("Length Of"+s.length());
		
		System.out.println("To Upper Case: "+s.toUpperCase());
		
		System.out.println("Char At 1 for s: "+s.charAt(3));
		
		System.out.println("S concat S1 : "+s.concat(" ").concat(s1));
		
		System.out.println("S Equals S1 : "+s.equals(s1));
		
	}
}
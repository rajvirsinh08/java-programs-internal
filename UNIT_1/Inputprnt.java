import java.util.*;
public class Inputprnt
{	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Rollno ");
		int rollno = sc.nextInt();
		System.out.println("enter your name ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println("\nRollno: "+rollno+"\nName: "+name);
	}
}
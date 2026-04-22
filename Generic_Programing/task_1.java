import java.util.*;
public class task_1
{
	public <K> void printData(K Val,K Val2)
	{
		System.out.println("val 1 : "+ Val);
		System.out.println("val 1 : "+ Val2);
		K temp=Val;
		Val=Val2;
		Val2=temp;
		System.out.println("val 1 : "+ Val);
		System.out.println("val 2 : "+ Val2);
		
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int ch=0;
		while(ch!=3)
		{
			System.out.println("Enter \n 1 for integer swap\n 2 for String swap");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					System.out.println("Enter first number");
					int n1=sc.nextInt();
					System.out.println("Enter second number");
					int n2=sc.nextInt();
					task_1 t1=new task_1();
					t1.printData(n1,n2);
					break;
				case 2:
					System.out.println("Enter first String");
					sc.nextLine();
					String s1=sc.nextLine();
					System.out.println("Enter second String");
					String s2=sc.nextLine();
					task_1 t2=new task_1();
					t2.printData(s1,s2);
					break;
				case 3:
				System.out.println("Exiting");
				break;
				default:
				System.out.println("Invalid choice");
				break;
			}
			
		}
		
	}
}
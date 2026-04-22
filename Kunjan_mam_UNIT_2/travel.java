
//Method overloading
import java.util.*;
class Airport
{
	void book_tkct(int id ,String name,String takeoff,String destination)
	{
		System.out.println("id :"+id);
		System.out.println("name:"+name);
		System.out.println("takeoff :"+takeoff);
		System.out.println("destination :"+destination);
	}
	void book_tkct(int id ,String name,String takeoff,String destination,double extralug)
	{
		System.out.println("id :"+id);
		System.out.println("name:"+name);
		System.out.println("takeoff :"+takeoff);
		System.out.println("destination :"+destination);
		System.out.println("Extra Luggage :"+extralug);
	}
}
public class travel
{
	public static void main(String[] args)
	{
		Airport a=new Airport();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id ");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("enter name ");	
		String name=sc.nextLine();
		System.out.println("enter takoff ");
		
		String takeof=sc.nextLine();
		System.out.println("enter destination ");
		
		String dest=sc.nextLine();
		System.out.println("enter extra weight if extra luggage else 0");
		double extral=sc.nextDouble();
		if(extral>0)
		{
			a.book_tkct(id,name,takeof,dest,extral);
		}else
		{
			a.book_tkct(id,name,takeof,dest);
		}
	}
}
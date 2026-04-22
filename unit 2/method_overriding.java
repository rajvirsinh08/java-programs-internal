		
import java.util.*;

class Vehicle
{
	String type;
	
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Vehicle Type : ");
		type = sc.next();
	}
	
	void display()
	{
		System.out.println("\n--- Vehicle Details ---");
		System.out.println("Vehicle Type : " + type);
	}
}

class Car extends Vehicle
{
	String model, company;
	
	void input()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Vehicle Type : ");
		type = sc.next();
		
		System.out.print("Enter Company Name : ");
		company = sc.next();
		
		System.out.print("Enter Model : ");
		model = sc.next();
	}
	
	// Method Overriding
	void display()
	{
		System.out.println("\n--- Car Details ---");
		System.out.println("Vehicle Type : " + type);
		System.out.println("Company : " + company);
		System.out.println("Model : " + model);
	}
}

public class method_overriding
{
	public static void main(String[] args)
	{
		Car c1 = new Car();
		
		c1.input();     // child method
		c1.display();   // overridden method
	}
}
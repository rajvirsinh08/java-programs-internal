import java.util.*;

class Employee
{
	int id;
	String name;
	double salary;
	
	// Default Constructor
	public Employee()
	{
		System.out.println("Default Constructor Calling...");
		id = 0;
		name = "";
		salary = 0;
		display();
	}
	
	// Constructor with 1 parameter
	public Employee(int id)
	{
		System.out.println("\nConstructor with 1 Parameter...");
		this.id = id;
		this.name = "Unknown";
		this.salary = 0;
		display();
	}
	
	// Constructor with all parameters
	public Employee(int id, String name, double salary)
	{
		System.out.println("\nParameterized Constructor...");
		this.id = id;
		this.name = name;
		this.salary = salary;
		display();
	}
	
	void display()
	{
		System.out.println("----- Employee Details -----");
		System.out.println("ID : " + id);
		System.out.println("Name : " + name);
		System.out.println("Salary : " + salary);
	}
}

public class constructor_overloading
{
	public static void main(String[] args)
	{
		// Default
		Employee e1 = new Employee();
		
		// One parameter
		Employee e2 = new Employee(101);
		
		// All parameters
		Employee e3 = new Employee(102, "Vansh", 50000);
	}
}
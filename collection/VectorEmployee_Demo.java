import java.util.*;

class Employee
{
	private int id;
	private String name;
	private double salary;
	
	public Employee(int id,String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public  int getId()
	{
		return id;
	}
	public void raiseSalary(double percent)
	{
		salary+=salary*percent/100;
	}
	public void display()
	{
		System.out.println("Id: "+id+"Name: "+name+"Salary: "+salary);
	}
}
public class VectorEmployee_Demo
{
	public static void main(String[] args)
	{
		//Create Vector
		Scanner sc=new Scanner(System.in);
		Vector<Employee> v=new Vector<>();
		
		//Add employee
		v.add(new Employee(101,"Kevin",50000));
		v.add(new Employee(102,"Jatin",60000));
		v.add(new Employee(103,"Mohit",55000));
		
		System.out.println("----Employee List----");
		
		for(Employee e : v)
		{
			e.display();
		}
		
		//search employee
		int searchid=102;
		System.out.println("\nSeraching Employee with id"+searchid);
		
		for(Employee e : v)
		{
			if(e.getId() == searchid)
			{
				System.out.println("Employee Found: ");
				e.display();
			}
		}
		
		//Raise Salary
		for(Employee e : v)
		{
			e.raiseSalary(10);
		}
		
		System.out.println("After Salary update: ");
		for(Employee e : v)
		{
			e.display();
		}
		
		//Remove Employee
		Iterator<Employee> it=v.iterator();
		while(it.hasNext())
		{
			if(it.next().getId()==103)
			{
				it.remove();//safe removal
			}
		}
		
		System.out.println("After Deletion: ");
		for(Employee e : v)
		{
			e.display();
		}
		
		System.out.println("\nSize: "+v.size());
		System.out.println("Capacity: "+v.capacity());
		System.out.println("search: "+v.search("Kevin"));
		System.out.println("contains: "+v.contains("kevin"));
	}
}
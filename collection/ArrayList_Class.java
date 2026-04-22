import java.util.*;
class Employee
{
	private String name;
	private double salary;
	
	public Employee(String name,double salary)
	{
		this.name=name;
		this.salary=salary;
	}
	public String getName()
	{
		return name;
	}
	public double getSalary()
	{
		return salary;
	}
	public void raiseSalary(double byPercent)
	{
		double raise = salary + byPercent / 100;
		salary += raise;
	}
}
public class ArrayList_Class
{
	public static void main(String[] args)
	{
		ArrayList<Employee> staff=new ArrayList<>(100);
		
		System.out.println("ArrayList size: "+staff.size());
		//Add Employee
		staff.add(new Employee("Mistry Kevin",75000));
		staff.add(new Employee("Matreja Jatin",65000));
		staff.add(new Employee("Kori Mohit",62000));
		
		staff.trimToSize();
		//raise everyones Salary
		for(Employee e : staff)
		{
			e.raiseSalary(5);
		}
		System.out.println("ArrayList size: "+staff.size());
		//print details of staff
		for(Employee e : staff)
		{
			System.out.println("name: "+e.getName()+"\nsalary: "+e.getSalary());
		}
	}
}
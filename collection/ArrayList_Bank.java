import java.util.*;
class Bank
{
	private String Customername;
	private double year;
	private double interest;
	private double principle;
	
	public Bank(String Customername,double year,double interest,double principle)
	{
		this.Customername=Customername;
		this.year=year;
		this.interest=interest;
		this.principle=principle;
	}
	public String getCustomerName()
	{
		return Customername;
	}
	
	public double simpleinterest()
	{
		double si = (principle*interest*year)/ 100;
		return si;
	}
}
public class ArrayList_Bank
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<Bank> bn=new ArrayList<>(100);
		
		System.out.println("ArrayList size: "+bn.size());
		//Add Employee
		System.out.println("Enter Customer name");
		String name=sc.nextLine();
		System.out.println("Enter principle");
		double prncple=sc.nextDouble();
		System.out.println("Enter Rate of interest");
		double intrst=sc.nextDouble();
		System.out.println("Enter No of years");
		double year=sc.nextDouble();
		bn.add(new Bank(name,year,intrst,prncple));
		for(Bank e : bn)
		{
			System.out.println("name: "+e.getCustomerName()+"\nSimple intrest: "+e.simpleinterest());
		}
	}
}
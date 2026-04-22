public class GenericMethod_2
{
	public <K> void printData(K Val,K Val2)
	{
		System.out.println("Pratham : "+ Val);
		System.out.println("Divitya : "+ Val2);
		
	}
	public static void main(String[] args)
	{
		GenericMethod_2 gm2=new GenericMethod_2();
		gm2.printData(046,211);
		gm2.printData("Kevin","Mistry");
		gm2.printData(10.56,11.56);
		gm2.printData(true,false);
	}
}
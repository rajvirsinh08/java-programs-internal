class GenericClass <K extends Number>
{
	public void printData()
	{
		System.out.println("This is Bounded Type Generic Programming");
	}
}
class GenericMethod_bounded
{
	public static void main(String[] args)
	{
		GenericClass<Integer> gmb=new GenericClass();
		gmb.printData();
	}
}
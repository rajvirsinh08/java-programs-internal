public class GenericMethod_3
{
	public <K> void printData(K[] array)
	{
		for(K item: array)
		{
			System.out.println("Pratham : "+ item);
		}
		
	}
	public static void main(String[] args)
	{
		GenericMethod_3 gm2=new GenericMethod_3();
		String[]  names={"Ram","Laksman","Sita","Hanuman"};
		Integer[] numbers={10,9,8,7,6,5};
		gm2.printData(names);
		gm2.printData(numbers);
	}
}
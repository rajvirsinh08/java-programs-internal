public class GenericMethod
{
	public static <K> void show(K Val)
	{
		System.out.println("Value: "+Val);
		
	}
	public static void main(String[] args)
	{
		show(056);
		show("Kevin");
		show(10.56);
		show(true);
	}
}
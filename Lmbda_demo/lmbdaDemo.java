interface Myinterface
{
	public void disp();
}
class lmbdaDemo
{
	public static void main(String[] args)
	{
		Myinterface myint = () -> System.out.println("This is Example of Lambda ");
		
		myint.disp();
	}
}
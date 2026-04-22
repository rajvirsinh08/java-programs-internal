interface Message
{
	void show();
}
class Display
{
	static void print()
	{
		System.out.println("Hello using static method reference");
	}
}

public class static_meth_ref
{
	public static void main(String[] args)
	{
		Message m=Display::print;
		m.show();
	}
}
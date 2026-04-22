interface MyFactory
{
	MyClass getObject();
}
class MyClass
{
	MyClass()
	{
		System.out.println("Hello using Constructor method reference");
	}
}
public class constructor_meth_ref
{	public static void main(String[] args)
	{
		
		MyFactory f=MyClass::new;
		f.getObject();
	}
}

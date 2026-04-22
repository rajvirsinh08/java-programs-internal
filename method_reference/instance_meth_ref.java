interface MyInterface
{
	void display();
}
class instance_meth_ref
{
	void show()
	{
		System.out.println("Hello using instance method reference");
	}
	public static void main(String[] args)
	{
		instance_meth_ref obj=new instance_meth_ref();
		MyInterface ref=obj::show;
		ref.display();
	}
}
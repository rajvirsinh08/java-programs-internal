import java.util.*;

// Final Class (cannot be inherited)
final class Demo
{
	// Final variable
	final int x = 100;
	
	// Final method
	final void show()
	{
		System.out.println("Final Method Called");
		System.out.println("Value of x : " + x);
	}
}

// ❌ This will give error if you try
// class Test extends Demo { }

public class final_example
{
	public static void main(String[] args)
	{
		Demo d1 = new Demo();
		d1.show();
		
		// d1.x = 200;  ❌ Error (cannot change final variable)
	}
}
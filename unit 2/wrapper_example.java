import java.util.*;

class wrapper_example
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int a;
		System.out.print("Enter Integer Value : ");
		a = sc.nextInt();
		
		// Autoboxing (primitive → object)
		Integer obj = a;
		
		// Unboxing (object → primitive)
		int b = obj;
		
		System.out.println("\n--- Values ---");
		System.out.println("Primitive Value : " + a);
		System.out.println("Autoboxing (Integer Object) : " + obj);
		System.out.println("Unboxing (Back to int) : " + b);
	}
}
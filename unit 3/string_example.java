import java.util.*;

class string_example
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter String : ");
		String s1 = sc.next();
		
		System.out.println("\n1. Length");
		System.out.println("2. Starts With");
		System.out.println("3. Ends With");
		System.out.println("4. Upper Case");
		System.out.println("5. Lower Case");
		
		System.out.print("\nEnter Choice : ");
		int ch = sc.nextInt();
		
		switch(ch)
		{
			case 1:
				System.out.println("Length : " + s1.length());
				break;
			
			case 2:
				System.out.print("Enter Substring : ");
				String sub = sc.next();
				System.out.println("Starts With : " + s1.startsWith(sub));
				break;
			
			case 3:
				System.out.print("Enter Substring : ");
				String sub2 = sc.next();
				System.out.println("Ends With : " + s1.endsWith(sub2));
				break;
			
			case 4:
				System.out.println("Upper Case : " + s1.toUpperCase());
				break;
			
			case 5:
				System.out.println("Lower Case : " + s1.toLowerCase());
				break;
			
			default:
				System.out.println("Invalid Choice");
		}
	}
}
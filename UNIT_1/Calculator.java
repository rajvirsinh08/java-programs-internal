import java.util.*;
public class Calculator
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st value");
		int a = sc.nextInt();
		System.out.println("Enter 2nd value");
		int b = sc.nextInt();
		sc.nextLine();
		String ch;
		
		do
		{
			System.out.println("Enter \n+ for Addition\n- for Subtraction\n* for multiplication \n/ for division\n% for modulas\e for Exit");
			ch = sc.nextLine();
			switch(ch)
			{
				case "+":
				System.out.println("Addition : "+(a+b));
				break;
				case "-":
				System.out.println("Subtraction : "+(a-b));
				break;
				case "*":
				System.out.println("Multiplicaiton : "+(a*b));
				break;
				case "/":
				System.out.println("Division : "+(a/b));
				break;
				case "%":
				System.out.println("Modulus : "+(a%b));
				break;
				case "e":
				System.exit(0);
				break;
				default:
				System.out.println("Invalid Enter between (+,-,*,/,%)");
				break;
			}
		}while(ch != "n");
	}
}
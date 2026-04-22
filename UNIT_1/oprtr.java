public class oprtr
{
	void arith()
	{
		
		int n1 = 25;
		int n2 = 50;
		System.out.println("N1 "+n1);
		System.out.println("N2 "+n2);		
		System.out.println("Addition "+ (n1+n2));
		System.out.println("Subtraction "+ (n1-n2));
		System.out.println("Multiplication "+ (n1*n2));
		System.out.println("Division "+ (n1/n2));
		System.out.println("Modulas "+ (n1%n2));
		
	}
	public static void main(String[] args)
	{
		oprtr op=new oprtr();
		op.arith();
	}
}
@FunctionalInterface
interface Mygeneric<K>
{
	K process(K n);
}
class genericlambda
{
	public static void main(String[] args)
	{
		Mygeneric<Integer> squ = (n) -> n*n;
		System.out.println("Square of "+ 5 +" is "+squ.process(5));
		Mygeneric<String> upp = (n) -> n.toUpperCase();
		System.out.println("Upper case of svgu is "+upp.process("svgu"));
	}
}
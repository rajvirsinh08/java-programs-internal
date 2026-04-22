
class Extendloop2d
{
	public static void main(String[] args)
	{
		int a[][]=
		{
			{1,6,7},
			{3,5,6},
			{6,5,4},
		};
		for(int val[]:a)
		{
			for(int j:val)
			{
			System.out.print(val + " " );
			}
			System.out.print();
		}
	}
}
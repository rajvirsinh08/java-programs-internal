
class Array2dstatic
{
	public static void main(String[] args)
	{
		int a[][]=
		{
			{1,6,7},
			{3,5,6},
			{6,5,4},
		};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.println(a[i][j]+ " " );
			}
			System.out.println();

		}
	}
}
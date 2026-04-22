import java.util.*;
class Array2d
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row  or array:");
		int r=sc.nextInt();
		System.out.println("Enter column or array:");
		int c=sc.nextInt();
		int a[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.println("enter value for a["+i+"]["+j+"]" );
				a[i][j]=sc.nextInt();

			}
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(a[i][j]+ " " );

			}
			System.out.println();
		}
	}
}
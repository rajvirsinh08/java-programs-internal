import java.util.*;
public class arr_2d
{
	public static void main(String[] args)
	{
		/* int a[][]={
				{1,2,3},
				{4,5,6},
				{7,8,9}
		}; */
		int a[][];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Row of 2dArray");
		int r=sc.nextInt();
		System.out.println("Enter Columns of 2dArray");
		int c=sc.nextInt();
		System.out.println("Enter Elements of 2D Array");
		a=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.println("Enter a["+i+"]["+j+"] ELement:");
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("2D Array");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}
	}
}
import java.util.*;
public class arr2d_all{
	public static void main(String[] args)
	{
		/* int a[][]={
				{1,2,3},
				{4,5,6},
				{7,8,9}
		}; */
		int a[][];
		int b[][];
		int ans[][];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Row of 2dArray");
		int r=sc.nextInt();
		System.out.println("Enter Columns of 2dArray");
		int c=sc.nextInt();;
		a=new int[r][c];
		
		
		System.out.println("Enter Elements of 1st Array");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("1st Array");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}
		
		
		
		b=new int[r][c];
		System.out.println("Enter Elements of 2nd Array");
		ans=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("2nd Array");
		for(int i=0;i<c;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println("");
		}
		int ch;
		do
		{
			System.out.println("---menu driven---")
			System.out.println("Enter your choice\n1 for addition\n2 for subtraction\n3 for multiplication\n4 for transpose\n5 for EXIT");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
				System.out.println("Addition");
					for(int i=0;i<r;i++)
					{
						for(int j=0;j<c;j++)
						{
							ans[i][j]=a[i][j]+b[i][j];
							System.out.print(ans[i][j]+" " );
						}
						System.out.println();
					}
				break;
				case 2:
				System.out.println("Subtraction");
					for(int i=0;i<r;i++)
					{
						for(int j=0;j<c;j++)
						{
							ans[i][j]=a[i][j]-b[i][j];
							System.out.print(ans[i][j]+" " );
						}
						System.out.println();
					}
				break;
				case 3:
				System.out.println("Multiplication");
					for(int i=0;i<r;i++)
					{
						for(int j=0;j<c;j++)
						{
							for(int k=0;k<c;k++)
							{
								ans[i][j]+=a[i][k]*b[k][j];
							}
						}
					}
					for(int i=0;i<r;i++)
					{
						for(int j=0;j<c;j++)
						{
							System.out.print(ans[i][j]+" " );
						}
						System.out.println();
					}
				break;
				case 4:
				System.out.println("Transpose of A Matrix");
					for(int i=0;i<r;i++)
					{
						for(int j=0;j<c;j++)
						{
							ans[i][j]=a[j][i];
							System.out.print(ans[i][j]+" " );
						}
						System.out.println();
					}
				case 5:
					System.out.println("Exiting");
				break;
				default:
					System.out.println("Invalid choice");
				break;
			}
		}while(ch!=5);
	}
}
import java.util.*;
class Matrixadd
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row  or array:");
		int r=sc.nextInt();
		System.out.println("Enter column or array:");
		int c=sc.nextInt();
		int a[][]=new int[r][c];
		
		System.out.println("Enter row  second or array:");
		int r1=sc.nextInt();
		System.out.println("Enter column secod array:");
		int c1=sc.nextInt();
		int b[][]=new int[r][c];
		
		int add[][]=new int[r][c];
		
		while(true)
		{
			System.out.println("1.Addition matrix");
			System.out.println("2.subtraction matrix");
			System.out.println("3. multiplication  matrix");
			System.out.println("4.transpose matrix");
			System.out.println("5.Exit");
            System.out.println("Enter your choice:");
			int ch=sc.nextInt();
			switch(ch)
			{
				case 1:
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
						System.out.println("enter value for second array b["+i+"]["+j+"]" );
							b[i][j]=sc.nextInt();
						}
					}
					
					System.out.println("Addition of array");
					for(int i=0;i<r;i++)
					{
						for(int j=0;j<c;j++)
						{
							add[i][j]=a[i][j]+b[i][j];
							System.out.print(add[i][j]);
						}
						System.out.print("");
					}
						
					
			

					break;
					
					
				case 2:
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
						System.out.println("enter value for second array b["+i+"]["+j+"]" );
							b[i][j]=sc.nextInt();
						}
					}
					
					System.out.println("subtraction  of array");
					for(int i=0;i<r;i++)
					{
						for(int j=0;j<c;j++)
						{
							add[i][j]=a[i][j]-b[i][j];
							System.out.print("\t" + add[i][j]);
						}
						System.out.print("");
					}
					break;
					
				case 3:
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
						System.out.println("enter value for second array b["+i+"]["+j+"]" );
							b[i][j]=sc.nextInt();
						}
					}
					
					System.out.println("Multiplication of array");
					for(int i=0;i<r;i++)
					{
						for(int j=0;j<c;j++)
						{
							for(int k=0;k<r;k++)
							{
							add[i][j]+=a[i][k]*b[k][j];
							System.out.print("\t" +add[i][j]);
							}
						}
						System.out.println();
					}
					break;
					
				case 4:
					for(int i=0;i<r;i++)
					{
						for(int j=0;j<c;j++)
						{
						System.out.println("enter value for a["+i+"]["+j+"]" );
							a[i][j]=sc.nextInt();
						}
					}
					System.out.println("original matrix");
					for(int i=0;i<r;i++)
					{
						for(int j=0;j<c;j++)
						{
						System.out.print("\t" + a[i][j] );
						}
					}
					System.out.println("transpose matrix");

					for(int i=0;i<c;i++)
					{
						for(int j=0;j<r;j++)
						{
						System.out.print("\t" + a[j][i] );

						}
					}
					
					break;
					
				case 5:
					System.exit(1);
			}
		}
	}
}
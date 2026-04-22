import java.util.*;
import java.io.*;
class File_IO
{
	public static void main(String[] args)throws IOException
	{
		/* Scanner sc=new Scanner(System.in);
		FileWriter fw=new FileWriter("demo.txt",true);
		System.out.println("Enter how many Line u Want to insert in File ");
		int c=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<c;i++)
		{
			System.out.println("Enter "+(i+1)+"Line");
			String s=sc.nextLine();
			fw.write(s+"\n");
		}
		fw.close(); */
		
		FileReader fr=new FileReader("demo.txt");
		int n;
		while((n = fr.read())!=-1)
		{
			System.out.print((char)n);
		}
	}
}
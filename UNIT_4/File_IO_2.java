import java.util.*;
import java.io.*;
class File_IO_2
{
	public static void main(String[] args)throws IOException
	{
		Scanner sc=new Scanner(System.in);
		FileOutputStream fo=new FileOutputStream("demo.txt",true);
		System.out.println("Enter how many Line u Want to insert in File ");
		int c=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<c;i++)
		{
			System.out.println("Enter "+(i+1)+"Line");
			String s=sc.nextLine();
			fo.write(s.getBytes());
			String nl="\n";
			fo.write(nl.getBytes());
		}
		fo.close(); 
		
		FileInputStream fi=new FileInputStream("demo.txt");
		int n;
		while((n = fi.read())!=-1)
		{
			System.out.print((char)n);
		}
	}
}
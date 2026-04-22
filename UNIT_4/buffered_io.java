import java.util.*;
import java.io.*;
class buffered_io
{
	public static void main(String[] args)throws IOException
	{
		Scanner sc=new Scanner(System.in);
		//File f=new File("newdemo.txt");
		FileWriter fw=new FileWriter("newdemo.txt",true);
		BufferedWriter bw=new BufferedWriter(fw);
		System.out.println("Enter how many Line u Want to insert in File ");
		int c=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<c;i++)
		{
			System.out.println("Enter "+(i+1)+"Line");
			String s=sc.nextLine();
			bw.write(s);
			bw.newLine();
		}
		
		bw.close();
		FileReader fr=new FileReader("newdemo.txt");
		BufferedReader br=new BufferedReader(fr);
		/*int n;
		 System.out.println();
		while((n = br.read())!=-1)
		{
			System.out.print((char)n);
		}
		br.close(); */
		String l;
		System.out.println();
		while((l = br.readLine())!=null)
		{
			System.out.println(l);
		}
		br.close();
	}
}
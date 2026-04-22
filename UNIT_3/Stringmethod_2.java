import java.util.*;
public class Stringbuffer
{
	public static void main(String[] args)
	{
		String s1="Kevin Mistry";
		String s2="SVGU";
		String s3=new  String("Kevin");
		System.out.println("String buffer methods");
		System.out.println("getchar()");
		char c1[]=new char[10];
		s1.getChars(0,3,c1,0);
		System.out.println("getChars: "+s2);
		System.out.println("getBytes()");
		byte b1[] =s1.getBytes();
		for(byte b:b1)
		{
			System.out.println(b);
		}
		System.out.println("toCharArray()");
		char c2[]=s1.toCharArray();
		for(char c:c2)
		{
			System.out.println(c);
		}
		
		System.out.println("String Value of Function");
		int a = 10;
		float f = 2.5f;
		double d1 = 34.5;
		char ch1 = 'j';
		boolean b = true;
		System.out.println(String.valueOf(a));
		System.out.println(String.valueOf(f));
		System.out.println(String.valueOf(d1));
		System.out.println(String.valueOf(ch1));
		System.out.println(String.valueOf(b));
	}
}
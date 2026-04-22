import java.util.*;
public class StringMethod
{
	public static void main(String[] args)
	{
		String s1="Kevin Mistry";
		String s2="SVGU";
		String s3=new  String("Kevin");
		System.out.println("String Methods");
		
		System.out.println("Lenght Of String S1: "+s1.length());
		
		System.out.println("Lenght Of String S2: "+s2.length());
		
		System.out.println("Concat s1 + s2: "+s1.concat(" ").concat(s2));
		
		System.out.println("Concat s1 + s2: "+(s1+" "+s2));
		
		System.out.println("Upper s1: "+s1.toUpperCase());
		
		System.out.println("Lower s1: "+s1.toLowerCase());
		
		System.out.println("Char At 1 for s1: "+s1.charAt(3));
		
		System.out.println("S1 Equals S3 : "+s1.equals(s3));
		
		System.out.println("S1 Compare S3 : "+s1.compareTo(s3));
		
		System.out.println("S1 Contains Mistry : "+s1.contains(" Mistry"));
		
		System.out.println("S1 Substring 2,8 : "+s1.substring(2,8));
		
		System.out.println("S2 replace : "+s2.replace('U','P'));
		
		System.out.println("S1 Trim : "+"                         Space".trim());
		
		String spl="one,two,three,four";
		String ch[]=spl.split(",");//Commas or seperators are called DELIMETERS
		System.out.println("Split Function for "+spl);
		for(int i=0;i<ch.length;i++)
		{
			System.out.println (ch[i]);
		}
		
		System.out.println("s2 Starts With SV: "+s2.startsWith("SV"));
		
		System.out.println("s2 Ends With SV: "+s2.endsWith("SV"));
		
		System.out.println("Index Of  S2: "+s2.indexOf("G"));
		
	}
}
import java.util.*;
public class Stringbuffer
{
	public static void main(String[] args)
	{
		String s1="Kevin Mistry";
		// String s2="SVGU";
		// String s3=new  String("Kevin");
		//String Buffer
		StringBuffer sb = new StringBuffer(s1);//here u can change stringbuffer to Stringbuilder Everything  remains same
		System.out.println("String buffer of s1: "+sb);
		//append at last
		sb.append(" SVGU");
		System.out.println("append() : "+sb);
		//insert with index
		sb.insert(12," Hello ");
		System.out.println("insert() : "+sb);
		//Delete Element by index
		sb.delete(18,24);
		System.out.println("delete() : "+sb);
		//Replace with index
		sb.replace(12,18," SVGU");
		System.out.println("replace() : "+sb);
		//Replace with index
		System.out.println("reverse() : "+sb.reverse());
		//Length of 
		System.out.println("lenght(): "+sb.length());
		//toUpper 
		// System.out.println("Upper s1: "+sb.toUpperCase());
		
		//tolower
		// System.out.println("Lower s1: "+sb.toLowerCase());
		
	}
}
import java.util.*;

public class vow_count
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String to reverse");
		String s1=sc.nextLine();
		int vcnt=0;
		int ccnt=0;
		s1=s1.toLowerCase();
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)=='a' || s1.charAt(i)=='e' || s1.charAt(i)=='i' || s1.charAt(i)=='o'||s1.charAt(i)=='u')
			{
				vcnt++;
			}else
			{
				ccnt++;
			}
		}
		System.out.println("Vowel are "+vcnt);
		System.out.println("Conconent are "+ccnt);
	}
}
import java.util.*;

public class Vector_Demo
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Vector<String> v=new Vector<>();
		v.add("Kevin");
		v.add("Mistry");
		v.add("SVGU");
		System.out.println("Vector: "+v);
		System.out.println("\nSize: "+v.size());
		System.out.println("Capacity: "+v.capacity());
		System.out.println("Print wiht iterator");
		Iterator itr= v.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("\nAdd Element");
		v.addElement("Extra");
		System.out.println(v);
		
		System.out.println("Get: "+v.get(0));
		System.out.println("Element at 2"+v.elementAt(2));
		System.out.println("First ELement: "+v.firstElement());
		System.out.println("First ELement: "+v.lastElement());
		System.out.println("Remove : "+v.remove(3));
		//System.out.println("Remove All ELement: "+v.removeAll());
		System.out.println("Remove ELement: "+v.removeElement("Mistry"));
		System.out.println("Set ELement: ");
		v.set(1,"MCA");
		System.out.println(v);
		System.out.println("Set ELement At: ");
		v.setElementAt("ahmedabad",1);
		System.out.println(v);
	}
}
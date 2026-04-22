import java.util.*;

class vector_example
{
	public static void main(String[] args)
	{
		Vector<String> v = new Vector<>();
		
		v.add("Vansh");
		v.add("Raj");
		v.add("Meet");
		
		System.out.println("Vector : " + v);
		
		System.out.println("Size : " + v.size());
		System.out.println("Capacity : " + v.capacity());
		
		// Iterator
		Iterator it = v.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
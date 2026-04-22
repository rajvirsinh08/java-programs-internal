import java.util.*;
//heterogenous Array list
class ArrayListDemo_2
{
	public static void main(String[] args)
	{
		ArrayList<Object>list=new ArrayList<>();
		list.add("Kevin");
		list.add(56);
		list.add(true);
		list.add(0.56);
		System.out.println("list of mixed data type");
		System.out.println(list);
		
		System.out.println("\nList Traversal");
		for(Object o:list)
		{
			System.out.println(o);
		}
		
		
		System.out.println(list.get(0));
		
		System.out.println("\nIterator on mixed list");
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
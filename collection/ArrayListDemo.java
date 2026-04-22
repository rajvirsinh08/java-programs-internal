import java.util.*;

class ArrayListDemo
{
	public static void main(String[] args)
	{
		ArrayList<String>list=new ArrayList<>();
		list.add("One");
		list.add("two");
		list.add("three");
		list.add("four");
		System.out.println(list);
		System.out.println("\n With For Each Loop");
		for(String s:list)
		{
			System.out.println(s);
		}
		System.out.println("\nWith iterator class");
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		list.add(2,"Two.five");
		System.out.println("\nAfter update");
		System.out.println(list);
		
		System.out.println("\nSet Function");
		list.set(2,"two.seventyfive");
		System.out.println(list);
		
		System.out.println("Get method");
		System.out.println(list.get(2));
		
		System.out.println("\nRemove method removed  0th element");
		list.remove(0);
		System.out.println(list);
		/*
		System.out.println("Remove all");
		list.removeAll();
		*/
		System.out.println("Collection.sort method");
		Collections.sort(list);
		System.out.println(list);
		
		System.out.println("\nList Size Methos");
		System.out.println(list.size());
		
		System.out.println("\ncontians");
		System.out.println(list.contains("two"));
		
		System.out.println("\nAdd list to a List");
		ArrayList<String>l2=new ArrayList<>();
		l2.add("One");
		l2.add("two");
		l2.add("three");
		l2.add("four");
		list.addAll(l2);
		System.out.println(list);
		
		System.out.println("Collection Reverse");
		Collections.reverse(list);
		System.out.println("Collection Shuffle");
		Collections.shuffle(list);
		System.out.println("List retainAll");
		list.retainAll(l2);
		System.out.println(list);
		
		System.out.println("List is EmptyL: "+list.isEmpty());
	}
}
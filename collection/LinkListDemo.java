import java.util.*;

class LinkListDemo
{
	public static void main(String[] args)
	{
		LinkedList<String>list=new LinkedList<>();
		list.add("One");
		list.addLast("two");
		list.addFirst("three");
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
		/*System.out.println("\nremove");
		list.remove();
		System.out.println(list);
		System.out.println("remove first");
		list.removeFirst();
		System.out.println(list);
		System.out.println("remove last");
		list.removeLast();
		System.out.println(list);*/
		
		System.out.println("\nCollection Reverse");
		Collections.reverse(list);
		System.out.println("Collection Shuffle");
		Collections.shuffle(list);
		System.out.println(list);
		
		System.out.println("\nList is EmptyL: "+list.isEmpty());
		
		System.out.println("\nGet method");
		System.out.println(list.get(2));
		System.out.println("Get first method");
		System.out.println(list.getFirst());
		System.out.println("Get last method");
		System.out.println(list.getLast());
		
		System.out.println("\nWith List iterator class");
		ListIterator litr=list.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
	}
}
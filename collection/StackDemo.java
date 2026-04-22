import java.util.*;

class StackDemo
{
	public static void main(String[] args)
	{
		Stack<String> st=new Stack<>();
		st.push("Kevin");
		st.push("Jatin");
		st.push("Mehul");
		st.push("Mohit");
		
		System.out.println("Stack: "+st);
		st.pop();
		System.out.println("pop "+st);
		
		System.out.println("Iterated");
		Iterator it= st.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("peek: "+st.peek());
		System.out.println("size: "+st.size());
		System.out.println("capacity: "+st.capacity());
		System.out.println("first element: "+st.firstElement());
		System.out.println("last element: "+st.lastElement());	
		System.out.println("search: "+st.search("Kevin"));
		System.out.println("contains: "+st.contains("Kevin"));
		st.push("Kevin");
	}
}
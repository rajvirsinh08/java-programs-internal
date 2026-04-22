import java.util.*;

class QueueDemo
{
	public static void main(String[] args)
	{
		Queue<String> q1=new PriorityQueue<>();
		
		q1.add("Kevin");
		q1.add("Jatin");
		System.out.println("Queue: "+q1);
		q1.offer("Mehul");
		System.out.println("offer: "+q1);
		
		System.out.println("Remove: "+q1.remove());
		System.out.println(q1);
		q1.poll();
		System.out.println("poll: "+q1);
		q1.offer("Kevin");
		System.out.println("peek: "+q1.peek());
		System.out.println("element: "+q1.element());
		
	
	}
}
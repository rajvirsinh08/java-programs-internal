class Pair<K,M>
{
	K first;
	M second;
	
	Pair(K first,M second)
	{
		this.first=first;
		this.second=second;
	}
	void display()
	{
		System.out.println("First "+first);
		System.out.println("second "+second);
	}
}
public class GenericDemo
{
	public static void main(String[] args)
	{
		Pair<Integer,String> p1=new Pair<>(056,"Kevin");
		Pair<Double,Boolean> p2=new Pair<>(1000.56,true);
		p1.display();
		p2.display();
		
	}
}
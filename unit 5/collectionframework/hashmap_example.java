import java.util.*;

class hashmap_example
{
	public static void main(String[] args)
	{
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(1, "Vansh");
		map.put(2, "Raj");
		map.put(3, "Meet");
		
		System.out.println("Map : " + map);
		
		for(Map.Entry m : map.entrySet())
		{
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}
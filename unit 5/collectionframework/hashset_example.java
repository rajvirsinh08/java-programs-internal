import java.util.*;

class hashset_example
{
	public static void main(String[] args)
	{
		HashSet<String> set = new HashSet<>();
		
		set.add("Vansh");
		set.add("Raj");
		set.add("Vansh"); // duplicate
		
		System.out.println("Set : " + set);
	}
}
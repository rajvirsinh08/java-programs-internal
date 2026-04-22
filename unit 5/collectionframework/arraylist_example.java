import java.util.*;

class arraylist_example{
	public static void main(String args[]){
		ArrayList<String> list=new ArrayList<>();
		
		// Add elements
		list.add("Vansh");
		list.add("Raj");
		list.add("Meet");

		System.out.println("List:"+list);
		
		// Get element
		System.out.println("First Element : " + list.get(0));
		
		// Remove element
		list.remove("Raj");
		System.out.println("After Remove : " + list);
		
		// Size
		System.out.println("Size : " + list.size());
	}
}
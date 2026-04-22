import java.util.*;
class Student{
	int id;
	String name;
	
	Student(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	void display(){
		System.out.println(id+" "+name);
		
	}
	
	
}

public class arraylist_object{
	public static void main(String args[]){
		ArrayList<Student> list =new ArrayList<>();
		
		list.add(new Student(101,"Vansh"));
		list.add(new Student(102,"raj"));
		
		
		for(Student s:list){
			s.display();
		}
	}
}
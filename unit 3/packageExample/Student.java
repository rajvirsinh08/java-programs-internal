package student;

public class Student{
	int roll;
	String name;
	
	public Student(int r,String n){
		roll=r;
		name=n;
	}
	
	public void display(){
		System.out.println("Rolll no:"+roll);
		System.out.println("Name:"+name);
	}
}
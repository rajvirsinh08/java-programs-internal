package exam;

import student.Student;

public class Result{
	int marks;
	
	public Result(int m){
		marks=m;
	}
	public void show(Student s){
		s.display();
		System.out.println("Marks:"+marks);
	}
}
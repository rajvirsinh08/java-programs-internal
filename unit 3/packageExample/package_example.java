import student.Student;
import exam.Result;

public class package_example{
	public static void main(String args[]){
		Student s1=new Student(101,"Vansh");
		Result r1=new Result(85);
		
		r1.show(s1);
	}
}
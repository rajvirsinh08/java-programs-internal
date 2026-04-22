import java.util.*;

abstract class shape{
	abstract void area();
	void show(){
		System.out.println("\nAbstract class example");
	}
}
class square extends shape{
	int length;
	
	void input(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length:");
		length=sc.nextInt();
	}
	void area(){
		System.out.println("Length:"+length);
		System.out.println("area od length:"+(length*length));
	}
}
class rectangle extends shape{
	int length,breadth;
	
	void input(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length:");
		length=sc.nextInt();
		System.out.println("Enter breadth:");
		breadth=sc.nextInt();
	}
	void area(){
		System.out.println("Length : " + length);
		System.out.println("Breadth : " + breadth);
		System.out.println("Area Of Rectangle : " + (length * breadth));
	}
}

public class abstract_example{
	public static void main(String args[]){
		square s1=new square();
		s1.input();
		s1.area();
		s1.show();
		
		rectangle r1=new rectangle();
		r1.input();
		r1.area();
		r1.show();
		
	}
}
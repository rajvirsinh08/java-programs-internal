/*
	ABSTRACT CLASS: CLASS WITH ABSTRACT KEYWORDS
	ABSTRACT CLASS IS THE BLUEPRINT OF CLASS
	APPLY ABSTACTION  CONCEPT:SHOWING ONLY GENERAL INFORMATION
	
	ABSTRACT CLASS SHAPE
	{
		//NOT FINAL OR STATIC BY DEFAULT
		INT NUM=10;
		
		//HERE U DECIDE METHOD WILL BE ABSTRACT OR NOT
	}
*/
import java.util.*;
abstract class shape
{
	/*abstract method - without body must be overidden in sub class */
	abstract void area();
	abstract void perimeter();
	static void show()//if u want to call it by class name u need to declare it by static 
	{
		System.out.println("abstracrt class Example");
	}
}

class square extends shape
{
	int len;
	void input(Scanner sc)
	{
		System.out.println("Enter length");
		len=sc.nextInt();
	}
	void area()//OVERIDDEN           
	{
		System.out.println("Area of Square: "+(len*len));
	}
	void perimeter()//OVERIDDEN           
	{
		System.out.println("perimeter of Square: "+(4*len));
		System.out.println("______________________________");
	}
}
class rectangle extends shape
{
	int len;
	int bdht;
	void input(Scanner sc)
	{
		System.out.println("Enter length");
		len=sc.nextInt();
		System.out.println("Enter breadth");
		bdht=sc.nextInt();
	}
	void area()
	{
		System.out.println("\nArea of rectangle: "+(len*bdht));
	}
	void perimeter()//OVERIDDEN           
	{
		System.out.println("perimeter of Rectangle: "+ (2*(len+bdht)));
		System.out.println("______________________________");
	}
}

class abstract_class
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		square s=new square();
		//s.show();// if u want to call it by object name u don't need static keyword
		shape.show();
		s.input(sc);
		s.area();
		s.perimeter();
		rectangle r=new rectangle();
		r.input(sc);
		r.area();
		r.perimeter();
	}
}
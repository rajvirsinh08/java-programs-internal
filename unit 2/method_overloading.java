import java.util.*;

class Customer{
	int id;
	String name;
	String email;
	
	void Input(){
		System.out.println("Default value");
		id=0;
		name="";
		email="";
		Display();
	}
	void Input(int id){
		System.out.println("Only id provided");
		this.id=id;
		this.name="unknown";
		this.email="Not available";
		Display();
	}
	void Input(int id,String name,String email){
		System.out.println("All values provided");
		this.id=id;
		this.name=name;
		this.email=email;
		Display();
	}
	void Display(){
		System.out.println("Customer Details:");
		System.out.println("ID :"+id);
		System.out.println("name :"+name);
		System.out.println("email :"+email);
	}
	
}

public class method_overloading{
	public static void main(String args[]){
		Customer c1=new Customer();
		c1.Input();
		
		Customer c2=new Customer();
		c2.Input(101);
		
		Customer c3=new Customer();
		c3.Input(102,"vansh","vansh@gmail.com");
	}
}
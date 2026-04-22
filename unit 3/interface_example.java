import java.util.*;

interface theory{
	int th_no=3; //final by default
	
	void th_input(Scanner sc);
	void th_output();
}

interface practical{
	int p_no=2; //final by default
	
	void p_input(Scanner sc);
	void p_output();
}

class marksheet implements theory,practical{
	String th_subject[]=new String[th_no];
	int th_marks[]=new int[th_no];
	
	String p_subject[]=new String[p_no];
	int p_marks[]=new int[p_no];
	
	int total=0;
	double per=0;
	
	public void th_input(Scanner sc){
		for(int i=0;i<th_no;i++){
			System.out.println("Enter theory subject "+(i+1)+":");
			
			th_subject[i]=sc.next();
			
			System.out.println("Enter marks:");
			th_marks[i]=sc.nextInt();
		}
	}
	
	public void p_input(Scanner sc){
		for(int i=0;i<p_no;i++){
			System.out.println("Enter practical subject "+(i+1)+":");
			
			p_subject[i]=sc.next();
			
			System.out.println("Enter marks:");
			p_marks[i]=sc.nextInt();
		}
	}
	
	void calculate(){
		for(int i=0;i<th_no;i++){
			total+=th_marks[i];
		}
		for(int i=0;i<p_no;i++){
			total+=p_marks[i];
		}
		
		per=total/5.0;
	}
	
	public void th_output(){
		System.out.println("Theory marks--------");
		for(int i=0;i<th_no;i++){
			System.out.println(th_subject[i]+":"+th_marks[i]);
		}
	}
	
	public void p_output(){
		System.out.println("practical marks--------");
		for(int i=0;i<p_no;i++){
			System.out.println(p_subject[i]+":"+p_marks[i]);
		}
	}
}
public class interface_example
{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		marksheet m1=new marksheet();
		
		m1.th_input(sc);
		m1.p_input(sc);
		m1.calculate();
		m1.th_output();
		m1.p_output();
	}
}
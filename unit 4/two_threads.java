import java.util.*;

class Thread1 extends Thread{
	public void run(){
		for(int i=1;i<=5;i++){
			System.out.println("Thread1 running...");
			
			try{
				Thread.sleep(2000);
			}
			catch(Exception e){
				System.out.println("Error in Thread1");
			}
		}
	}
}

class Thread2 extends Thread{
	public void run(){
		for(int i=1;i<=5;i++){
			System.out.println("Thread2 running...");
			
			try{
				Thread.sleep(4000);
			}
			catch(Exception e){
				System.out.println("Error in Thread2");
			}
		}
	}
}

public class two_threads{
	public static void main(String args[]){
		Thread1 t1=new Thread1();
		Thread2 t2=new Thread2();
		
		t1.start();
		t2.start();
		
		System.out.println("Main Thread Running...");
	}
}
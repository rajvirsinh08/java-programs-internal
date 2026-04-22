import java.util.*;

class MyThread extends Thread{
	public void run(){
		for(int i=1;i<=5;i++){
			System.out.println("Thread running.."+i);
			
			try{
				Thread.sleep(1000);
			}
			catch(Exception e){
				System.out.println("error");
			}
		}
	}
}

public class thread_example{
	public static void main(String args[]){
		MyThread t1=new MyThread();
		
		t1.start();//start thread_example
		
		System.out.println("Main Thread Running...");
	}
}
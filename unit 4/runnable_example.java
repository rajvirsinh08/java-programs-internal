import java.util.*;

class MyRunnable implements Runnable{
	public void run(){
		for(int i=1;i<=5;i++){
			System.out.println("Runnable Thread:"+i);
			
			try{
				Thread.sleep(1000);
			}
			catch(Exception e){
				System.out.println("Error");
			}
		}
	}
}

public class runnable_example{
	public static void main(String args[]){
		MyRunnable m1=new MyRunnable();
		
		Thread t1=new Thread(m1);
		
		t1.start();
		
		System.out.println("Main Thread Running...");
	}
}
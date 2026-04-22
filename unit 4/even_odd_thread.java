import java.util.*;

class eventhread extends Thread{
	public void run(){
		for(int i=1;i<=50;i++){
			if(i%2==0){
				System.out.println("Even:"+i);
			}
		}
	}
}
class oddthread extends Thread{
	public void run(){
		for(int i=1;i<=50;i++){
			if(i%2!=0){
				System.out.println("Odd:"+i);
			}
		}
	}
}
public class even_odd_thread
{
	public static void main(String[] args)
	{
		eventhread t1 = new eventhread();
		oddthread t2 = new oddthread();
		
		t1.start();
		t2.start();
	}
}
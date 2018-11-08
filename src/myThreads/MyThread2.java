package myThreads;

public class MyThread2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the world of java");
		ADagency3 aa31= new ADagency3();
		ADagency3 aa32= new ADagency3();
		
		aa31.sAd="Alto k10";
		aa32.sAd="NissanMicra";
		
		//Calling functions without thread support
		
		//aa32.display();
		//aa31.start();
		aa32.start();
		aa31.display();
		System.out.println("2 Threads started");

	}

}
class ADagency3 extends Thread{
	String sAd;
	public void run(){
	try{
		display();
	}catch(Exception e){
		System.out.println("Thread Interrupted "+e.getMessage());
	}
}//end of run
	
	public void display()
	{
		int iCount=0;
		while(true){
			System.out.println(sAd+" | "+iCount);
			iCount++;
			try{
				Thread.currentThread().sleep(1000);
			}catch(Exception e){}
		}
	}
}

package myThreads;

import java.awt.DisplayMode;

public class MyThreads4 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.out.println("Welcome to the world of java Thread ");
		ADagency4 aa41 = new ADagency4();
		ADagency4 aa42= new ADagency4();
		
		aa41.sAd="Alto k10";
		aa42.sAd="NissanMicra";
		
		aa41.myStart();
		aa42.myStart();
		System.out.println(Thread.activeCount()+" threads started");
		
		controlThread(aa41, aa42);
		
		//Calling functions without thread support
		//aa41.display();
		//aa42.display();
	}
	public static void controlThread(ADagency4 ad1,ADagency4 ad2)
	{
		/*
		 * 1-1 to start Thread1
		 * 1-2 to Pause(wait) Thread1
		 * 1-3 to Resume(notify) Thread1
		 * 1-4 to stop Thread1 
		 * 
		 * 2-1 to start Thread2
		 * 2-2 to Pause(wait) Thread2
		 * 2-3 to Resume(notify) Thread2
		 * 2-4 to stop Thread2
		 */
		
		String sReply="a";
		
		while(true){
			sReply=inPut.readln();
			
			if(sReply.compareTo("1-1")==0){
				ad1.myStart();
				sReply="";
			}
			if(sReply.compareTo("1-2")==0){
				ad1.myWait();
				sReply="";
			}
			if(sReply.compareTo("1-3")==0){
				ad1.myNotify();
				sReply="";
			}
			if(sReply.compareTo("1-4")==0){
				ad1.myStop();
				sReply="";
			}
			if(sReply.compareTo("2-1")==0){
				ad2.myStart();
				sReply="";
			}
			if(sReply.compareTo("2-2")==0){
				ad2.myWait();
				sReply="";
			}	
			if(sReply.compareTo("2-3")==0){
				ad2.myNotify();
				sReply="";
			}	
			if(sReply.compareTo("2-4")==0){
				ad2.myStop();
				sReply="";
			}	
			if(sReply.compareTo("e")==0){
				System.out.println("Exiting....");
				System.exit(0);
			}
		}
	}

}

class ADagency4 extends Thread{
	String sAd;
	boolean bMakeItWait=false;
	boolean bStop=false;
	
	public void myStart()
	{
		if(this.isAlive()){
			System.out.println("Cannot ReStart a Running Thread");
		}
		else
		{
			try{
				this.start();
			}catch(IllegalThreadStateException itse){
				System.out.println("Could not start the thread "+itse.getMessage()); 
			}
		}
	}
	
	public void myWait()
	{
		if(this.isAlive())
		{
			bMakeItWait=true;
		}
		else
			System.out.println("Wait called on thread which is not alive");
		
	}
	
	public void myNotify(){
		if(this.isAlive())
		{
			synchronized (this) {
				bMakeItWait=false;
				notify();
			}
		}
		else
			System.out.println("Notify called on Thread which is not alive ");
	}
	
	public void myStop()
	{
		if(this.isAlive())
		{
			bStop=true;
		}
		else
			System.out.println("Stop called on thread which is not alive");
	}
	
	public void run()
	{
		try{
			display();
		}catch (Exception e) {
			System.out.println("Thread Interrupted "+e.getMessage());
		}
	}//end of run
	
	public void display() throws Exception{
		int iCount=0;
		while(true){
			synchronized (this) {
				if(bMakeItWait){
					wait();
				}
				if(bStop){
					return;
				}
			}//end of sync
			System.out.println(sAd+" | "+iCount);
			iCount++;
			try{currentThread().currentThread().sleep(1000);}catch(Exception e){}
		}
	}
}

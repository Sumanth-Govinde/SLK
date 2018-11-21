package assignments;

import java.util.Scanner;

public class assignment25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		if(b<=0){
			System.out.println("Invalid Input: Second number should be positive");
			return;
		}
		else{
			System.out.println("Quotient :"+ calc(a,b,'q'));
			System.out.println("Reminder :"+ calc(a,b,'r'));
		}
		

	}
	public static int  calc(int a,int b,char c){
		if(c=='q')
			return a/b;
		else 
			return a%b;
		
	}
}

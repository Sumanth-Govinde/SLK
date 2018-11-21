package assignments;

import java.util.Scanner;

public class assignment24 {

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
			System.out.println("Quotient :"+ a/b);
			System.out.println("Reminder :"+ a%b);
		}
	}

}

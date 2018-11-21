package assignments;

import java.util.Scanner;

public class assignment1 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter year:");
		int x=s.nextInt();
		boolean b=false;
		if(x % 400==0)
			b=true;
		else if(x%100==0)
			b=false;
		else if(x%4==0)
			b=true;
		if(b)
			System.out.println(x+" is a leap year");
		else
			System.out.println(x+" is not a leap year");

	}

}

package Assignment;

import java.util.Scanner;

public class asn10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first character");
		a=s.next().charAt(0);
		do
		{
		System.out.println("Enter next character");
		b=s.next().charAt(0);
		if(b>a)
			System.out.println("It is greater");
		else
			System.out.println("It is smaller");
		a=b;
		System.out.println("Do you want to continue? Y/N");
		c=s.next().charAt(0);
		}while(c=='y'||c=='Y');
		
	}

}

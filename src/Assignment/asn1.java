package Assignment;

import java.util.Scanner;

public class asn1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		boolean flag;
		Scanner a= new Scanner(System.in); 
		year=a.nextInt();
		if(year % 400 == 0)
			flag= true;
		else if(year % 100 == 0)
			flag= false;
		else if(year % 4==0)
			flag=true;
		else
			flag=false;
		if(flag==true)
			System.out.println("It is a leap year");
		else
			System.out.println("It is not a leap year");
	}

}

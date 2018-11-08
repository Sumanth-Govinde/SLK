package Assignment;

import java.util.Scanner;

public class asn4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		int c=0;
		Scanner a=new Scanner(System.in);
		str=a.next();
		char b=a.next().charAt(0);
		for(int i=0;i<str.length();i++)
			{
				if(str.charAt(i)==b)
					c++;
			}
		System.out.println("The occurance of character "+b+" is "+c);
		
	}

}

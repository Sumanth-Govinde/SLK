package assignments;

import java.util.Scanner;

public class assignment16 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter a string");
		String str=s.nextLine();
		int c=1;
		for(int i=0;i<str.length();i++)
			if(str.charAt(i)==' ')
				c++;
		System.out.println("number of words :"+c);
	}

}

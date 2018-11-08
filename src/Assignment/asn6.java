package Assignment;

import java.util.Scanner;

public class asn6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		int c=0;
		Scanner s=new Scanner(System.in);
		str=s.next();
		str.toLowerCase();
		for(int i=0; i<str.length();i++)
				if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
					c++;
		System.out.println(c);
	}

}

package Assignment;

import java.util.Scanner;

public class asn2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str,str1="";
		Scanner a=new Scanner(System.in);
		str=a.next();
		for(int i=str.length()-1;i>=0;i--)
			str1=str1+str.charAt(i);
		if(str.equals(str1))
			System.out.println("It is Palindrome");
		else
			System.out.println("It is not a Palindrome");
			
	}

}

package Assignment;

import java.util.Scanner;

public class asn9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a;
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String");
		a=s.next();
		System.out.println("Enter the number of times to repeat");
		n=s.nextInt();
		forty(a,n);
		
	}
	static void forty(String b,int c){
		for(int i=0;i<c;i++)
		{
			System.out.println(b);
		}
	}

}

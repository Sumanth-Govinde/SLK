package assignments;

import java.util.Scanner;

public class assignment7 {
	
	 char str1[]=new char[20];
	 char str2[]=new char[20];
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		assignment7 a=new assignment7() ;
		System.out.println("enter the 1st string");
		a.str1=s.next().toCharArray();
		System.out.println("enter the 2st string");
		a.str2=s.next().toCharArray();
		swap(a);
		System.out.println("After swapping");
		System.out.println("string 1: "+ new String(a.str1));
		System.out.println("string 2: "+ new String(a.str2));

	}

	static void swap(assignment7 a){
		char t;
		for(int i=0;i<a.str1.length;i++)
		{
			t=a.str1[i];
			a.str1[i]=a.str2[i];
			a.str2[i]=t;
		}
}
}
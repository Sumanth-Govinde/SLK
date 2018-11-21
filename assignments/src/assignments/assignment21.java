package assignments;

import java.util.Scanner;

public class assignment21 {
	char[] str1;
	char[] str2;
	public assignment21(int s1,int s2){
		str1=new char[s1];
		str2=new char[s2];
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter the 1st string");
		String str1=s.nextLine();
		System.out.println("enter the second string");
		String str2=s.nextLine();
		assignment21 a=new assignment21(str1.length(),str2.length());
		for(int i=0;i<str1.length();i++)
			a.str1[i]=str1.charAt(i);
		for(int i=0;i<str2.length();i++)
			a.str2[i]=str2.charAt(i);
			
		System.out.println("ENTER CHOICE");
		char c=s.next().charAt(0);
		if(c=='1')
			a.cpy();
		else if(c =='2')
			a.ccat();
	}
	public void cpy(){
		for(int i=0;i<this.str2.length;i++)
			this.str1[i]=this.str2[i];
		System.out.println("after copying:");
		for(int i=0;i<str1.length;i++)
			System.out.print(str1[i]);
		System.out.println();
		for(int i=0;i<str2.length;i++)
			System.out.print(str2[i]);
	}
	public void ccat(){
		char[] stra=new char[str1.length+str2.length];
		for(int i=0;i<str1.length;i++)
			stra[i]=str1[i];
		for(int i=str1.length,j=0;j<str2.length;j++,i++)
			stra[i]=str2[j];
		for(int i=0;i<stra.length;i++)
		System.out.print(stra[i]);
	}

}

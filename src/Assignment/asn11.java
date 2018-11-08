package Assignment;

import java.util.Scanner;

public class asn11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[25];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 25 numbers");
		for(int i=0;i<25;i++)
			a[i]=s.nextInt();
		fnct(a);
	}
	static void fnct(int b[])
	{
		int sml=b[0],lar=b[0];
		for(int j=1;j<25;j++)
		{
			if(b[j]<sml)
				sml=b[j];
			if(b[j]>lar)
				lar=b[j];
		}
		System.out.println("Largest is "+lar);
		System.out.println("Smallest is "+sml);
	}

}

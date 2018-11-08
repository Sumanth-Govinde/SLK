package Assignment;

import java.util.Scanner;

public class asn7 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr1=new char[10];
		char[] arr2=new char[10];
		Scanner s=new Scanner(System.in);
		arr1=s.next().toCharArray();
		arr2=s.next().toCharArray();
		System.out.println("arr1 :"+arr1);
		System.out.println("arr2 :"+arr2);
		swap(arr1,arr2);
		
	}
	static void swap(char[] arr3,char[] arr4){
		for(int i=0;i<10;i++)
		{
			char temp;
			temp=arr3[i];
			arr3[i]=arr4[i];
			arr4[i]=temp;
		}
		System.out.println("arr1 :"+arr3);
		System.out.println("arr2 :"+arr4);
	}

}

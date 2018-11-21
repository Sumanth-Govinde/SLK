package assignments;

import java.util.Scanner;

public class assignment32 {

	int[] ar;
	public assignment32(int n) {
		// TODO Auto-generated constructor stub
		 ar=new int[n];
	}
	
	public void read(){
		Scanner s=new Scanner(System.in);
		for(int i=0;i<this.ar.length;i++)
			ar[i]=s.nextInt();
	}
	
	public void sort(char ch){
		if(ch=='a'){
			for(int i=0;i<this.ar.length;i++)
				for(int j=i+1;j<this.ar.length;j++)
					if(ar[j]<ar[i]){
						int t=ar[i];
						ar[i]=ar[j];
						ar[j]=t;
					}
		}
		else if(ch=='d'){
			for(int i=0;i<this.ar.length;i++)
				for(int j=i+1;j<this.ar.length;j++)
					if(ar[j]>ar[i]){
						int t=ar[i];
						ar[i]=ar[j];
						ar[j]=t;
					}
		
		}
	}
	public void display(){
		for(int i=0;i<ar.length;i++)
			System.out.println(ar[i]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter array size");
		int n=s.nextInt();
		assignment32 a=new assignment32(n);
		System.out.println("enter array elements");
		a.read();
		System.out.println("press 'a' for ascending sort \n press 'd' for desending sort");
		char ch=s.next().charAt(0);
		a.sort(ch);
		a.display();
	}

}

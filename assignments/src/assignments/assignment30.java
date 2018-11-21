package assignments;

import java.util.Scanner;

public class assignment30 {
	int a,b;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		assignment30 a=new assignment30();
		a.a=s.nextInt();
		a.b=s.nextInt();
		System.out.println("before swapping");
		System.out.println("A:"+a.a);
		System.out.println("B:"+a.b);
		a.swap();
		System.out.println("after swapping");
		System.out.println("A:"+a.a);
		System.out.println("B:"+a.b);
		
	}
	public void swap(){
		int t;
		t=this.a;
		this.a=this.b;
		this.b=t;
	}

}

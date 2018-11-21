package assignments;

import java.util.Scanner;

public class assignment36 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter number of students");
		int n=s.nextInt();
		Student st[]=new Student[n];
		int i=0;
		while(true){
			System.out.println("choose what to do");
			char c=s.next().charAt(0);
			switch(c){
			
			case 'a':st[i]=new Student();
						st[i].read();
						break;
			case 'b':for(int j=0;j<i;j++)
						st[j].display();
			}
			System.out.println("do ypu want to continue? y/n");
			c=s.next().charAt(0);
			if(c=='n')
				return;
		}
		

	}

}

class Student{
	String sName;
	int regNo;
	int l_rNo;
	boolean r;
	

	public void read(){
		Scanner s=new Scanner(System.in);
		System.out.println("enter student name");
		this.sName=s.next();
		System.out.println("enter registratin number");
		this.regNo=s.nextInt();
		System.out.println("enter 1 for dayscholar and 2 for resident ");
		int c=s.nextInt();
		if(c==1)
			System.out.println("enter locker no");
		else{
			System.out.println("enter room no");
			this.r=true;
		}
		this.l_rNo=s.nextInt();
	}
	
	public void display(){
		System.out.println("Name :"+sName);
		System.out.println("Registraton Number:"+regNo);
		if(r)
			System.out.println("Room No:"+l_rNo);
		else
			System.out.println("Locker No:"+l_rNo);
	}

}

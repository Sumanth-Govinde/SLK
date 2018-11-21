package assignments;

import java.util.Scanner;

public class assignment22 {
	int sMarks;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		assignment22 a=new assignment22();
		Scanner s=new Scanner(System.in);
		System.out.println("enter st6udent marks");
		a.sMarks=s.nextInt();
		a.display();
	}
	public void display(){
		if(this.sMarks>100)
			System.out.println("invalid marks");
		else if(this.sMarks>85)
			System.out.println("excellent");
		else if(this.sMarks>70)
			System.out.println("good");
		else if(this.sMarks>50)
			System.out.println("Satisfactory");
		else
			System.out.println("failed");
	
	}
}

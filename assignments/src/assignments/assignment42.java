package assignments;

import java.util.Scanner;

public class assignment42 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Employee en[]=new Employee[100];
		while(true){
			System.out.println("current employee count is"+Employee.eCount);
			System.out.println("do you want to add a new employee y/n");
			char ch=s.next().charAt(0);
			if(ch=='y'){
				System.out.println("enter name");
				String name=s.next();
				System.out.println("enter emp no");
				int no=s.nextInt();
				en[Employee.eCount+1]=new Employee(name,no);
			}
			else
				System.exit(0);
		}

	}

}
class Employee{
	String eName;
	int eId;
	static int eCount=0;
	public Employee(String s,int eid) {
		this.eName=s;
		this.eId=eid;
		this.eCount++;
	}
}

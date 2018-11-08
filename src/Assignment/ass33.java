package Assignment;

import java.util.Scanner;

public class ass33 {
	int items;
	int amount;
	float dis_am;
	void read(int a,int b)
		{
			items=a;
			amount=b;
		}
	void cal()
	{
		
		float d=(float) ((items>2)?(0.20):(0.10));
		dis_am=(float) (amount-(amount*d));
		System.out.println("Amount after "+d*100+"% discount: "+dis_am);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ass33 a1=new ass33();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no of items bought ");
		int a=s.nextInt();
		System.out.println("Enter the total amount ");
		int b=s.nextInt();
		if(a<1||b<=0)
			System.out.println("Invalid Input");
		else
		{
		a1.read(a,b);
		a1.cal();
		s.close();
		}
	}

}

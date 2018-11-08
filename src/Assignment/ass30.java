package Assignment;
import java.util.Scanner;

public class ass30 {
	int x1,x2;
	
	void swap()
	{
		int temp;
		temp=x1;
		x1=x2;
		x2=temp;
	}
	
	void display()
	{
		System.out.println(x1 +"   "+ x2);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ass30 o1=new ass30();			//creating first object
		Scanner s=new Scanner(System.in);
		
		o1.x1=s.nextInt();		//Input x1
		o1.x2=s.nextInt();		//input x2
		
		ass30 o2=o1; //Creating another object referencing it to first object.
		
		System.out.println("Values of object 1 before swapping: ");
		o1.display();
		
		o2.swap();
		
		System.out.println("Values of object 1 after swap function called with respect to second object: ");
		o1.display();
		s.close();
	}

}

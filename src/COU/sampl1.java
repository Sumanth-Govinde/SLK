package COU;

import java.util.Scanner;

public class sampl1 {
	public static void main(String[] args) {				//Main program starts here
		// TODO Auto-generated method stub
		CustomerDet[] c=new CustomerDet[5];
		char ch; int b=0,n=0;
		Scanner s=new Scanner(System.in);
		
		
		do{
			System.out.println("Menu:\n1. Add customer\n2. Search customer based on ID\n3. Display all customers\n");
			b=s.nextInt();
			
			switch(b)
			{
			case 1:
				{
					System.out.println("Enter the total number of customers to be added (Maximum of 5)");
					n=s.nextInt();
					if(n<1 || n>5)
						{
						System.out.println("Invalid input");
						}
					else
					{
						for(int i=0;i<n;i++)
						{
							c[i]=new CustomerDet();			//object initialization
						}
						
						for(int i=0;i<n;i++)
						{
							c[i].save_det(i);
						}
					}
					break;
				}
			case 2:
				{
					System.out.println("Enter the customer Id : ");
					int d;
					d=s.nextInt();
					c[d-1].Dis_Each_Cus();
					break;
				}
			case 3:
				{
					System.out.print("All the customers details are below: ");
					for(int i=0;i<n;i++)
					{
						c[i].display_all();
					}
					break;
				}
			default:
				System.out.println("Invalid choice. Please try again!");
				break;
			}
		
			System.out.println("Do you want to continue? y/n");
			ch=s.next().charAt(0);
		}while(ch=='y');
	s.close();
	}

}

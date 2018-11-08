package COU;

import java.util.Scanner;

public class CustomerDet {
	private int ID,age;
	private String Name,address;
	
	public void save_det(int a)	//To add customer details
	{
		Scanner f=new Scanner(System.in);
		this.ID=a+1;
		System.out.println("Enter the details of customer:");
		System.out.println("Name: ");
		this.Name=f.next();
		System.out.println("Address: ");
		this.address=f.next();
		System.out.println("Age: ");
		this.age=f.nextInt();
	}
	
	public void Dis_Each_Cus()     //To display customer based on ID
	{
		System.out.println("The customer details are as follows: ");
		System.out.println("Customer ID : "+ID);
		System.out.println("Customer Name : "+Name);
		System.out.println("Customer address : "+address);
		System.out.println("Customer age : "+age);
	}
	
	public void display_all()	 //To display all customer details
	{
		System.out.println("\n-----------------------------------------");
		System.out.println("Customer ID : "+ID);
		System.out.println("Customer Name : "+Name);
		System.out.println("Customer address : "+address);
		System.out.println("Customer age : "+age);
		System.out.println("-----------------------------------------\n");
	}

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
					try{
					c[d-1].Dis_Each_Cus();
					}catch(Exception e){
						System.out.println("Invalid ID");
					}
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

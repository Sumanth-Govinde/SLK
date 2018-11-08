package oops;

public class MyAbstractClass10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Demo on abstract class");
		TaxRule tr;
		//tr=new TaxRule(); //cannot createObject for abstract Class
		tr=new IndiaTax();
		tr.display();
		//tr.welcomeNote(); //cannot access this function
	}

}

abstract class TaxRule
{
	abstract void display();
	
	int calculate(int iNetIncome)
	{
		if(iNetIncome>500000)
		{
			return 5000;
		}
		else
			return 1000;
	}
}

class IndiaTax extends TaxRule
{
	void display()
	{
		System.out.println("Tax as per Indian rule "+calculate(499000) );
	}
	
	void welcomeNote()
	{
		System.out.println("Welcome to India Tax class");
	}
}



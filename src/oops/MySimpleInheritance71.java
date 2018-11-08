//Demo for simple inheritance  with example

package oops;

public class MySimpleInheritance71 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EAccount ea;
		ea=new EAccount(); //memory occupied=AccountHolder+EAccount
		ea.eadisplay();
		ea.ahdisplay(); //this is also possible
	}

}

class AccountHolder
{
	int iAccountNumber;
	String sName;
	double dBalance;
	
	AccountHolder()
	{
	iAccountNumber=1;
	sName="Nithin";
	dBalance=56000.50;
	System.out.println("Inside AccountHolder Constructor");
	}
	
	void ahdisplay()
	{
		System.out.println("AH display function");
		System.out.println("Account Number: "+ iAccountNumber);
		System.out.println("Name: "+sName);
		System.out.println("Balanace: "+dBalance);
	}
}

class EAccount extends AccountHolder
{
	String sCardNo;
	
	EAccount() {
		// TODO Auto-generated constructor stub
		sCardNo = "1111 2222 4444 6666";
		System.out.println("Inside EAccount constructor");
	}
	
	void eadisplay()
	{
		System.out.println("EAccount Display function");
		System.out.println("CardNO: "+sCardNo);
		ahdisplay();
	}
}

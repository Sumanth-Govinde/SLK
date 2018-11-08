package oops;

public class MySuperConstructor9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDev md;
		//md=new MyDev(); //memory occupied=base+dev
		md=new MyDev("Nithin");
		//md.devDisplay();
		md.baseDisplay(); //this is also possible
	}

}


class MyBase
{
	String sY;
	
	MyBase() {
		// TODO Auto-generated constructor stub
		sY="Bond";
		System.out.println("Inside base constructor");
	}
	
	MyBase(String s)
	{
		sY="MyBase Value"+s;
		System.out.println("Inside MyBase constructor with parameter");
	}
	
	void baseDisplay()
	{
		System.out.println("Value of sY: "+sY);
	}
}

class MyDev extends MyBase
{
	int iZ;
	
	MyDev() {
		// TODO Auto-generated constructor stub
		super("Java Bond");
		iZ=15;
		
		System.out.println("Inside my dev constructor");
	}
	
	MyDev(String ss)
	{
		super(ss);
		System.out.println("Inside my dev constructor with parameters");
	}
	
	void devDisplay()
	{
		System.out.println("\ndevDisplay function");
		System.out.println("Vaue of iZ: "+iZ);
	}
}
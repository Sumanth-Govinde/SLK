//Demo for Access Specifier
//public,private, protected and default(friend)

public class MyAccessSpecifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyBase mb;
		mb=new MyBase();
		mb.defaultDisplay();
		mb.pubDisplay();
		//mb.pvtDisplay();  //private function cannot be called
		mb.prtDisplay(); 
	}
}
	
	class MyBase
	{
		private int iX;
		private String iY;
		
		public MyBase()
		{
			iX=5;
			iY="Bond";
			System.out.println("Inside MyBase Constructor");
		}
		
		void defaultDisplay()
		{
			//Any class within a package can use this method
			//using object of this class; also called a friend specifier
			System.out.println("Default display function(friend)");
			
			System.out.println("Value of iX "+iX);
			System.out.println("Value of iY "+iY);
		}
		
		public void pubDisplay()
		{
			//Any class can use this method using object of this class
			System.out.println("\nPublic display function");
			System.out.println("Value of iX: "+iX);
			System.out.println("Value of iY "+iY);
		}
		
		public void pvtDisplay()
		{
			//Only current class can use this method 
			System.out.println("\nPrivate display function");
			System.out.println("Value of iX: "+iX);
			System.out.println("Value of iY "+iY);
		}
		
		public void prtDisplay()
		{
			//Any class can use this method using object of this class //within a package
			//Class in another package can use this method only
			//when it inherits
			System.out.println("\nProtected display function");
			System.out.println("Value of iX: "+iX);
			System.out.println("Value of iY "+iY);
		}
	}

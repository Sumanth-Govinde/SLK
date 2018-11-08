package nokia.india;

import nokia.*;

public class Employee {
	public void displayPub()
	{
		System.out.println("n.i public : "+this.toString());
	}
	
	private void displayPvt()
	{
		System.out.println("n.i private : "+this.toString());
	}
	
	protected void displayPrt()
	{
		System.out.println("n.i protected : "+this.toString());
	}
	
	void displayDefault()
	{
		System.out.println("n.i friend : "+this.toString());
	}

}

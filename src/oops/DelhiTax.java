package oops;

public class DelhiTax implements ITax{
	
	public void dispTax(){
		System.out.println("Display Delhi Tax Details ");
	}
	
	public double HraExmpt(double dblBasic)
	{
		System.out.println("Delhi HRA Tax Details ");
		//50% of basic
		double temp;
		temp = (dblBasic *50)/100;
		return temp;
	}
	
	public double InsuranceExmpt(double dblBasic){
		System.out.println("Delhi Insurance Tax Details ");
		double temp;
		temp = (dblBasic * 10)/100;
		return temp;
	}
	
	public double TravelExmpt(double dblBasic)
	{
		System.out.println("Delhi Travel Tax Details: ");
		double temp;
		temp = ((dblBasic*2)/100) + metroExmpt(dblBasic);
		return temp;
	}
	
	public double metroExmpt(double dblBasic)
	{
		System.out.println("Delhi Travel Metro Tax Details ");
		return (dblBasic*1)/100;
	}

}

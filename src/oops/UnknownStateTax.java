package oops;

//public class UnknownStateTax implements ITax  {
public class UnknownStateTax{
	//Sample class with no relation test
	public void dispTax(){
		System.out.println("Display UnknownState Tax Details ");
	}
	
	public double HraExmpt(double dblBasic)
	{
		System.out.println("UnknownState HRA Tax Details ");
		//50% of basic
		double temp;
		temp = (dblBasic *50)/100;
		return temp;
	}
	
	public double InsuranceExmpt(double dblBasic){
		System.out.println("UnknownState Insurance Tax Details ");
		double temp;
		temp = (dblBasic * 10)/100;
		return temp;
	}
	
	public double TravelExmpt(double dblBasic)
	{
		System.out.println("UnknownState Travel Tax Details: ");
		double temp;
		temp = ((dblBasic*2)/100) + metroExmpt(dblBasic);
		return temp;
	}
	
	public double metroExmpt(double dblBasic)
	{
		System.out.println("UnknownState Travel Metro Tax Details ");
		return (dblBasic*1)/100;
	}
}

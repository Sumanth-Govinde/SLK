package oops;

public class KarnatakaTax implements ITax {
	
	//public void dispTax(){
	//	System.out.println("Display Karnataka Tax Details ");
	//}
	
	public double HraExmpt(double dblBasic)
	{
		System.out.println("Karnataka HRA Tax Details ");
		//50% of basic
		double temp;
		temp = (dblBasic *40)/100;
		return temp;
	}
	
	public double InsuranceExmpt(double dblBasic){
		System.out.println("Karnataka Insurance Tax Details ");
		double temp;
		temp = (dblBasic * 10)/100;
		return temp;
	}
	
	public double TravelExmpt(double dblBasic)
	{
		System.out.println("Karnataka Travel Tax Details: ");
		double temp;
		temp = ((dblBasic*30)/100) + donation(dblBasic);
		return temp;
	}
	
	public double donation(double dblBasic)
	{
		System.out.println("Karnataka Donation Exmpt ");
		double temp;
		temp = (dblBasic*3)/100;
		return temp;
	}


}

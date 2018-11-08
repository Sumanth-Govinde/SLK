package oops;

public class TaxClient {

	//Below line well be done by another program or module
	static Object[] taxContainer = { new DelhiTax(), new UnknownStateTax(), new KarnatakaTax() };
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//normalMethod();
		generalizedToSpecilaized();
		
	}

	

	/*private static void normalMethod(){
		//for creating objects of specialized class
		double dBasic,dblTaxExmpt1,dblTaxExmpt2;
		dBasic=10000;
		
		DelhiTax dt;
		dt = new DelhiTax();
		dblTaxExmpt1 = dt.HraExmpt(dBasic) + dt.InsuranceExmpt(dBasic)+ dt.TravelExmpt(dBasic);
		System.out.println("Delhi Tax: "+dblTaxExmpt1+"\n");
		
		KarnatakaTax kt;
		kt = new KarnatakaTax();
		dblTaxExmpt2 = kt.HraExmpt(dBasic) + kt.InsuranceExmpt(dBasic)+ kt.TravelExmpt(dBasic);
		System.out.println("Karnataka Tax: "+dblTaxExmpt2+"\n");
		
		System.out.println("Delhi +karnataka Tax: "+(dblTaxExmpt1 +dblTaxExmpt2));
		
		}
	
	*/
	private static void generalizedToSpecilaized() {
		// TODO Auto-generated method stub
		//usage of Interface/Abstract/Virtual class
		//its ability to point to a related specialized class
		//its ability to change its own behavior based on it association
		
		double dBasic, dblStatTaxExmpt, dblTaxExmpt;
		dBasic=10000;
		
		ITax itObj= null;
		dblTaxExmpt=0;
		dblStatTaxExmpt=0;
		for(Object curObj:taxContainer){
			
			if(curObj instanceof ITax) {
				itObj= (ITax) curObj;
				dblStatTaxExmpt =0;
				dblStatTaxExmpt = itObj.HraExmpt(dBasic)+itObj.InsuranceExmpt(dBasic)+itObj.TravelExmpt(dBasic);
				
				//Use the below if you have custom package
				//9 is the length of has code (Some times is 8)
				//System.out.println(itObj.toString().substring(15, (itObj.toString().length() -9))+ ":" +dblStatTaxExmpt+"\n");
				
				//Use below line if you using default package
				System.out.println(itObj.toString().substring(0,(itObj.toString().length() -9))+":"+ dblStatTaxExmpt+ "\n");
				
				//prints the class name is point to with  has code (9 chars)
				//System.out.println(itObj.toString());
				//System.out.println(itObj.toString().length());
				
				dblTaxExmpt+=dblStatTaxExmpt;
				
				
			}
		}
		System.out.println("Total tax: "+dblTaxExmpt);
	}
}

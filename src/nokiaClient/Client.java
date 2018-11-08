package nokiaClient;

import nokia.*;
import nokia.india.PayRoll;

public class Client {
	public static void main(String[] args)
	{
		Employee eObj= new Employee();
		eObj.display();
		//error as calls is declared default {friend}
		//Finance fObj = new Finance();
		
		//full name when class name conflicts
		nokia.india.Employee eObj1= new nokia.india.Employee();
		eObj1.displayPub();
		
		PayRoll prObj1=new PayRoll();
		prObj1.display();
	}

}

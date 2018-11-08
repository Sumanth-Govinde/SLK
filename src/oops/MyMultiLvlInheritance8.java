//Demo for Multilevel inheritance and overriding example
package oops;

public class MyMultiLvlInheritance8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Automobile nm; //base class pointing to derived class
		
	/*	NissanMicra nm;
		nm = new NissanMicra();
		nm.display();
		nm.disp();*/
		
		System.out.println("-----------------");
		//Ability to point to functions of dev class
		
		Automobile a;
		a = new NissanMicra();
		a.display();
		//a.disp();
		 
	
		/*
		//aObj points to different class at run time
		Automobile aObj;
		//E1 or E2 or E3
		//aObj = Factory.getObject("E3");
		aObj=Factory.getObject(args[0]);
		aObj.display();*/
	}

}

class Automobile
{
	int iwheels;
	String sEngineType;
	//....
	
	Automobile()
	{
		iwheels=2;
		sEngineType="Petrol";
		System.out.println("Inside Automobile Constructor");
	}
	
	void display()
	{
		System.out.println("No of wheels: "+iwheels);
		System.out.println("Engine type: "+sEngineType);
	}
}


class car extends Automobile
{
	int iNoOfDoors;
	
	car()
	{
		iNoOfDoors=5;
		iwheels=4;
		sEngineType="Petrol/Diesel";
		System.out.println("Inside Car Constructor");
	}
	
	void display()
	{
		System.out.println("No of Doors: "+iNoOfDoors);
		super.display();
	}
}

class NissanMicra extends car
{
	String sStartMode;
	
	public NissanMicra() {
		// TODO Auto-generated constructor stub
		sStartMode="SelfStart";
		System.out.println("Inside Nissan Constructor");
	}
	
	void display()
	{
		System.out.println("StartMode: "+sStartMode);
		super.display();
	}
	
	void disp()
	{
		System.out.println("Inside NM.disp()");
	}
	
}


class Factory
{
	public static Automobile getObject(String carCode)
	{
		if(carCode.equals("E1"))
			return new Automobile();
		if(carCode.equals("E2"))
			return new car();
		if(carCode.equals("E3"))
			return new NissanMicra();
		
		return null;//check the failure at the run time
		//return new Bill(); //compile time error as return type is automobile
	}
}
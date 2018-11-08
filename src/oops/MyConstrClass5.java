package oops;

public class MyConstrClass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 sObj;
		sObj = new Student2(); //default constructor
		sObj.display();
		
		sObj = new Student2(7,"Nithin",21); //overloaded constructor
		sObj.display();
		
	}

}

class Student2
{
	int iRegNo;
	String sName;
	int iAge;
	
	public Student2()
	{
		iRegNo=111;
		sName="NoName";
		iAge=111;
		System.out.println("Default constructor ");
	}
	
	public Student2(int iRegNo, String sName, int iAge)
	{
		this.iRegNo=iRegNo;
		this.sName=sName;
		this.iAge=iAge;
		System.out.println("Param Constructor ");
	}
	
	protected void finalize()
	{
		//do clean up of non java objects,
		//have separate function to release java resources
		System.out.println("Destructor ");
	}
	
	public void display()
	{
		System.out.println("Reg No: "+iRegNo);
		System.out.println("Student: "+sName);
		System.out.println("Age: "+iAge);
	}
}

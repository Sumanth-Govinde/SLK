//Demo for using constructors chaining and overload constructor
//Demo for "this" pointer

package oops;

public class MyConstrChain51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student3 sObj;
		sObj=new Student3(); //default constructor
		sObj.display();
		
		sObj=new Student3(2,"Nithin",23); //overloaded constructor
		sObj.display();
	}

}


class Student3
{
	int iRegNo;
	String sName;
	int iAge;
	
	public Student3()
	{
		//iAge=22; //this keyword to be first line during chaining
		this(111,"NoName",22);
		iAge=22;
	}
	
	public Student3(int iRegNo,String sName,int iAge)
	{
		this.iRegNo=iRegNo;
		this.sName=sName;
			if(iAge<=22)
				this.iAge=18;
			else
				this.iAge=iAge;
	}
	
	protected void finalize()
	{
		//do clean up of non java objects,
				//have separate function to release java resources
				System.out.println("Destructor ");
				}
	
	public void display()
	{
		System.out.println("regno: "+iRegNo);
		System.out.println("Student: "+sName);
		System.out.println("Age: "+iAge);
	}
}
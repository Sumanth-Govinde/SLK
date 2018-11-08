package oops;
/*
 * In java function parameters are always call by value.
 * Class passed to a function is also call by value call by reference is possible 
 */


public class CallByVRClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Command cObj;
		cObj=new Command();
		
		//Call By value
		//callByValueForInBuiltType(cObj);
		
		//callByValueForCustomType(cObj);
		
		//Call by reference
		callByRefWithMemberofClass(args,cObj);
		
		//callByRefUsingWrapper(cObj);
		
		//wrapper restricted to student
		//WrapperRestrictedToStudent(cObj);
	}
	
	private static void callByValueForInBuiltType(Command cObj)
	{
		//call by value for inbuilt type
		String s;
		System.out.println("call by value with inbuilt type ");
		s="NoName";
		System.out.println(s);
		cObj.getSrvName(s);
		System.out.println(s);
	}
	
	private static void callByValueForCustomType(Command cObj)
	{
		//call By Value For Custom Type
		//To achieve call by reference for custom type use wrapper class
		Student1 sOb1,sOb2;
		sOb1 = new Student1();
		sOb1.iRegNo=1;
		sOb1.sName="Nithin";
		sOb1.iAge=22;
		
		sOb2 = new Student1();
		sOb2.iRegNo=2;
		sOb2.sName="Tanvir";
		sOb2.iAge=23;
		
		System.out.println("call by value with Custom type ");
		sOb1.display();
		sOb2.display();
		cObj.Swap(sOb1, sOb2);
		System.out.println("After Student swap ");
		sOb1.display();
		sOb2.display();
	}
	
	private static void callByRefWithMemberofClass(String[] arg, Command cObj)
	{
		//Call by reference with members of a class
		boolean bStatus=false;
		Student1 sObj;
		sObj=new Student1();
		
		System.out.println("Call by reference for class members");
		sObj.iRegNo=3;
		sObj.sName="Ravi";
		sObj.iAge=24;
		sObj.display();
		sObj.iRegNo=Integer.parseInt(arg[0]);
		bStatus=cObj.query(sObj);
		System.out.println("Query Status : "+bStatus);
		sObj.display();
	}
	
	private static void callByRefUsingWrapper(Command cObj)
	{
		//Call By Ref Using Wrapper
		Student1 s1,s2;
		s1=new Student1();
		s1.iRegNo=1;
		s1.sName="Nithin";
		s1.iAge=22;
		
		s2=new Student1();
		s2.iRegNo=2;
		s2.sName="Tanvir";
		s2.iAge=23;
		
		StudentWrapper sw1,sw2;
		sw1=new StudentWrapper();
		sw2=new StudentWrapper();
		
		sw1.stud=s1;
		sw2.stud=s2;
		System.out.println("Call by reference using wrapper class ");
		sw1.stud.display();
		sw2.stud.display();
		cObj.SwapWithWrapper(sw1, sw2);
		System.out.println("After Student swap ");
		sw1.stud.display();
		sw2.stud.display();
	}


}

class Student1
{
	int iRegNo;
	String sName;
	int iAge;
	
	public void display()
	{
		System.out.println("Reg no: "+iRegNo);
		System.out.println("Name :"+sName);
		System.out.println("Age: "+iAge);
	}
}

class StudentWrapper
{
	Student1 stud;
}

class Command
{
	public void getSrvName(String sSrvName)
	{
		sSrvName="localhost";
		System.out.println("Server Name inside getSrvName: "+sSrvName);
	}
	
	public boolean query(Student1 studObj)
	{
		boolean bStatus=false;
		
		if(studObj.iRegNo==0)
			bStatus=false;
		
		if(studObj.iRegNo==7)
		{
			studObj.sName="Bond";
			studObj.iAge=28;
			bStatus=true;
		}
		
		if(studObj.iRegNo==8)
		{
			studObj.sName="Java Bond";
			studObj.iAge=29;
			bStatus=true;
		}
		return bStatus;
	}
	
	public void Swap(Student1 sObj1, Student1 sObj2)
	{
		Student1 sTemp;
		sTemp=sObj1;
		sObj1=sObj2;
		sObj2=sTemp;
		
		System.out.println("Inside Swap function");
		sObj1.display();
		sObj2.display();
		System.out.println("---------------------");
	}
	
	public void SwapWithWrapper(StudentWrapper swObj1, StudentWrapper swObj2) 
	{
		StudentWrapper swTemp= new StudentWrapper();
		swTemp.stud=swObj1.stud;
		swObj1.stud=swObj2.stud;
		swObj2.stud=swTemp.stud;
	}
}

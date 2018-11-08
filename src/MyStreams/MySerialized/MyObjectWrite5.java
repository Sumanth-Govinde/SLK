package MyStreams.MySerialized;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class MyObjectWrite5 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Employee sObject= new Employee(Integer.valueOf(args[0]),args[1],Float.valueOf(args[2]));
		
		try{
			//write object any times as required before closing; for the
			//read program to work
			//when you run this program multiple times, it will over write the data file.
			FileOutputStream fos=new FileOutputStream("DB-" +args[0] +args[1] + ".dat");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(sObject);
			sObject= new Employee(2, "Tanvir",33);
			oos.writeObject(sObject);
			
			fos.close();
		}catch(IOException e){
			System.out.println("Object not written "+e.getMessage());
		}

	}

}

//class Employee{
class Employee implements Serializable{
	
	public int iEmpNo;
	public String sName;
	public float fAge;
	private String sKey;
	
	public Employee(int IEmpNo,String sName,float fAge)
	{
		this.iEmpNo=iEmpNo;
		this.sName=sName;
		this.fAge=fAge;
		sKey="iso-5678";
	}
	
	public void display()
	{
		System.out.println("Employee Details");
		System.out.println("Emp No: "+iEmpNo);
		System.out.println("Name: "+sName);
		System.out.println("Age: "+fAge);
		System.out.println("Private Key: "+sKey);
	}
}

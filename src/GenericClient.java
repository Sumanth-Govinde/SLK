
public class GenericClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Swapping will not work in java,as parameters are call by value
		 */
		//swapping with generic code
		GenericUtility guObj=new GenericUtility();
		genericCustomerByRefSwap(guObj);
		//genericIntegerByRefSwap(guObj);
	}
	
	private static void genericCustomerByRefSwap(GenericUtility guObj){
		
		ByRef<Customer> br1=new ByRef<Customer>();
		ByRef<Customer> br2=new ByRef<Customer>();
		
		//error as customer is fixed during declaration
		//br2.obj=new Employee(200,"Ani");
		
		System.out.println("\nGeneric Customer By ref Swap");
		System.out.println("Before swap -br1, br2");
		br1.obj.display();
		br2.obj.display();
		
		guObj.swapByRef(br1, br2);
		
		System.out.println("After Swap: -br1,br2");
		br1.obj.display();
		br2.obj.display();
		
		System.out.println("\n\n");
		
		/*
		ByRef<Employee>br3=new ByRef<Employee>();
		br3.obj=new Employee(1000,"Nithin");
		//Compile time error as types are checked
		//guobj.swapByRef(br1,br3);
		
		br1.obj.display();
		br2.obj.display();
		br3.obj.display();
		//run time error (Type mismatch)
		 */
	}
	
	private static void genericIntegerByRefSwap(GenericUtility guObj){
		ByRef<Integer>iNum1=new ByRef<Integer>();
		ByRef<Integer>iNum2=new ByRef<Integer>();
		iNum1.obj=100;
		iNum2.obj=200;
		
		System.out.println("iNUm1: "+iNum1.obj);
		System.out.println("iNUm2: "+iNum2.obj);
		
		guObj.swapByRef(iNum1, iNum2);
		
		System.out.println("iNUm1: "+iNum1.obj);
		System.out.println("iNUm2: "+iNum2.obj);
	}

}




class Employee
{
	int No;
	String Name;
	
	public Employee(){
		No=0;
		Name="";
	}
	
	public Employee(int No,String Name){
		this.No=No;
		this.Name=Name;
	}
	
	public void display()
	{
		System.out.println("No: "+No);
		System.out.println("Name: "+Name);
	}
	
	public String toString(){
		return No + "-" + Name;
	}
	
}

class Customer
{
	public int Id;
	public String Name;
	
	public Customer(){
		Id=0;
		Name="";
	}
	
	public Customer(int Id, String Name){
		this.Id=Id;
		this.Name=Name;
	}
	
	public void display(){
		System.out.println("ID: "+Id);
		System.out.println("Name: "+Name);
	}
	
	public String toString(){
		return Id + "-" + Name;
	}
}

//Class level generic
class ByRef<T>{
	T obj;
}


class GenericUtility{
	//Method level generic
	public <T> void swapByRef(ByRef<T> val1,ByRef<T> val2){
		System.out.println("GenericUtility.swapByRef(ByRef,ByRef) invoked");
		ByRef<T> tempDynamicKnopwnType =new ByRef<T>();
		
		tempDynamicKnopwnType.obj=val1.obj;
		val1.obj=val2.obj;
		val2.obj=tempDynamicKnopwnType.obj;
	}
	
	public void swapByRefWithoutMethodGenerics(ByRef val1,ByRef val2){
		System.out.println("GenericUtility.swapByRef(ByRef,ByRef) invoked");
		ByRef temp=new ByRef();
		temp.obj=val1.obj;
		val1.obj=val2.obj;
		val2.obj=temp.obj;
	}
}



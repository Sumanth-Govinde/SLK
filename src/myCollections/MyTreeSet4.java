package myCollections;
import java.util.*;
public class MyTreeSet4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSetWithInt();
		//TreeSetWithEmp();
	}

	public static void TreeSetWithInt(){
		TreeSet<Integer> tree=new TreeSet<Integer>();
		
		tree.add(12);
		tree.add(23);
		tree.add(40);
		tree.add(6);
		Iterator<Integer>iterator;
		iterator=tree.iterator();
		
		System.out.println("Tree set data: ");
		while(iterator.hasNext()){
			System.out.println(iterator.next()+" ");
		}
		
		System.out.println("\nTree Size: "+tree.size());
		System.out.println("Is the tree empty: "+tree.isEmpty());
		System.out.println("Has element 23 been removed: "+tree.remove(23));
		iterator=tree.iterator();
		
		//Displaying the tree set data
		System.out.println("Tree set data: ");
		while(iterator.hasNext()){
			System.out.println(iterator.next()+" ");
		}
	}
	
	public static void TreeSetWithEmp(){
		TreeSet<Employee>tree=new TreeSet<Employee>();
		
		Employee e1,e2,e3,e4;
		e1=new Employee();
		e2=new Employee();
		e3=new Employee();
		e4=new Employee();
		
		e1.iNo=100;
		e1.sName="Nithin";
		e1.iAge=20;
		
		e1.iNo=3;
		e1.sName="Tanvir";
		e1.iAge=21;
		
		e1.iNo=2;
		e1.sName="Ron";
		e1.iAge=22;
		
		e1.iNo=4;
		e1.sName="Vishwanath";
		e1.iAge=20;
		
		tree.add(e1);
		tree.add(e2);
		tree.add(e3);
		tree.add(e4);
		
		Iterator<Employee>iterator;
		iterator=tree.iterator();
		
		System.out.println("Employee in Treeset");
		while(iterator.hasNext()){ iterator.next().display();}
		
		System.out.println("\nEmployee Tree size : "+tree.size());
		System.out.println("Is the Employee Tree empty: "+tree.isEmpty());
		System.out.println("HAs employee no 2 been removed: "+tree.remove(e3));
		iterator=tree.iterator();
		
		System.out.println("Employee Treeset after Employee 3 has been removed");
		//Displaying the tree set data System.out.print("Tree set data: ");
		while(iterator.hasNext()){
			iterator.next().display();
		}
	}
}


//Use interface instead of object here
class Employee implements Comparable<Object>
{
	public int iNo;
	public String sName;
	public int iAge;
	
	public void display(){
		pl("no: "+iNo);
		pl("Name: "+sName);
		pl("Age: "+iAge);
	}
	
	private void pl(String s)
	{
		System.out.println(s);
	}
	
	@Override
	public int compareTo(Object RHS) throws ClassCastException{
		if(!(RHS instanceof Employee))
			throw new ClassCastException("Object cannot be compared");
		
		return this.iNo - ((Employee)RHS).iNo;//Lower to higher
		//return ((Employee)RHS).iNo-this.iNo;//Higher to lower
	}
}
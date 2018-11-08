package oops;

public class Student {
	int no; //4 bytes
	String Name; //2*6= 12 bytes
	int age;//4 bytes
	static int count;
	
	public Student()
	{
		no=-1;
		Name="nobody";
		age=-1;
		count++;
	}
	public void display()
	{
		System.out.println(no);
		System.out.println(Name);
		System.out.println(age);
		System.out.println("Student count: "+count);
	}
	public void save(int iNo, String sName)
	{
		no=iNo;
		Name = sName;
	}
	
	public void save(int no, String sName, int iAge)
	{
		//To resolve conflict b/w static & local variable
		/*int=count;
		 * count=50;
		 * Student.count=count;
		 */
		this.no=no;
		Name=sName;
		age=iAge;
	}

}

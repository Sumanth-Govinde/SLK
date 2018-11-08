package oops;

public class Client {
	public static void main(String[] args) {
	Student sObj1; //4 bytes
	/*
	 * 
	 * 100 lines of code
	 * 
	 */
	sObj1 = new Student(); // size: (4+12+4 = 20 bytes)
	
	sObj1.display();
	
	sObj1.no = 22;
	sObj1.Name = "Nithin";
	sObj1.age = 25;
	sObj1.display();
	
	Student sObj2 = new Student();
	sObj2.no = 23;
	sObj2.Name= "Tanvir";
	sObj2.age = 26;
	sObj2.display();
	
	sObj1.display();
	
	Student []sObj;
	sObj = new Student[100];
	sObj[0] = new Student();
	
	sObj1 = new Student();
	sObj1.display();
	
	(new Student()).display();
	
	//static ,function overloaded, compile polymorph...
	
	Student sObj3 = new Student();
	//sObj3.save(1,"Ravi");
	//sObj3.display();
	sObj3.save(2, "Anil",24);
	sObj3.display();
	//sObj3.save(30,"ssss","sss");
	
	//accessing static via object
	System.out.println("Count of students by objects: "+sObj3.count);
	
	//accessing static via Class name
	System.out.println("Count of students by Class: "+Student.count);
	}
}

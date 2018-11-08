package oops;

public class InnerClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Style 1
		Student4 sObj;
		sObj = new Student4();
		sObj.display();
		
		//Accessing inner class via parent class
		for(int iSemCount=0; iSemCount<sObj.semMarks.length;iSemCount++)
		{
			sObj.semMarks[iSemCount].display();
		}
		
		*/
		//Style 2
		Student4 sObj;
		sObj = new Student4();
		sObj.display();
		System.out.println("using semester class");
		Student4.Semester mObj;
		mObj=sObj.new Semester();
		//mObj=new Student4.Marks();//will not work
		
		mObj.isub1=77;
		mObj.isub2=87;
		mObj.display();
		
		
	}
		

}

	class Student4
	{
		private int iRegNo;
		private String sName;
		private int iAge;
		Semester semMarks[];
		
		public Student4()
		{
			iRegNo=111;
			sName="NoName";
			iAge=111;
			
			semMarks = new Semester[1];
			semMarks[0]=new Semester();
			semMarks[0].isub1=78;
			semMarks[1].isub2=80;
			System.out.println("Length of semMarks: "+semMarks.length);
		}
		
		public void display()
		{
			//Possible because of inner class ; if there is name conflict
			System.out.println("RegNo: "+iRegNo);
			System.out.println("Student: "+sName);
			System.out.println("Age: "+iAge);
			System.out.println("Marks: ");
			for(int iSemCount=0; iSemCount<semMarks.length;iSemCount++)
			{
				semMarks[iSemCount].display();
			}
		}
		public class Semester
		{
			int isub1;
			int isub2;
			private int iRegNo;
			
			public void display()
			{
				//Possible because of inner class ; if there is name conflict
				System.out.println("Student.this.RegNo: "+Student4.this.iRegNo);
				System.out.println("RegNo: "+iRegNo);
				System.out.println("Sub1: "+isub1);
				System.out.println("Sub2: "+isub2);				
			}
		}
}
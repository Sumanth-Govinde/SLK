package MyTest1;

public class MyConstruct4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iMarks;
		char cGrade;
		iMarks = 80;
		
		if(iMarks>80) {
			cGrade='A';
			System.out.println("Grade is: "+cGrade);
		}
		else
		{
			cGrade='B';
			System.out.println("Grade is: "+cGrade);
		}
		
		//If else if...
		if(iMarks>80) {
			cGrade='A';
			System.out.println("Grade is: "+cGrade);
		}
		else if(iMarks>70)
		{
			cGrade='B';
			System.out.println("Grade is: "+cGrade);	
		}
		else
		{
			cGrade='C';
			System.out.println("Grade is: "+cGrade);
		}
		
		//Char comparision
		if(cGrade=='C')
		{
			System.out.println("Has scored C grade");
		}
		
		//used when literal is fixed
		iMarks=100;
		switch(iMarks)
		{
		case 100:
			cGrade='1';
			System.out.println("rank is :"+cGrade);
			break;
		case 99:
			cGrade='2';
			System.out.println("rank is :"+cGrade);
			break;
		default:
			System.out.println("Default Grade is :"+cGrade);
		}
		System.out.println("Hello world");

	}

}

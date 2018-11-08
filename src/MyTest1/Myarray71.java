package MyTest1;

public class Myarray71 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sList[][];
		sList=new String[3][2];
		
		sList[0][0]="S001";
		sList[0][1]="Nithin";
		
		sList[1][0]="S002";
		sList[1][1]="Tanvir";
		
		sList[2][0]="S003";
		sList[2][1]="Vishwanth";
		
		//Error
		/*
		 sList[3][0]="S044";
		 sList[3][1]="Vishwanth";
		 */
		System.out.println("No of rows in sList.length: "+sList.length);
		System.out.println("No of columns in sList.length: "+sList[0].length);
		//%n for platform specific new line character
		System.out.format("sList[0][1]: %s , sList[0][1].length: %s %n",sList[0][1], sList[0][1].length());
		
		//iterating rows
		for(int row=0;row<sList.length;row++)
		{
			for(int col=0;col<sList[0].length;col++)
				System.out.print(sList[row][col]+" ");
			System.out.println("");
		}
	}

}

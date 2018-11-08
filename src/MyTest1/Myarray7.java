package MyTest1;

public class Myarray7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][];
		a=new int[3][3];
		
		for(int row=0;row<3;row++)
			for(int col=0;col<3;col++)
				a[row][col]=row+col;
		
		for(int row=0;row<3;row++)
		{
			for(int col=0;col<3;col++)
				System.out.print(a[row][col]+" ");
			System.out.println("");
		}
	}

}

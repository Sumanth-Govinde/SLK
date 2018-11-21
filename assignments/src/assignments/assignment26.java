package assignments;

public class assignment26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f1=0,f2=1,f3=1;
		System.out.print(f1+","+f2);
		for(int i=0;i<20;i++)
		{
			f3=f1+f2;
			f1=f2;
			f2=f3;
			System.out.print(","+f3);
		}
	}

}

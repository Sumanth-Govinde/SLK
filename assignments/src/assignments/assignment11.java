package assignments;
import java.util.Scanner;
public class assignment11 {

	public static void main(String[] args) {
	int sm=0,l=0;
	int ar[]=new int[25];
	Scanner s=new Scanner(System.in);
	System.out.println("enter 25 numbers");
	for(int i=0;i<25;i++)
	{
		ar[i]=s.nextInt();
		if(i==0)
		{
			sm=l=ar[i];
		}
		if(ar[i]<sm)
			sm=ar[i];
		if(ar[i]>l)
			l=ar[i];
	}
	System.out.print("smallest is :"+sm+" largest is :"+l);

}
}
package assignments;
import java.util.Scanner;
public class assignment9 {
	static void disp()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter a string");
		String str=s.nextLine();
		System.out.println("entre number of times to display");
		int n=s.nextInt();
		for(int i=0;i<n;i++)
			System.out.println(str);
	}
	public static void main(String[] args) {
		disp();
	}

}

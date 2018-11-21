package assignments;
import java.util.Scanner;
public class assignment12 {
	static void disp(int n)
	{
		if(n==0)
			return;
		else{
			System.out.println("|                          |");
			disp(n-1);
		}
		
			
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter rows");
		int n=s.nextInt();
		System.out.println("----------------------------");
		disp(n);
		System.out.println("----------------------------");
	}

}

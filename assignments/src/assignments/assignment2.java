package assignments;
import java.util.Scanner;
public class assignment2 {

	public static void main(String[] args) {
		String str;
		Scanner s=new Scanner(System.in);
		str=s.next();
		int n=str.length();
		for(int i=0;i<n;i++)
			if(str.charAt(i) != str.charAt(n-i-1)	)		{
				System.out.println("not a pallindrome");
				return;
			}
		System.out.println("pallindrome");
	}

}

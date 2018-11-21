package assignments;
import java.util.Scanner;
public class assignmet6 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the 1st string");
		String str=s.next();
		int c=0;
		for(int i=0;i<str.length();i++)
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
				c++;
		System.out.println(c);
		
			
		

	}

}

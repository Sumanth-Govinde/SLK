package assignments;
import java.util.Scanner;
public class assignmet4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str;
		char c;
		int n=0;
		System.out.println("enter a string:");
		str=s.next();
		System.out.println("enter a character");
		c=s.next().charAt(0);
		for(int i=0;i<str.length();i++)
			if(str.charAt(i)==c)
				n++;
		System.out.println(c+" occures "+n+" times");
	}

}

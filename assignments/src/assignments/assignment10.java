package assignments;
import java.util.Scanner;
public class assignment10 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	char c='a',pc='a';
	do {
		System.out.println("enter a character");
		c=s.next().charAt(0);
		if(c<pc)
			System.out.println("less than the previous character");
		else if(c>pc)
			System.out.println("greater than the previous character");
		else
			System.out.println("equal to previous character");
		pc=c;
	}while(c!='.');
		
	}

}

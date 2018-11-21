package assignments;
import java.util.Scanner;

public class assignment8 {
	static void disp() {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a character");
		char c=s.next().charAt(0);
		for(int i=0;i<40;i++)
			System.out.println(c);
	}

	public static void main(String[] args) {
			disp();
		
	}

}

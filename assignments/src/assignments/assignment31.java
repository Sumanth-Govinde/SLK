package assignments;

import java.util.Scanner;

public class assignment31 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in); 
		while(true){
			String str=s.next();
			if(str.equalsIgnoreCase("no")){
				System.out.println("Bye");
				return;
			}
			System.out.println(str);
				
		}
	}

}

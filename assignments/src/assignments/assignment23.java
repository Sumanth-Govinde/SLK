package assignments;

import java.util.Scanner;

public class assignment23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter an abbrivation");
		String str=s.next();
		switch(str)
		{
			case "Mktg.,":System.out.println("Marketing");
							break;
			case "Hr":System.out.println("Human Resource");
							break;
			case "Accts":System.out.println("Accounts");
						break;
			case "Trg":System.out.println("Training");
						break;
						
			default:System.out.println("invalid input");
		}
	}

}

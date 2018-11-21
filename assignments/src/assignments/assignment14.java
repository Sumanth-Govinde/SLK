package assignments;
import java.util.Scanner;

public class assignment14 {
	static String rev(String str){
		String str2="";
		for(int i=str.length()-1;i>=0;i--)
			str2=str2+str.charAt(i);
		return str2;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a string");
		String str=s.nextLine();
		String str2=rev(str);
		System.out.println("reverse :"+str2);
	}

}

import java.util.Scanner;

public class asn8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a;
		Scanner s=new Scanner(System.in);
		a=s.next().charAt(0);
		forty(a);
		
	}
	static void forty(char b){
		for(int i=0;i<40;i++)
		{
			System.out.println(b);
		}
		
	}

}

package assignments;
import java.util.Scanner;
public class assignment15 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the main string");
		String mstr=s.nextLine();
		System.out.println("enter the find string");
		String fstr=s.nextLine();
		System.out.println("enter the replace string");
		String rstr=s.nextLine();
		
		int sp=-1;
		for(int i=0;i<mstr.length()-fstr.length()+1;i++){
			for(int j=0;j<fstr.length();j++){
				if(mstr.charAt(i+j)==fstr.charAt(j)){
					sp=i;
				}
			}
			if(sp!=-1)
				break;
				
		} 
		if(sp!=-1){
			char[] temp=mstr.toCharArray();
			for(int i=sp,j=0;j<rstr.length();i++,j++)
				temp[i]=rstr.charAt(j);
			mstr=String.valueOf(temp);
			System.out.println(mstr);
		}
		else
			System.out.println("string not found");
		
		
	}

}

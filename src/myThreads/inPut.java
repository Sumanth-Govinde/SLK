package myThreads;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class inPut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static String readln(){
		String rep ="";
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try{
			rep = br.readLine();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		return rep;

}
}

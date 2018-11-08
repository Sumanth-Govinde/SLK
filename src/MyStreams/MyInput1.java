package MyStreams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//stream holds all the data before printing.

public class MyInput1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String accept;
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		
		System.out.println("Enter a line");
		accept=br.readLine();
		System.out.println(accept);
		writeLn("My write function");

	}
	
	public static void writeLn(String sValue) throws IOException{
		OutputStreamWriter osr = new OutputStreamWriter(System.out);
		osr.write("Lines before printing user value");
		osr.write("\n"+ sValue +"\n");
		osr.write("Lines after printing user value");
//		osr.flush();//with out flush it will not print
	}

}

package MyStreams;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyFileIO3 {

	static FileInputStream fis;
	static FileOutputStream fos;
	
	static BufferedReader br;
	static InputStreamReader isr;
	
	static  int iNoOfBytes;
	static  int iBytesRead;
	
	static String sUserInput;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//for writing to a file called sample.txt
		fos=new FileOutputStream("sample.txt"); //fos contains file name to store#
		
		isr=new InputStreamReader(System.in);
		br= new BufferedReader(isr);
		
		System.out.println("Enter the details to be saved ina text file");
		sUserInput=br.readLine();
		
		//this writes the data byte by byte to the file called sample.txt
		for(int i =0;i<sUserInput.length();i++)
			fos.write(sUserInput.charAt(i));
		System.out.println("Data is being saved in file...........\n\n");
		fos.close();
		
		//for read from a file which already exists
		fis=new FileInputStream("sample.txt");
		iNoOfBytes=fis.available();
		
		System.out.println("No of bytes present in the file: "+iNoOfBytes);
		
		byte inbuff[]=new byte[iNoOfBytes];
		iBytesRead = fis.read(inbuff, 0, iNoOfBytes);
		
		System.out.println("No of bytes read: "+iBytesRead);
		System.out.println("File Contents\n"+new String(inbuff));
		fis.close();

	}

}

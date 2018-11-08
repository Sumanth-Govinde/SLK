package MyStreams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * Demo for writing and reading into a file using 
 * BufferedWriter and BufferReader
 */
public class MyFileIOBwBr31 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println((new java.util.Date()).toString());
		
		FileOutputStream fio = new FileOutputStream("Sample.txt");
		OutputStreamWriter osw=new OutputStreamWriter(fio);
		BufferedWriter bw= new BufferedWriter(osw);
		bw.write("Hello Mr.Bond\nHello Mr.James");
		bw.close();
		
		FileInputStream fis= new FileInputStream("sample.txt");
		InputStreamReader isr=new InputStreamReader(fis);
		BufferedReader br= new BufferedReader(isr);
		
		String sValue="";
		while((sValue=br.readLine())!=null)
		{
			System.out.println(sValue);
		}
		
		br.close();

	}

}

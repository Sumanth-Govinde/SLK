package MyStreams.MySerialized;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MyObjectRead6 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Employee empObj=null;
		try{
			//pass the file name created by MyObjectWrite5.java
			FileInputStream fis=new FileInputStream("DB-1karthik.dat");
			ObjectInputStream ois=new ObjectInputStream(fis);
			Object obj;
			
			while((obj=ois.readObject())!=null){
				empObj=(Employee)obj;
				empObj.display();
			}
			fis.close();
		}catch(EOFException eofe){
			System.out.println("End of File reached");
		}
	 catch(IOException e){
		 	System.out.println("Count not read Object "+e.getMessage());
	 }

	}

}

package MyTest1;

public class MyTypeConv3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte bVar;
		short sVar;
		int iVar;
		long lVar;
		float fVar;
		double dVar;
		char cVar;
		boolean blVar;
		
		bVar = 7;   //127
		sVar = 11;   //32767   max of 5 digit
		iVar = 24;   //2147483647  max of this number 10 digits
		lVar = 2425;  //922337203685478000L  around 18 digits
		fVar = 24.45F;  //around 40 digits
		dVar = 245.56F; // 10 to the power of 317
		cVar = 'Z';
		blVar = true;
		
		System.out.println("Conversions byte to String and reverse");
		System.out.println("Value of bVar:" +bVar);
		String sVal="0";
		sVal = Byte.toString(bVar);
		System.out.println("Value of sVal:" + sVal);
		sVal= "4567";
		System.out.println("Reinitialzed value of sVal:"+ sVal);
		iVar=Integer.parseInt(sVal);
		System.out.println("Reinitialized value of iVar:"+iVar);
		//fVar=25.45F;
		System.out.println("Coversions to float to string and reverse");
		System.out.println("Value of fVar:"+fVar);
		sVal="0";
		sVal=Float.toString(fVar);
		System.out.println("Value of sVal :"+sVal);
		sVal="4567.66";
		System.out.println("Reinitialized value of sVal:"+sVal);
		fVar=Float.parseFloat(sVal);
		System.out.println("Reinitialized value of fVar:"+fVar);
		
		//blVar=true;
		System.out.println("Coversions to Boolean to string and reverse");
		System.out.println("Value of blVar:"+blVar);
		sVal="0";
		sVal=Boolean.toString(blVar);
		System.out.println("Value of sVal :"+sVal);
		sVal="false";
		System.out.println("Reinitialized value of sVal:"+sVal);
		blVar=Boolean.parseBoolean(sVal);
		System.out.println("Reinitialized value of blVar:"+blVar);
		
		System.out.println("Working");
	}

}

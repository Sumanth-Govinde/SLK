package MyTest1;

public class MyVaraiables1 {
//Declaring variables with java giving default values
	static byte bVar;
	static short sVar;
	static int iVar;
	static long lVar;
	static float fVar;
	static double dVar;
	static char cVar;
	static boolean blVar;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Decalring variables with java not initializing default values
		/*byte bVar;
		short sVar;
		int iVar;
		long lVar;
		float fVar;
		double dVar;
		char cVar;
		boolean blVar;
		*/
		//Initializing variables; values on RHS are also referred as literals
		bVar = 7;   //127
		sVar = 11;   //32767   max of 5 digit
		iVar = 24;   //2147483647  max of this number 10 digits
		lVar = 2425;  //922337203685478000L  around 18 digits
		fVar = 24.45F;  //around 40 digits
		dVar = 245.56F; // 10 to the power of 317
		cVar = 'Z';
		blVar = true;
		//MyVaraiables1 v1= new MyVaraiables1(); 
		//MyVaraiables1 v= new MyVaraiables1();
		//System.out.println("Value of bVar= "+ v.bVar);
		//System.out.println("Value of bVar= "+ v1.bVar);
		//v1.bVar=8;
		//System.out.println("Value of bVar= "+ v.bVar);
		//System.out.println("Value of bVar= "+ v1.bVar);
		System.out.println("Value of sVar= "+sVar);
		System.out.println("Value of iVar= "+iVar);
		System.out.println("Value of lVar= "+lVar);
		System.out.println("Value of fVar= "+fVar);
		System.out.println("Value of dVar= "+dVar);
		System.out.println("Value of cVar= "+cVar);
		System.out.println("Value of blVar "+blVar);
	}

}

package MyTest1;

import java.util.Calendar;

public class MyConstruct5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int iNum1=1,iNum2=1;
		while(iNum2<150)	{
			System.out.println(iNum2);
			iNum2 += iNum1;
			iNum1 = iNum2- iNum1;
			if(iNum2==89)
				break;
		}
		
		
		int iCount=1;
		do	{
			System.out.println("===========================");
			iCount++;
		}while(iCount<1);
		
		for(iNum1 = iNum2 =1;iNum2<150;iNum2+=iNum1){
			System.out.println(iNum2);
			iNum1 = iNum2-iNum1;
			if(iNum2==89)
				break;
		}
		
		String sValues[]=new String[5];
		for(int iNo=0;iNo<sValues.length;iNo++)
		{
			sValues[iNo]= String.valueOf(System.currentTimeMillis());
			Thread.sleep(2);
		}
		
		System.out.println("demo on foreach");
		/*
		 * Fast when compared to for loop
		 * Good to be used when no changes are done to the container/array
		 */
		String sValues2[]=new String[5];
		sValues2[0]="Nithin";
		sValues2[1]= Calendar.getInstance().getTime().toString();
		sValues2[2]= "tanvir";
		sValues2[3]= "Ron";
		sValues2[4]= "Vishwa";
		
		for(Object curObj : sValues2) {
			System.out.println(curObj);
		}

	}

}

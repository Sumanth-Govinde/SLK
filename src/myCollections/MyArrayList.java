package myCollections;

import java.util.*;
/*
 * Increase or decrease the size automatically
 * Array list is not synchronized can be used with more than one thread with required synch locks
 * 
 *  command line arguments:
 *  			Bangalore Delhi Chennai
 *  			Pune Bangalore Delhi Chennai
 *  			Bangalore Mumbai Mumbai
 *  			Bangalore Mumbai null
 */

public class MyArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrLstObj=new ArrayList<String>();
		
		for(String sCurVal:args){
			arrLstObj.add(sCurVal);
		}
		
		p1("Array Size: "+String.valueOf(arrLstObj.size()));
		for(int iLen=0; iLen<arrLstObj.size();iLen++){
			p1("arrLstObj of "+String.valueOf(iLen)+" : "+arrLstObj.get(iLen));
		}
		p1("Array Size After Remove: "+String.valueOf(arrLstObj.size()));
	}
	
	private static void p1(String str){
		System.out.println(str);
	}

}

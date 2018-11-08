package myCollections;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//Demo for collections Algorithm
public class MyColAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer iNumbers[]={5,4,10,12,3,2,1};
		
		System.out.println("Default iNumbers: ");
		for(int iCurNum : iNumbers){
			System.out.println(iCurNum+" ");
		}
		
		//converts a simple array to list (interface)
		List<Integer> lObj=Arrays.asList(iNumbers);
		Collections.sort(lObj);
		
		System.out.println("\nSorted iNumbers: ");
		for(int iCurNum:iNumbers){
			System.out.println(iCurNum+ " ");
		}
		
		int iLocation=Collections.binarySearch(lObj, 10);
		System.out.println("\nLocation of 10: "+iLocation);
		
		System.out.println("Minimum value in iNumbers: "+Collections.min(lObj));
		System.out.println("Maximum value in iNumbers: "+Collections.max(lObj));

	}

}

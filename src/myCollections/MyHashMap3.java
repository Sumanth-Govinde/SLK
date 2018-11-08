package myCollections;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

import javax.xml.crypto.dsig.keyinfo.KeyValue;

/*Demo for hastable and hasmap
 * HastTable
 * 	used for holding data as name value pair in memory
 * Can have duplicate key and values (it will overwrite)
 * Can not have null values
 * 
 * Hash MAp
 * 	Similar to hastable
 * can have duplicate key and values (it will overwrite)
 * can have null
 * it is a synchronous
 */
public class MyHashMap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MyHashTable();
		p1("");
		MyHashMap();
	}
	
	private static void p1(String s){
		System.out.println(s);
	}
	private static void MyHashTable()
	{
		Hashtable<Integer, String> hT=new Hashtable<Integer,String>();
		//hT.put(null,null);//Cannot have null
		hT.put(2, "Wine");
		hT.put(1, "Mango");
		hT.put(4, "Plane");
		hT.put(3, "Pen");
		hT.put(5, "Table");
		hT.put(5, "Chair");//will over write the previous one
		//hT.put(6,23423);
		
	Enumeration<Integer> em=hT.keys();
	
	p1("Program for HAsh Table");
	p1("Key : Value");
	while(em.hasMoreElements()){
		//next Element is used to get key of hash table
		int key = (Integer)em.nextElement();
	
	//get is used to get value of key in hash table
	String value=(String)hT.get(key);
	p1(key+"   :  "+value);
	}
  }



private static void MyHashMap()
{
	Map<Integer,String>keyValue=new HashMap<Integer,String>();
	
	p1("Program for Hash Maps");			
	keyValue.put(null, null);
	keyValue.put(3, "Delhi");
	keyValue.put(1, "Bombay");
	keyValue.put(2, "Chennai");
	
	keyValue.put(3, "New Delhi"); //this will over write the previous value
	
	//size includes null
	p1("Size of HashMap: "+String.valueOf(keyValue.size()));
	p1(keyValue.get(2)); //to search for a key
	
	//keyValue.remove(3);//to remove a keyValue pair
	//keyValue.clear(); //To clear all the items
	
	Iterator<Map.Entry<Integer,String>>iNav;
	iNav=keyValue.entrySet().iterator();
	p1("Key : Value");
	
	while(iNav.hasNext()) {
		Map.Entry<Integer, String>curObj=iNav.next();
		p1(curObj.getKey()+" : "+curObj.getValue());
	}
	
}
}
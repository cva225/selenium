package com.cva.selenium;

import java.util.HashMap;
import java.util.Map;

import org.apache.xalan.xsltc.runtime.Hashtable;

public class MapDemo {

	public static void main(String[] args) {
	//Map(I) specific methods are(it is not child interface of collection(I))
	
/*		Map m=new HashMap();
		m.put('S',225 );          //duplicate keys are not allowed and if we use new one replace the new one
		m.put('S',226);
		m.put('M',225);
		m.put("siva", "Sivakumar");
		m.put(1.25, "Cva");       //duplicate values are always possible
		m.put(12, "Cva");         //Allow homo hetero
		m.put(true, 900);          // insetion is not preserved 
        m.put(null, 1234);
        m.put(null, 1);
      //  m.put(null, null);
        System.out.println(m);
     Map m1=new HashMap(m);
        m1.put("Ram", 9177);
        m1.put(999, "lakshmi");
        System.out.println(m1);
        
     System.out.println(m1.get(12));
     System.out.println(m1.remove("siva"));
     System.out.println(m1.containsKey('S'));
     System.out.println(m1.containsValue(9)); // here it is false
     System.out.println(m1.size());
     System.out.println(m.isEmpty());
     System.out.println(m.entrySet());
     m1.clear();
     System.out.println(m1);
        
        */
        
   ///// ** HashMap(C)**   (it is first impli class of Map(I) )   
        // all methods in Map(I) are available to the HashMap (No specific methods for HashMap)
		//conditions are same as Map(I)
       //The under lying data structure is 'HashTable'
		//Example is Same as above Example ie.,Map(I) example
	
 ////** Linked HashMap(C)** 
	  // Except two conditions All are same as Hashmap
	       //1.insertion order is preserved (ie,.)
	       // 2.underlying data Structure is combination of HashTable & LinkedList
	
	
	/////**HashTable**
	
	Hashtable ht=new Hashtable();
	ht.put("s", 123);
	ht.put("A", 12.2);
	ht.put("m", 225);
	ht.put(123, "Cva");
	//ht.put("RAmaiah", null);      // here null is not allowed
	//ht.put(null, 123);            // every method is synchronized and it is thread safe
	
	
	System.out.println(ht);
	
	}

}

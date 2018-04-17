package com.cva.selenium;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import org.apache.xerces.util.SynchronizedSymbolTable;

public class HasSetLinkedHasSet {

	public static void main(String[] args) {
		
  //Set(I) has no specific methods and it takes all the methods from collection(I) 
	//HasSet(c),linked (c) are the impli classes of the set(I)
	//also set(I) extended interfaces are Sortedset(I)>>Navigable(I)>>>>TreeSet(c) 	
		                         //Set(I):allow homo hetero,dont allow duplicate 
		                          // it replacer duplicate with new one 
		
		
		//HasSet:allow homo hetero,dont allow duplicate ,insersion order is not preserved
		//impli clonable serializable , allow null
		//best for SEARCH OPERATION
		
		Set st= new HashSet();
		st.add("Siva");
		st.add(2225);
		st.add(2225);
		st.add("Siva");
		st.add('c');
	System.out.println(st);
		Set st2= new HashSet(st);
		st2.add("HariKUmar");
		st2.add("Siva Sai");
		st2.add(2225);
		System.out.println(st2);  //insetion order is not preserved 
		                          //for insertion order go for LinkedHashSet
		
	
		Set hs = new LinkedHashSet();
		hs.add("poorna");
		hs.add(550);
		hs.add(550);
		hs.add(550);
		hs.add("teja");
		hs.add(19.5f);
		System.out.println(hs);   //hera insetion order preserved
	}

}

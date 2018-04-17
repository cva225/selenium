package com.cva.selenium;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

import com.google.common.graph.SuccessorsFunction;

public class ListDemo {      //list is a child  interface of "collection(I)".
                             //and Arraylist is the child class 
	public static void main(String[] args) {
		java.util.List l=new ArrayList();
		l.add(225);
		l.add("sivakumar");   //homogenious and heterogenious elements or objects
	    l.add(225);           //are allowed
		l.add(19.5);          //duplicates are allowed 
	    l.add(true);          //insertion order is preserved 
	    l.add(null);          //index mechanism is there(duplicates are differwith the index)
	    
	    System.out.println(l.add(19.5));//it returns true
      System.out.println(l);
      System.out.println( l.addAll(l));  
	    System.out.println(l.contains(225));
	    System.out.println(l.containsAll(l));
	    // System.out.println(l.containsAll(m));//CE
	    System.out.println(l.isEmpty());
	    System.out.println(l.remove("sivakumar"));
	       System.out.println(l);                  // iterator() is also collection(I) method
	 System.out.println(l.size());
	// l.clear();
	// System.out.println(l);
	 System.out.println(l.remove(1));   //returns removed element
	 System.out.println(l.hashCode());
	 System.out.println(l.removeAll(l));
	     System.out.println(l);
	    
	                                    //list specific methods are::::
	                                   //remove();  return object 
	                                   //listiterator(); return list iterator
	                                   //get();    return object
	                                    //lastindexof();   return int
	
	}

}

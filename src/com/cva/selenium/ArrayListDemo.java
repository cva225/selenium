package com.cva.selenium;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;

import org.apache.xerces.util.SynchronizedSymbolTable;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		/*ArrayList al = new ArrayList(); //it is impl class of collection(I) ansd List(I)
		al.add("RAMAIAH");              //allow homo hetero
		al.add(225);                    //allow duplicate
		al.add("LAKSHMI");              // insertion order is preserved 
		al.add(91.77);                  //it impliment RandomAccess(I) and serializable(I),clonable(I)
		al.add(null);                    // null insertion is possible ,
		al.add(true);
		System.out.println(al);
		System.out.println(al.lastIndexOf(225));
 
		ArrayList list1=new ArrayList(al);
 System.out.println(list1);
 list1.add("HARI");
 list1.add(225);
 System.out.println(list1);
 
         ArrayList list2 = new ArrayList(list1);
         list2.add("cvakumar");
         list2.add(1);*/
       
	
	 
		
		
		//LinkedList(c):          //all conditions are same as ArrayList except
		                          //RandomAccess(I) is not impli in Linkedlist
		                      
		                      //LinkedList specific methods are::;
		                         //addFirst(objo); ,addLast(obj o)--- both return void
	                             //getirst();   ,  getLast()    -----both return object
	                             //removieFirst(); , removeLast();---both return object
	                             
	LinkedList list3=new LinkedList();
	list3.add(9177);
	list3.add("LakshmiRam");
	list3.add(50);
	System.out.println(list3);
	   
    list3.addFirst("Cva");
	list3.addLast("Hari");
	System.out.println(list3);
	
	System.out.println(list3.getFirst());
	System.out.println(list3.getLast());
	System.out.println(list3.removeLast());  ///Here we will get removed element as object 
	System.out.println(list3.removeFirst());
	
	
	
	
	
	
	}

}

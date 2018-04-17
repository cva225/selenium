package com.cva.selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import com.gargoylesoftware.htmlunit.javascript.host.Iterator;

import net.sourceforge.htmlunit.corejs.javascript.ast.WhileLoop;

public class CursorsDemo {
////*Iterator()*- (get obj one by one )
    public static void main(String[] args) {
		
    /* ArrayList al= new ArrayList();
     al.add("Ramaiah");
     //al.add(1);----------CE  
     al.add("R");
     al.add("h");
    // al.add(123);
     al.add("l");
	System.out.println(al);                   
	java.util.Iterator itr1=al.iterator();
	System.out.println(itr1);               // we can retrive only homogeneous elements
	 while (itr1.hasNext()) {
		String str=(String) itr1.next();
		if (str.equalsIgnoreCase("l")) {
			System.out.println("Ram String ");
			
		}
		if (str.equalsIgnoreCase("h")) {
			System.out.println("h Sting ");
		}
	}
	*/
	
	List li=new ArrayList();
	li.add(25);
	li.add(27);
	li.add(19);
	//li.add("Cva");
	    System.out.println(li);
	ListIterator itr1= li.listIterator();  
	         /* System.out.println(itr1.hasNext());     //true 
	          System.out.println(itr1.next());         //25
	          System.out.println(itr1.next());         //27 (index is 1)
           	  System.out.println(itr1.nextIndex());    //next index is 2
	          System.out.println(itr1.next());         //19
	          System.out.println(itr1.next());         //Cva
       ** or**     
            */	
	while (itr1.hasNext() ){
		int i=(int) itr1.next();
		 if (i==27) {
			 System.out.println("retrive 27");
			
		}
		 if (i==19) {
			 System.out.println("retrive 19");
			
		}
	}
     
    
    
    
    }
    }

	
	
	
	
	
	
	
	
	
	
	


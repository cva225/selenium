package com.cva.selenium;

import java.util.ArrayList;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
	/*	ArrayList list=new ArrayList() ;
			list.add("Hello");
		list.add("Good morning");
		list.add("Cva");
		list.add(225);
		list.add(91.77);
	System.out.println(list);
	//TreeSet ts=new TreeSet(list);-------CE
	//System.out.println(ts);
	
	
	*/
	ArrayList list1=new ArrayList() ;
	list1.add("Hello");
    list1.add("Good morning");
    list1.add("Cva");
    list1.add("Ram");
    list1.add("Hari");
	System.out.println(list1);
	   TreeSet ts1= new TreeSet(list1);
	   System.out.println(ts1);
	   ts1.add("All is well");
	   System.out.println(ts1);
	
	}

}

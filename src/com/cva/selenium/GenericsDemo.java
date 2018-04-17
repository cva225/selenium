package com.cva.selenium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class GenericsDemo {

	public static void main(String[] args) {
		List<String> ls= new ArrayList<String>();
		ls.add("Soori");
		ls.add("puru");
		ls.add("babu");
		System.out.println(ls);
      
		List<Integer> t= new ArrayList<Integer>();
	   t.add(225);
	   t.add(9177);
	   //t.add(9.56);-------CE
	   t.add(500);
		System.out.println(t);
		
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		set.add(9);
		set.add(770);
		set.add(770);
		set.add(6);
		set.add(225);
		System.out.println(set);
		HashSet<Integer> mno=new HashSet<Integer>(set);
		System.out.println(mno);
		
		
		
	}

}

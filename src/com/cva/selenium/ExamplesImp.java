package com.cva.selenium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.print.attribute.HashAttributeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import com.gargoylesoftware.htmlunit.WebWindow;
import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class ExamplesImp {

	public static void main(String[] args) {
		
		
/////** Remove duplicate elementsfrom  an 'Arry':
		
	/*	int [] a= {25,20,25,20,36,39,45,52,50,300,50,25,2,10,10};
		System.out.println(a.length);
		
   List list= new ArrayList();
   
		Set set=new HashSet();
		//System.out.println(st.size());
		      for (int i = 0; i < a.length; i++) {
			      boolean bo= set.add(a[i]);
			         if (bo) {
			        	 System.out.println("not duplicate");
			        }
			         else {
						System.out.println("not duplicate:"+a[i]);
						list.add(a[i]);	 
			         }
		
	       
	//System.out.println(list);        
	}
		
		      System.out.println(list);
		      System.out.println(set);
		      List l= new ArrayList(set);
		            System.out.println("first no.r:"+l.get(0));
		              System.out.println("last no.r:"+l.get(l.size()-1));    */
	
	
	
////****Remove duplicate Elements From Dropdown::	
	
		System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver.exe" );
		RemoteWebDriver driver= new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement dayDD=driver.findElement(By.cssSelector("*#day"));
		
		     if (dayDD.getTagName().equalsIgnoreCase("select")){
		    	Select st= new Select(dayDD);
		    	 List lt = st.getAllSelectedOptions();
		    	 Set set= new LinkedHashSet(lt);
				 System.out.println("aaa"+set);
				st.selectByIndex(10);;
				}
		     else {
		    	 List list= driver.findElements(By.cssSelector("*#id"));
		    	 Set ss=new LinkedHashSet(list);
				System.out.println(ss);
			}
			
			
			
			
			
		
		
		
		
	
	
	}

}

package com.cva.selenium;

import java.util.List;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.steadystate.css.dom.Property;

import net.bytebuddy.implementation.FieldAccessor.PropertyConfigurable;

public class Cva {

	public static void main(String[] args) {
////***Find how many texts having ADP ina adp web page  and get all the texts to console:::
	/*System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver.exe ");
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.adp.com/");
	List<WebElement> list= driver.findElements(By.xpath("//*[contains(text(),'ADP')]"));
	System.out.println(list.size()); //58
 
	int count=0;
	 for (WebElement element : list) {
		 System.out.println(element.getText());
		if (element.getTagName().equalsIgnoreCase("a")) {
			System.out.println("sssss: "+element);			
			
			count++;
		}
		//count++;
		 //System.out.println("no of a:"+count);
	 }
	 //count++;
	 System.out.println("no of a:"+count);*/
	
	
	
	
	/*	System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver.exe ");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.adp.com/");
	List<WebElement> textlist=driver.findElements(By.xpath("//*[contains(text(),'ADP')]"));
	                System.out.println(textlist.size());
	int count=0;
	                
	                for (WebElement element : textlist) {
		//System.out.println(element.getText());
		if (element.getTagName().equalsIgnoreCase("a")) {
			System.out.println(element);
			count++;
		}
	}
	
	System.out.println(count);
	*/
///////////////////////////////////////////////////////////////////////////////////////	
	
	///**Example for open Facebook browser drpo dpwn elements::::::::::::
	
		System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver.exe ");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	
	WebElement ele= driver.findElement(By.cssSelector("*#day"));
	Select slt= new Select(ele);
	List<WebElement> listeles=slt.getOptions();
	
	for (WebElement ele1 : listeles) {
		if (ele1.getText().equalsIgnoreCase("25")) {
			ele1.click();
			
		}
	 if (ele1.getText().equalsIgnoreCase("1")) {
		ele1.click();
	}
	}
	System.out.println(ele.getText());
	
	
///////////////////////////////////////////////////////////////////////////////////////	
	
	
	
	
	
	
	
	
	
	
	
	
	}

	 
}

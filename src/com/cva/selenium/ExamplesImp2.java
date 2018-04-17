package com.cva.selenium;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ExamplesImp2 {

	/*Find hoe maney links (link texts)are Enabled,diplayed and Disabledin the web page 
	Selenium by Ramesh*/
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe ");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/?gws_rd=ssl");
		WebElement ele=driver.findElement(By.cssSelector("*#lst-ib"));
		ele.sendKeys("selenium by ramesh");
		
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ENTER).build().perform();
		
//WebElement ele3= driver.findElement(By.linkText("Selenium WebDriver By Ramesh Anapati"));
        


     List<WebElement> links=driver.findElements(By.tagName("a"));
     List<WebElement> linktext=new ArrayList<WebElement>();     
     System.out.println(links.size());

	       int enabledcount = 0;
	       int disabledcount =0;
	
	for (WebElement linkslist : links) {
		//System.out.println(linkslist.getText());/// here we will get all the texts 
		   linktext.add(linkslist) ;                                      // texts which is having anchor tag 'a'
if (linkslist.isDisplayed()&&linkslist.isEnabled()) {
	System.out.println("link texts are enabled"+linkslist.getText());
	 enabledcount++;
	
	}
else {
	System.out.println("disabled");
	disabledcount++;
}
	
	
	}
	
	
	
	System.out.println(enabledcount );
	System.out.println(disabledcount);
	System.out.println(linktext);

	}
	
}
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
	    
	
	
	
	
	
	

	

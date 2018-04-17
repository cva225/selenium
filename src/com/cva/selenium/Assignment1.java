package com.cva.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.server.handler.ExecuteScript;

import com.gargoylesoftware.htmlunit.html.Keyboard;
import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;
import com.gargoylesoftware.htmlunit.javascript.host.media.webkitMediaStream;

import net.bytebuddy.asm.Advice.Enter;

public class Assignment1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		RemoteWebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
		WebElement ele1=driver.findElement(By.cssSelector("*#lst-ib"));
		ele1.sendKeys("youtube.com");
		    Actions actions= new Actions(driver);
		    actions.sendKeys(Keys.ENTER).perform();
		    
 WebElement ele2=driver.findElement(By.linkText("YouTube"));
 ele2.click();
 WebElement ele3=driver.findElement(By.cssSelector("*#search"));
 ele3.sendKeys("Rameshsoft module2");
      actions.sendKeys(Keys.ENTER).build().perform();
      
   WebElement ele4=driver.findElement(By.cssSelector("*#video-title"));
   ele4.click();
//forward:::   
 
      WebElement ele5= driver.findElement(By.xpath("//*[@class='ytp-next-button ytp-button']"));
     driver.executeScript("arguments[0].click()", ele5);
      
// volume dec inc::    
     //actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
   
     actions.sendKeys(Keys.ARROW_LEFT).build().perform();
		    
	WebElement ele7=driver.findElement(By.linkText("Subscribe "));
	ele7.click();
		    

		
		
		
		
		
		
	}

}

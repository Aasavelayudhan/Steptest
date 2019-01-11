package com.promap;

import java.awt.image.BufferedImage;	
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Promap 

{

	protected static WebDriver driver;
  
 

 @BeforeClass(groups="STEPDemo")
 public void setUp() throws InterruptedException
	 {
		System.setProperty( "webdriver.chrome.driver","src\\chromedriver.exe" );
		
		ChromeOptions options = new ChromeOptions();		
		options.addArguments( "--disable-extensions" );
		options.addArguments( "--test-type" );
		options.addArguments( "--allow-running-insecure-content" );	
		options.addArguments("--disable-web-security");
		String userProfile = "C://Users//u55059//AppData//Local//Google//Chrome//User Data//Default//";
		options.addArguments("user-data-dir="+userProfile);
		options.addArguments("--start-maximized");
		Reporter.log("Browser Opened");
		
		driver = new ChromeDriver(options);
		//driver.get(https://idp.ust-global.com//adfs//ls//idpinitiatedsignon.aspx?//");
		driver.get( "https://bvt2-www2.promap.co.uk/#/" );	
		//driver.get( "http://www.google.com" );	
		Reporter.log("site Opened");
		Thread.sleep(2000);
		//ImageDictionarypath = "src//ImageDictionary//promap";
	    //Thread.sleep(500);
	   // Constant.ImageDictionary=ImageDictionarypath;
	  //  System.out.println( Constant.ImageDictionary);
		Thread.sleep(8000);
		
	} 

 @Test( groups="STEPDemo",priority = 1,retryAnalyzer = FindFailed.class,description="Test cases for testing login") 

 public void loginTest() throws InterruptedException, FindFailed
  {
	 
    try
	  {
	

      driver.findElement(By.name("userName")).sendKeys("NOPPER01");


      driver.findElement(By.name("password")).sendKeys("int");


      WebElement login = driver.findElement(By.cssSelector("button.btn.btn-sm-login.btn-warning.col-md-3"));

      login.click();


      Thread.sleep(5000);
  }
      catch(Exception e)
	   {
	     Assert.assertTrue ( false, " FRMPXMB-29: Updating the saved plan failed" ); 
	   
	   }
  }
 @Test( groups="STEPDemo",priority = 2,retryAnalyzer = FindFailed.class,description="Test cases for testing print") 
 public static void selectPrintTask()  throws FindFailed, InterruptedException
       {	 
   	try
   	{ 
     // WebElement drawsite1 = driver.findElement(By.xpath("/html/body/div[2]/div[6]/div[1]/div[8]"));
     // drawsite1.click();

     // Thread.sleep(5000);
      //*[@id="print"]/span  


      WebElement print1 = driver.findElement(By.xpath("//*[@id='print']/span"));


      JavascriptExecutor js = (JavascriptExecutor)driver;
      js.executeScript("arguments[0].click();", print1);

      Thread.sleep(10000);

      WebElement Printlayer = driver.findElement(By.xpath("//*[@id='select-print-layer-options']"));

      Printlayer.click();

      Thread.sleep(5000);
   	}
      catch(Exception e)
	   {
	     Assert.assertTrue ( false, " selectPrintTask failed" ); 
	  
	   }
       }
          
 @Test( groups="STEPDemo",priority = 3,retryAnalyzer = FindFailed.class,description="Test cases for testing print") 
 public static void selectGoView()  throws FindFailed, InterruptedException
   {	 
   	try
   	{ 
      Select Printlayers = new Select(driver.findElement(By.xpath("//*[@id='select-print-layer-options']")));
      Printlayers.selectByVisibleText("GoView Location Bundle");
      Thread.sleep(5000);
      
      
      
      Boolean isPresent = driver.findElements(By.xpath("/html/body/div[1]/div/div/div/div[3]/div[1]/button[2]")).size() > 0;
     
    if (isPresent)	
    {  WebElement addresspopup = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[3]/div[1]/button[2]"));
       addresspopup.click(); 
       Thread.sleep(5000);
	
    } else
    {
      WebDriverWait block = new WebDriverWait(driver,20);
      block.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]")));
      driver.switchTo().activeElement();
    
      WebElement projref = driver.findElement(By.xpath("//*[@id='projectref']"));
      projref.sendKeys("po/1234567/poreference"); 
      Thread.sleep(1000); 
      WebElement pojref  = driver.findElement(By.xpath("//*[@id='poref']"));
      pojref.sendKeys("proreference"); 
      Thread.sleep(1000); 
      WebElement acceptref  = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[3]/div/button[2]"));
      acceptref.click(); 
      Thread.sleep(1000);
    }
   	}
    catch(Exception e)
	   {
	     Assert.assertTrue ( false, " selectGoView failed" ); 
	  
	   }
     }
 @Test(groups="STEPDemo",priority = 5,description="Test cases for tearDown")
 public void tearDown() throws InterruptedException 
	 {	
	    	 
		  		
		  		try 
				
				 {	
		  	
		  			driver.close();
		  			
		  			 
		 
		  		
			    Thread.sleep( 5000 );
			      
			  	 }
		
			  catch (Exception e)
			      {
				  
				 
				  System.out.println("Nothing to do with it");
			      }			  
		  	
		  	
	      }


  
  
}
  
















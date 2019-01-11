
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
import org.sikuli.basics.Settings;
	import org.sikuli.script.Button;
	import org.sikuli.script.FindFailed;
	import org.sikuli.script.Key;
import org.sikuli.script.KeyModifier;
import org.sikuli.script.Match;
	import org.sikuli.script.Pattern;
	import org.sikuli.script.Region;
	import org.sikuli.script.Screen;
	import org.testng.Assert;
	import org.testng.Reporter;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Parameters;
	import org.testng.annotations.Test;
	import org.testng.asserts.SoftAssert;





	//import Utility.Constant;

	public class Promap 
	
	{

		protected static WebDriver driver;
	    protected static Screen s = new Screen();
	    protected static Region outofroom = Screen.create( 930,655,0,0 );
	    static String ImageDictionarypath; 
	  
	 
	
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
		/*  //Region search2 = s.find(Constant.ImageDictionary + "//login.png");
			//do {
				Settings.ClickDelay = .3;
				//s.hover(Constant.ImageDictionary + "//login.png");
				//s.click(Constant.ImageDictionary + "//login.png");
				s.mouseUp();
				s.wait(.4);
			//} while (s.exists(Constant.ImageDictionary + "//request.png") == null);
			Thread.sleep(1000);
			//Region search3 = s.find(Constant.ImageDictionary + "//email.png");
			//do {
				Settings.ClickDelay = .3;
				//search3.type("NOPPER01");
			
			//} while (s.exists(Constant.ImageDictionary + "//request.png") == null);
			Thread.sleep(2000);
		  
			Region search4 = s.find(Constant.ImageDictionary + "//pwd.png");
			//do {
				Settings.ClickDelay = .3;
				search4.type("int");
			//} while (s.exists(Constant.ImageDictionary + "//request.png") == null);
			Thread.sleep(1000);
		  
		  
			Region request1 = s.find(Constant.ImageDictionary + "//submit.png");
			
			Settings.ClickDelay = .3;
			s.hover(request1);
			s.click(request1);
			s.mouseUp();
		    s.wait(.4);
		  
		    Thread.sleep(1000);
		  
		  
		  
		  Region request = s.find(Constant.ImageDictionary + "//print.png");
		
				Settings.ClickDelay = .3;
				s.hover(request);
				s.click(request);
				s.mouseUp();
			    s.wait(.4);
			
			Thread.sleep(500);
			Region search = s.find(Constant.ImageDictionary + "//osdetails.png");
			//do {
				Settings.ClickDelay = .3;
				s.hover(search);
				s.click(search);
				s.mouseUp();
				s.wait(.4);
			//} while (s.exists(Constant.ImageDictionary + "//request.png") == null);
			Thread.sleep(1000);
			Region search1 = s.find(Constant.ImageDictionary + "//site.png");
			//do {
				Settings.ClickDelay = .3;
				s.hover(search1);
				s.click(search1);
				s.mouseUp();
				s.wait(.4);
			//} while (s.exists(Constant.ImageDictionary + "//request.png") == null);
			Thread.sleep(1000);
			
			
			Region Sitemarkeron = s.find(Constant.ImageDictionary + "//SMtoggleon.png");
			//do {
				Settings.ClickDelay = .3;
				s.hover(Sitemarkeron);
				s.click(Sitemarkeron);
				s.mouseUp();
				s.wait(.4);
			//} while (s.exists(Constant.ImageDictionary + "//request.png") == null);
			Thread.sleep(1000);
			//Region Sitemarkeroff = s.find(Constant.ImageDictionary + "//SMtoggleoff.png");
			//do {
			//	Settings.ClickDelay = .3;
			//	s.hover(Sitemarkeroff);
			//	s.click(Sitemarkeroff);
			//	s.mouseUp();
			//	s.wait(.4);
			//} while (s.exists(Constant.ImageDictionary + "//request.png") == null);
			Thread.sleep(1000);
			
			 Match porefregion=  s.find( Constant.ImageDictionary+"//poref.png" );
		     Region porefregionclk= porefregion.right(100);	
		 
			
				s.hover(porefregionclk);
				s.type("int");
				s.mouseUp();
				s.wait(.4);
			//} while (s.exists(Constant.ImageDictionary + "//request.png") == null);
			Thread.sleep(1000);
			
			Match prorefregion=  s.find( Constant.ImageDictionary+"//proref.png" );
		     Region prorefregionclk= porefregion.right(100);	
		 
			
				s.hover(prorefregionclk);
				s.type("int");
				s.mouseUp();
				s.wait(.4);
			//} while (s.exists(Constant.ImageDictionary + "//request.png") == null);
			Thread.sleep(1000);*/
		 // driver.get("https://bvt2-www2.promap.co.uk");
        //  driver.manage().window().maximize();

         // Thread.sleep(15000);

          //  var dontShowFlashMessage = driver.FindElement(By.CssSelector("div[ng-click=\"FlashMessage.dontShowFlashMessage()\"]"));

          // dontShowFlashMessage.Click();


         // WebElement chk4 = driver.findElement(By.id("tutorial-btn-next"));
          //chk4.click();

         // WebElement chk5 = driver.findElement(By.id("tutorial-btn-skip"));a
         // chk5.click();


        // WebElement chk = driver.findElement(By.className("icon-power-off"));

        //  chk.click();

          //Thread.sleep(5000);

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
  		  			  //  driver.close();
  		  			Thread.sleep( 5000 );
  		  			s.type(Key.F4,KeyModifier.ALT);
  		  			driver.close();
  		  			
  		  			 
  		 
  		  		
  			    Thread.sleep( 5000 );
  			      
  			  	 }
  		
  			  catch (Exception e)
  			      {
  				  
  				 
  				  System.out.println("Nothing to do with it");
  			      }			  
  		  	
  		  	
  	      }


	  
	  
	}
	  


	
	
	
	
	
	
	
	
	
	
	



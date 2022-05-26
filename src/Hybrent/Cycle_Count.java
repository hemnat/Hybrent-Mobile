package Hybrent;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Cycle_Count
{
	String get_orderNO1;
	public static int getRandomInteger(int maximum, int minimum)
	{ 
		return ((int) (Math.random()*(maximum - minimum))) + minimum; 
	}
	@Test(priority = 26)
	public void Start_Cycle_Count() throws InterruptedException 
	{
		
		//click menu
				Thread.sleep(6000);
				WebDriverWait menu= new WebDriverWait(Login.driver, 30);
				try {
					WebElement menu_button=menu.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.Button")));
				     menu_button.click();
					
				}
				catch (Exception e) 
				{
					WebElement menu_button=menu.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.Button")));
				     menu_button.click();	
				}
	   
				  	 
	WebDriverWait menu1= new WebDriverWait(Login.driver, 30);
				try
				{
	  WebElement Click_Cycle_Count=  menu1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[9]/android.view.View\n" + 
	  		"")));
	  Click_Cycle_Count.click();
	  Thread.sleep(25000);
	  Reporter.log("=====Cycle count Started=====", true);
				}
	 catch (Exception e) 
	{
		WebElement Click_Cycle_Count= menu1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[10]/android.view.View\n" + 
		"")));
		Click_Cycle_Count.click();
		Thread.sleep(25000);
		Reporter.log("=====Cycle count Started=====", true);
	}
	  
	WebDriverWait int_cycle= new WebDriverWait(Login.driver, 80);
	WebElement Initiate_Cycle=  int_cycle.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[2]/android.widget.Button\n" + 
				  		"")));
	Initiate_Cycle.click();
	Thread.sleep(2000);
				  
	WebElement Select_Inv=  int_cycle.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View\n" + 
				  		"")));
	Select_Inv.click();
	Thread.sleep(1000);
				  
	WebElement Select_Inv1=  int_cycle.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View/android.widget.ListView/android.view.View[1]/android.view.View/android.view.View/android.widget.Button")));
	Select_Inv1.click();
	Thread.sleep(1000);
				  
	WebDriverWait int_cycle1= new WebDriverWait(Login.driver, 30);
	WebElement Initiate=  int_cycle1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View[2]/android.widget.Button\n" + 
				  		"")));
	Initiate.click();
	Thread.sleep(1000);
				  
	WebElement StartCount=   int_cycle1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc=\"Start Count\"]/android.view.View")));
	StartCount.click();
	Thread.sleep(1000);
				  
				  String before= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.view.View[";
				  String after= "]/android.view.View[11]/android.widget.EditText";
				  int i=1;
				  while(i<=2)
				  {
				      String complete1=before+i+after;
					   WebElement enter_value=  Login.driver.findElement(By.xpath(complete1));
					   enter_value.sendKeys(Integer.toString(getRandomInteger(10,1))); 
					   i++;
				  }
				    
				  WebDriverWait int_cycle2= new WebDriverWait(Login.driver, 30);
				  WebElement Counted_Item=  int_cycle2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc=\"Counted Items (0)\"]/android.widget.TextView")));
				  Counted_Item.click();
				  Thread.sleep(1000);
				  
				    WebElement NewItem= int_cycle2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[1]\n" + 
				    		"")));
				    NewItem.click();
					Thread.sleep(1000);
				    
				    WebElement enter_new= int_cycle2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[11]/android.widget.EditText\n" + 
				    		"")));
				    enter_new.sendKeys(Integer.toString(getRandomInteger(10,1)));
					Thread.sleep(1000);
					
					WebDriverWait int_cycle3= new WebDriverWait(Login.driver, 30);
					WebElement complete= int_cycle3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.widget.Button\n" + 
							"")));
			        complete.click();
					Thread.sleep(1000);
					
					WebElement get_orderNO= int_cycle3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View[1]\n" + 
							"")));
			        get_orderNO1= get_orderNO.getText();
					System.out.println(get_orderNO1);
					get_orderNO1 = get_orderNO1.replaceAll("\n", "").substring(0,12);
					System.out.println(get_orderNO1);
					
					WebDriverWait int_cycle4= new WebDriverWait(Login.driver, 30);
					WebElement complete1= int_cycle4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[3]/android.widget.Button")));
			        complete1.click();
					Thread.sleep(1000);
					
					WebElement YesPopup= int_cycle4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View/android.widget.Button[2]\n" + 
							"")));
					YesPopup.click();
					Thread.sleep(8000);
					Reporter.log("=====Cycle Count Completed Successfully=====", true);
				
				}
					
					
				@Test(priority = 27)
					public void Verify_CycleCount() throws InterruptedException 
					{
					
					WebDriverWait int_cycle5= new WebDriverWait(Login.driver, 30);
					  WebElement Search= int_cycle5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[1]/android.widget.EditText\n" + 
							"")));
					   Search.sendKeys(get_orderNO1);
					   Thread.sleep(5000);
					   
					   WebElement Review_Count= int_cycle5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[1]/android.widget.EditText\n" + 
								"")));
					   Review_Count.click();
					   Thread.sleep(4000);
					   
					   /*
					   WebElement Review_Count1=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[1]/android.widget.EditText\n" + 
								""));
					   Review_Count1.click();
					   Thread.sleep(2000);
					   
					   WebElement Cancel_Count=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.widget.Button\n" + 
					   		""));
					   Cancel_Count.click();
					   Thread.sleep(1000);
					   Reporter.log("=====Cycle Count Verified Successfully=====", true);
					   */
					}
}

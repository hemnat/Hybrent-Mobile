package Hybrent3_8_1rc1;





import static org.testng.Assert.assertEquals;

import org.jfree.data.KeyedValues;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.nativekey.KeyEvent;


public class Cycle_Count
{
	String get_orderNO1;
	public static int getRandomInteger(int maximum, int minimum)
	{ 
		return ((int) (Math.random()*(maximum - minimum))) + minimum; 
	}
	@Test(priority = 57)
	public void VerifyCycleCountButtonTap() throws InterruptedException 
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
	  WebElement Click_Cycle_Count=  menu1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[9]/android.widget.TextView\n" + 
	  		"")));
	  Click_Cycle_Count.click();
	  Thread.sleep(10000);
	  Reporter.log("=====Cycle count Started=====", true);
				}
	 catch (Exception e) 
	{
		WebElement Click_Cycle_Count= menu1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[10]/android.widget.TextView\n" + 
				"")));
		Click_Cycle_Count.click();
		Thread.sleep(10000);
		
		Reporter.log("=====Cycle count Started=====", true);
	}
	try
	{
		WebElement CycleCount_get= menu1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.TextView")));
			 	String CycleCount_text= CycleCount_get.getText();
			 	assertEquals(CycleCount_text, "Cycle Count");
	}
	catch (Exception e) 
	{
		 WebElement CycleCount_get= menu1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.TextView")));
			String CycleCount_text= CycleCount_get.getText();
			assertEquals(CycleCount_text, "Cycle Count");
	}
				
	}
	
	@Test(priority = 58)
   public void VerifyIntiateCycleCount() throws InterruptedException 
				
 {
	WebDriverWait int_cycle= new WebDriverWait(Login.driver, 20);
	try
	{
		WebElement Initiate_Cycle=  int_cycle.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[2]/android.widget.Button")));
		Initiate_Cycle.click();
		Thread.sleep(2000);
	
	}
	catch (Exception e) 
	{
		WebElement Initiate_Cycle=  int_cycle.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]/android.view.View/android.view.View[2]/android.widget.Button")));
	   Initiate_Cycle.click();
	   Thread.sleep(2000);
		
	}
		
	WebDriverWait int_cycle1= new WebDriverWait(Login.driver, 20);
	WebElement Select_Inv=  int_cycle1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc=\"Select\"]/android.widget.TextView\n" + 
			"")));
	Select_Inv.click();
	Thread.sleep(1000);
	
	try
	{
		WebElement Select_Inv1=  int_cycle.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[2]/android.widget.ListView/android.view.View[1]/android.view.View/android.view.View/android.widget.Button")));
		Select_Inv1.click();
        Thread.sleep(4000);
	}
	catch (Exception e) 
	{
		WebElement Select_Inv1=  int_cycle.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[2]/android.widget.ListView/android.view.View[2]/android.view.View/android.view.View/android.widget.Button")));
		Select_Inv1.click();
		Thread.sleep(4000);
	}
				  
	WebDriverWait int_cycle2= new WebDriverWait(Login.driver, 30);
	WebElement Initiate=  int_cycle2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View/android.widget.Button")));
	Initiate.click();
	Thread.sleep(10000);
	
	
	WebElement StartCount= int_cycle2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc=\"Start Count \"]")));
	StartCount.click();
	Thread.sleep(10000);
	

	try
	{
	WebElement get_value= int_cycle2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[3]/android.view.View[1]/android.widget.TextView[3]")));
	String get_value1= get_value.getText();
	WebElement Click_count= int_cycle2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[3]/android.view.View[1]/android.view.View[5]/android.widget.Button")));
	Click_count.click();
	WebElement enter_value= int_cycle2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.EditText")));
	enter_value.sendKeys(get_value1);
	WebElement save_value= int_cycle2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.widget.Button[2]\n" + 
			"")));
	save_value.click();
	Thread.sleep(2000);
	}
	catch (Exception e) 
	{
		WebElement get_value= int_cycle2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[3]/android.view.View[1]/android.widget.TextView[3]")));
		String get_value1= get_value.getText();
		WebElement Click_count= int_cycle2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[3]/android.view.View[1]/android.view.View[5]/android.widget.Button")));
		Click_count.click();
		WebElement enter_value= int_cycle2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.EditText")));
		enter_value.sendKeys(get_value1);
		WebElement save_value= int_cycle2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.widget.Button[2]\n" + 
				"")));
		save_value.click();
		Thread.sleep(2000);
	}
	
	WebElement Click_Submit= int_cycle2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View/android.widget.Button\n" + 
			"")));
	Click_Submit.click();
	 Thread.sleep(7000);
	
				    
				  WebDriverWait int_cycle3= new WebDriverWait(Login.driver, 30);
				  WebElement Counted_Item=  int_cycle3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc=\"1Counted Items\"]")));
				  Counted_Item.click();
				  Thread.sleep(5000);
				  
				    WebElement NewItem= int_cycle3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc=\"New Item\"]")));
				    NewItem.click();
					Thread.sleep(5000);
					
					WebElement Click_AddCount= int_cycle3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[7]/android.widget.Button\n" + 
							"")));
					Click_AddCount.click();
					
					 WebElement min_qty= int_cycle3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.EditText[1]")));
					 min_qty.sendKeys("10");
					 
					 WebElement max_qty= int_cycle3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.EditText[2]")));
					 max_qty.sendKeys("20");
					 
					 WebElement par_qty= int_cycle3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.EditText[3]")));
					 par_qty.sendKeys("15");
				    
					WebElement New_count= int_cycle3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.EditText[4]")));
					New_count.sendKeys("100");
					
					WebElement save_value= int_cycle3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.widget.Button[2]")));
					save_value.click();
					Thread.sleep(2000);
					
					WebElement submit_All= int_cycle3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View/android.widget.Button")));
					submit_All.click();
					Thread.sleep(7000);
					
					WebDriverWait int_cycle4= new WebDriverWait(Login.driver, 30);
					try
					{
					WebElement complete= int_cycle4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.widget.Button")));
			        complete.click();
					Thread.sleep(3000);
					}
					catch (Exception e)
					{
						WebElement complete= int_cycle4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View/android.widget.Button")));
				        complete.click();
						Thread.sleep(3000);
					}
					
					//WebElement get_orderNO= int_cycle3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View[1]\n" + 
					//		"")));
			        //get_orderNO1= get_orderNO.getText();
			        /*
					System.out.println(get_orderNO1);
					get_orderNO1 = get_orderNO1.replaceAll("\n", "").substring(0,12);
					System.out.println(get_orderNO1);
					*/
			        WebDriverWait int_cycle5= new WebDriverWait(Login.driver, 30);
			        try
			        {
					WebElement complete1= int_cycle5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.widget.Button")));
			        complete1.click();
					Thread.sleep(1000);
			        }
			        catch (Exception e) 
			        {
			        	WebElement complete1= int_cycle5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.view.View[3]/android.widget.Button")));
				        complete1.click();
						Thread.sleep(1000);
					}
					
					WebElement YesPopup= int_cycle5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.widget.Button[2]")));
					YesPopup.click();
					Thread.sleep(8000);
					Reporter.log("=====Cycle Count Completed Successfully=====", true);
				
				}
					
					
		@Test(priority = 59)
		public void Verify_CycleCount() throws InterruptedException 
		{
			WebDriverWait int_cycle5= new WebDriverWait(Login.driver, 30);
					   
			WebElement Verify_completion= int_cycle5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[3]/android.widget.TextView")));
			String CycleCount_text= Verify_completion.getText();
			assertEquals(CycleCount_text, "No cycle count found.");
			Thread.sleep(4000);
					   
	     }
}

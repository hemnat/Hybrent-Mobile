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

public class ScanIn {
	
	@SuppressWarnings("rawtypes")
	@Test(priority = 17)
	public void Scan_In() throws InterruptedException 
	{
		Thread.sleep(6000);
	 //click menu
		WebDriverWait menu_btn= new WebDriverWait(Login.driver, 20);
		try {
		 
		     WebElement menu_button=menu_btn.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.Button")));
		     menu_button.click();
		}
		catch (Exception e) 
		{
		    WebElement menu_button=menu_btn.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.Button")));
		     menu_button.click();
		}
		
		
		  	 
		  	WebDriverWait menu_btn1= new WebDriverWait(Login.driver, 20);
	  	 try
	  	 {
	  	WebElement scan_in=  menu_btn1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[6]/android.view.View")));
		 scan_in.click();
		 Reporter.log("=====ScanIn Started=====", true);
	  	 }
	  	 catch (Exception e) 
	  	 {
	  		WebElement scan_in= menu_btn1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[7]/android.view.View")));
			 scan_in.click();
			 Reporter.log("=====ScanIn Started=====", true);
		}
	
	  	WebDriverWait add_item_slide= new WebDriverWait(Login.driver, 30);
	  	 
		 WebElement add_items=  add_item_slide.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View[1]/android.widget.Button")));
		 add_items.click();
		 Thread.sleep(5000);
		 
		 TouchAction ts1 = new TouchAction(Login.driver);
		 ts1.press(PointOption.point(1000,550))
	    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
	    .moveTo(PointOption.point(650,550)).release().perform();
		 Thread.sleep(2500);
		 
		 WebElement add_item=  add_item_slide.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View\n" + 
		 		"")));
		 add_item.click();
		 Thread.sleep(3000);
		 
		 WebElement select_inventory=  add_item_slide.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc=\"Select\"]/android.widget.TextView\n" + 
		 		"")));
		 select_inventory.click();
		 
		WebDriverWait add_item_slide1= new WebDriverWait(Login.driver, 30);
		 
		 WebElement Final_select=  add_item_slide1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View/android.widget.ListView/android.view.View[1]/android.view.View/android.view.View/android.widget.Button\n" + 
		 		"")));
		 Final_select.click();
		 
		 WebElement add_uou=  add_item_slide1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[8]/android.view.View[2]/android.widget.Spinner\n" + 
		 		"")));
		 add_uou.click();
		 
		 WebElement add_uou1=  add_item_slide1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]\n" + 
		 		"")));
		 add_uou1.click();
		 
		 WebDriverWait add_qty= new WebDriverWait(Login.driver, 100);
		 WebElement Add=  add_qty.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[3]/android.widget.Button[2]")));
		 Add.click();
			 
		WebElement increase_qty=  add_qty.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View[4]/android.view.View[2]/android.widget.Button\n" + 
			 		"")));
		increase_qty.click();
				 
		WebElement increase_qty1=  add_qty.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View[4]/android.view.View[2]/android.widget.Button\n" + 
				 		"")));
		increase_qty1.click();
		Thread.sleep(5000);
					 
		 WebDriverWait cmpt= new WebDriverWait(Login.driver, 100);
		WebElement complete= cmpt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View[3]/android.widget.Button")));
		complete.click();
		
		WebElement complete1= cmpt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[3]/android.widget.Button[2]\n" + 
				"")));
		complete1.click();
		Thread.sleep(6000);
		
		
	}
}

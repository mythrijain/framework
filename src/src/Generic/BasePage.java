package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage {
	public WebDriver driver2;
	public BasePage(WebDriver d)
	{
		this.driver2=d;
	}
	public void titlewait(String expected_title)
	{
		WebDriverWait wait = new WebDriverWait(driver2, 10);
		
		try {
			wait.until(ExpectedConditions.titleIs(expected_title));
			Reporter.log("Pass:title is matching", true);
		} catch (Exception e) {
			// TODO: handle exception
			Reporter.log("fail:title is not matching", true);
			Assert.fail();
		}
	}
	
	public void userclick_visible(WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver2, 10);
	 try {
		    wait.until(ExpectedConditions.visibilityOf(element));
		    Reporter.log("Pass: User page is loaded", true);
		 }
		 catch (Exception e) {
			 Reporter.log("Fail: User page is not loaded", true);
			 Assert.fail();
		}
	}

}

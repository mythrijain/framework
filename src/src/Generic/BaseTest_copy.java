package Generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest_copy implements AutoConstant {
	
	public WebDriver driver;
	
	static
	{
		System.setProperty(chromekey, chromevalue);
		System.setProperty(geckokey, geckovalue);
	}
	
	@BeforeMethod()
	public void precondition()
	{
		driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
		
	@AfterMethod
	public void postcondition(ITestResult re)
	{
		String script_name = re.getMethod().getMethodName();
		int status = re.getStatus();
		//System.out.println(script_name);
		//System.out.println(status);
		if(status==2)
			utilities.getphoto(driver, script_name);
		driver.close();
	}

}

package Generic;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class utilities {
	
	public static void getphoto(WebDriver driver3, String name)
	{
		TakesScreenshot t= (TakesScreenshot)driver3;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest = new File("./photo/"+name+".png");
		try
		{
		FileUtils.copyFile(src, dest);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

}

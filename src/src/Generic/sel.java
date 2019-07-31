package Generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class sel {
	
	public static void selectbyindes(WebElement element, int index)
	{
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	
	public static void selectbyvalue(WebElement element, String value)
	{
		Select select=new Select(element);
		select.selectByValue(value);
	}

}

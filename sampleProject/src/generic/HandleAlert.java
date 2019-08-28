package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HandleAlert {
	public static void acceptAlert(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	
	public static void dismissAlert(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	
	
	public static String getAlertText(WebDriver driver)
	{
		return driver.switchTo().alert().getText();
	}
	/*To Get Tooltip Text */
	public String getTooltipText(WebElement element)
	{
		String tooltipText = element.getAttribute("title").trim();
		return tooltipText;
	}

}

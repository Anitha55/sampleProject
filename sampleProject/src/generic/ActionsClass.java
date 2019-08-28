package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {
	Actions ac;
	/* To Drag and Drop from Source Locator to Destination Locator */
	public void dragandDrop(WebElement Source, WebElement Destination)
	{
		ac = new Actions(getWebDriver());
		ac.dragAndDrop(Source, Destination);
	}


	/*To Drag from the given WebElement Location and Drop at the given WebElement location */
	public void dragandDropTo(WebElement Source, int XOffset, int YOffset) throws Exception 
	{
		ac = new Actions(getWebDriver());
		ac.dragAndDropBy(Source, XOffset, YOffset);
	}


	/*To Open a Page in New Tab */
	public void rightClick(WebElement element) 
	{
		ac = new Actions(getWebDriver());
		ac.contextClick(element);
		ac.build().perform();	
	}


	private WebDriver getWebDriver() {
		// TODO Auto-generated method stub
		return null;
	}


	/*To Close Current Tab */
	public void closeCurrentTab() 
	{
		getWebDriver().close();		
	}


	/*To Perform Click and Hold Action */
	public void clickAndHold(WebElement element)
	{
		ac = new Actions(getWebDriver());
		ac.clickAndHold(element);
		ac.build().perform();
	}


	/*To Perform Click and Hold Action */
	public void doubleClick(WebElement element)
	{
		ac = new Actions(getWebDriver());
		ac.doubleClick(element);
		ac.build().perform();
	}



}

package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitFunctions {
	static WebDriver driver;
	static WebDriverWait wait;
	public static void waitMyTime(int i) {
		driver.manage().timeouts().implicitlyWait(i, TimeUnit.SECONDS);
    }
	// The expected condition waits for an element to be clickable
	public static void waitForElement(WebElement element,int seconds) {

		wait = new WebDriverWait(driver, seconds);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	// The expected condition waits for an element to be visible
	public static void waitTillElementFound( WebDriver driver,WebElement ElementTobeFound,int seconds) {
		wait = new WebDriverWait(driver, seconds);
		wait.until(ExpectedConditions.visibilityOf(ElementTobeFound));
	}

	//The expected condition waits for an element having a certain string pattern.
	public static void waitTilltextToBePresent(WebElement TextToBePresent,String text,int seconds) {
		wait = new WebDriverWait(driver, seconds);
		wait.until(ExpectedConditions.textToBePresentInElement(TextToBePresent, text));
	}
	//The expected condition waits for a page with a specific title
	public static void waitTillTitleToBeVisible(String Title,int seconds) {
		wait = new WebDriverWait(driver, seconds);
		wait.until(ExpectedConditions.titleIs(Title));
	}
	// The expected condition waits for a frame to be available and then as soon as the frame is available, the control switches to it automatically
	public static void waitTillFrameToBeAvailable(String frameToBeAvailable,int seconds) {
		wait = new WebDriverWait(driver, seconds);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameToBeAvailable));
	}
	public static void waitTillElementToBeFound(WebElement element,int seconds,String methodName) {
		wait = new WebDriverWait(driver, seconds);
		if(methodName.equalsIgnoreCase("elementToBeClickable")) {
			wait.until(ExpectedConditions.elementToBeClickable(element));
		}else if(methodName.equalsIgnoreCase("visibilityOf")) {
			wait.until(ExpectedConditions.visibilityOf(element));
		}
	}
}


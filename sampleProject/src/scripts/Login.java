package scripts;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
	public static void main(String[] args) throws Exception {
		
	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.metrobankonline.co.uk/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//button[text()='Log in']")).click();
	driver.findElement(By.xpath("//a[text()='Register for online banking']")).click();
	String mainWindow = driver.getWindowHandle();
	System.out.println(mainWindow);
	/*Set<String> set =driver.getWindowHandles();
	 // Using Iterator to iterate with in windows
	 Iterator<String> itr= set.iterator();
	 while(itr.hasNext()){
	 String childWindow=itr.next();
	    // Compare whether the main windows is not equal to child window. If not equal, we will close.
	 if(!mainWindow.equals(childWindow)){
	 driver.switchTo().window(childWindow);
	 System.out.println( driver.switchTo().window(childWindow).getCurrentUrl());
	 System.out.println(driver.switchTo().window(childWindow).getTitle());
	// driver.findElement(By.xpath("//input[@id='USER_NAME']")).sendKeys("anitha");
	// driver.close();*/
	 
	 
Set<String> handles = driver.getWindowHandles();
	
	for(String window: handles) {
		int length = window.length();
		
		System.out.println(length);

driver.switchTo().window(window);
String title = driver.getTitle();
System.out.println(title);
driver.findElement(By.xpath("//a[@title='Register for online banking']")).click();
driver.close();
	/*WebDriverWait wait=new WebDriverWait(driver, 30);
	
	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Our Stores ']")));
    System.out.println(element);
    element.click();*/
	//Thread.sleep(2000);
	//driver.findElement(By.xpath("//span[text()='Our Stores ']")).click();
	
	}
	// driver.switchTo().defaultContent();
	}
}

package scripts;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Metro_BankAccounts {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.metrobankonline.co.uk/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	Actions action=new Actions(driver);
	action.moveToElement(driver.findElement(By.xpath("//nav[@class='header-nav header-nav_hero']//ul//li"
			+ "//a[text()='Bank accounts']"))).perform();
	WebDriverWait wait=new WebDriverWait(driver, 20);
	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@class='header-nav-list header-nav-list_level_3 header-nav-list_hero']//li//a[text()='Cash account']")));
element.click();
	
	//  driver.findElement(By.xpath("//ul[@class='header-nav-list header-nav-list_level_3 header-nav-list_hero']//li//a[text()='Cash account']")).click();
Thread.sleep(2000);
WebElement Cash_Acount_text = driver.findElement(By.xpath("//span[@class='breadcrumb breadcrumb_current']"));
String text = Cash_Acount_text.getText();
System.out.println(text);
Assert.assertEquals(text,"Cash account");
driver.navigate().back();


}
  

}

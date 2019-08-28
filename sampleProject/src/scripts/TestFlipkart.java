package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestFlipkart {
	public static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys("8801275999");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Anitha@405");
	driver.findElement(By.xpath("//button[@type='submit']//span[text()='Login']")).click();
	Actions action=new Actions(driver);
	action.moveToElement(driver.findElement(By.xpath("//div[text()='My Account']"))).perform();
}
}

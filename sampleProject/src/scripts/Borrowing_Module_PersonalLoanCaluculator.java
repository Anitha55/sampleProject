package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Borrowing_Module_PersonalLoanCaluculator{

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.metrobankonline.co.uk/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Borrowing']//span"))).perform();
		
		driver.findElement(By.xpath("//ul[@class='header-nav-list header-nav-list_level_3 header-nav-list_hero']//li//a[text()='Personal loan calculator']")).click();
		/*WebDriverWait wait=new WebDriverWait(driver, 20);
		
	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Credit card']")));
    System.out.println(element);
	element.click();*/
		//driver.navigate().back();
	}

}


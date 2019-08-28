package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseClass implements IAutoConstant{
	public static WebDriver driver;
	public static void main(String[] args) {
		BaseClass bs=new BaseClass();
		bs.openApplication();
	
		//bs.closeApplication();
		
	}
	static{
		System.setProperty(CHROME_KEY, CHROME_PATH);
	}
	@BeforeMethod
	public void openApplication(){
		driver=new ChromeDriver();
		String url = Lib.getProperty(CONFIG_PATH, "URL");
		driver.get(url);
			String ITO = Lib.getProperty(CONFIG_PATH, "ImplicitTimeOut");
			int timeoutperiod = Integer.parseInt(ITO);
			driver.manage().timeouts().implicitlyWait(timeoutperiod, TimeUnit.SECONDS);
			
	}
	@Test(priority=1,invocationCount=2)
	public void createUser() {
		System.out.println("user is created");
	}
	@Test(priority=2)
	public void deleteUser() {
		System.out.println("user is deleted");
	}
	
	@AfterMethod
	public void closeApplication() {
		driver.close();
	}

}

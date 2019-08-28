package scripts;


import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClass 	{

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
	 WebDriver driver=new ChromeDriver();
		//  driver.get("https://www.joecolantonio.com/SeleniumTestPage.html");
	  driver.get("https://www.stqatools.com"); 
	 driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		
		  
		// Create object of Robot class
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ESCAPE);
		 
		// This will release the CAPS_LOCK key.
		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
		 


	
		
}

}

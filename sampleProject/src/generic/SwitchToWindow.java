package generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class SwitchToWindow {
	static WebDriver driver;
	public static void switchToNewWindow() {
		Set s = driver.getWindowHandles();
		Iterator itr = s.iterator();
		String w1 = (String) itr.next();
		String w2 = (String) itr.next();
		driver.switchTo().window(w2);
		}

		public static void switchToOldWindow() {
		Set s = driver.getWindowHandles();
		Iterator itr = s.iterator();
		String w1 = (String) itr.next();
		String w2 = (String) itr.next();
		driver.switchTo().window(w1);
		}

		public static void switchToParentWindow() {
		driver.switchTo().defaultContent();
		}
		/*To Close all Tabs/Windows except the First Tab */
		public void closeAllTabsExceptFirst() 
		{
			ArrayList<String> tabs = new ArrayList<String> (getWebDriver().getWindowHandles());
			for(int i=1;i<tabs.size();i++)
			{	
				getWebDriver().switchTo().window(tabs.get(i));
				getWebDriver().close();
			}
			getWebDriver().switchTo().window(tabs.get(0));
		}
		
		
		private WebDriver getWebDriver() {
			// TODO Auto-generated method stub
			return null;
		}

		/*To Print all the Windows */
		public void printAllTheWindows() 
		{
			ArrayList<String> al = new ArrayList<String>(getWebDriver().getWindowHandles());
			for(String window : al)
			{
				System.out.println(window);
			}
		}

}

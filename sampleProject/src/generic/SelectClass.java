package generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	/*public static void selectElementByNameMethod(WebElement element, String Name) {
			Select selectitem = new Select(element);
		
		  // WaitFunctions wait=new WaitFunctions(); 
		//  wait.waitTillTitleToBeVisible(Title, seconds);
		 		
		selectitem.selectByVisibleText(Name);
	}

	public static void selectElementByValueMethod(WebElement element,String value) {
		Select selectitem = new Select(element);
		selectitem.selectByValue(value);
	}

	public static void selectElementByIndexMethod(WebElement element, int index) {
		Select selectitem = new Select(element);
		selectitem.selectByIndex(index);
	}
     WaitFunctions function=new WaitFunctions();*/
	public  void selectMethod(WebElement element,String Name,String selectMethod, int seconds) {
		Select selectitem = new Select(element);
//function.waitTillElementFound(element, seconds);
		if(selectMethod.equalsIgnoreCase("selectByVisibleText")){
			selectitem.selectByVisibleText(Name);
		}else if(selectMethod.equalsIgnoreCase("selectByValve")){
			selectitem.selectByValue(Name);
		}else if(selectMethod.equalsIgnoreCase("selectByindex")){
			int index=Integer.parseInt(Name);
			selectitem.selectByIndex(index);
		}



	}
}
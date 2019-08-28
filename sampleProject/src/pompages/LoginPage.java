package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BaseClass;

public class LoginPage extends BaseClass{
	@FindBy(xpath="//span[text()='Enter Email/Mobile number']")
	WebElement UNTB;

	@FindBy(xpath="//span[text()='Enter Password']")
	WebElement PWDTB;

	@FindBy(xpath="//span[text()='Login']")
	WebElement SigninBTN;


	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
	public void setUsername(String un) {
		UNTB.sendKeys(un);
	}
	public void setPassword(String pwd) {
		PWDTB.sendKeys(pwd);
	}
	public void clickLogin() {
		SigninBTN.click();
	}
}

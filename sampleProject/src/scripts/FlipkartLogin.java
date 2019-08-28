package scripts;

import org.testng.annotations.Test;

import generic.BaseClass;
import pompages.LoginPage;

public class FlipkartLogin extends BaseClass {
	
	@Test
	public FlipkartLogin() {
		

	LoginPage lp=new LoginPage(driver);
	lp.setUsername("8801275999");
	lp.setPassword("Anitha@405");
	lp.clickLogin();

}
}
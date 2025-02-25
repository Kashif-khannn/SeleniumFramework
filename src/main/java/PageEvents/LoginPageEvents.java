package PageEvents;

import org.testng.Assert;

import pageObjects.LoginPageElements;
import utils.ElementFetch;

public class LoginPageEvents {
	ElementFetch element = new ElementFetch();
	public void verifyIfLoginPageIsLoaded() {
		
		Assert.assertTrue(element.getWebElements("XPATH", LoginPageElements.loginText).size()>0,"Element not found" );
		
	}
	
	public void enterCredentials() {
		element.getWebElement("XPATH", LoginPageElements.emailAddress).sendKeys("testing123@gmail.com");
		element.getWebElement("XPATH", LoginPageElements.passwordField).sendKeys("welc0me4");
		

	}

}

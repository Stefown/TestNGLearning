package suiteTestingAdvanced;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends base.BrowserFunctions {
	
	@Test(priority=1)
	public void doLogin(){
		
		openBrowser("chrome");
		navigateTo("http://google.com");
		driver.findElement(By.id("Email")).sendKeys("trainer@way2automation.com");
		driver.findElement(By.id("next")).click();
		
	}
	
	@Test(priority=2)
	public void composeEmail(){
		
		Assert.fail("Error in composing Email");
		
	}

}

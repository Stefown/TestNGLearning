package parallelTest;

import org.testng.annotations.Test;

public class TestInvocation extends base.BrowserFunctions{
	
	
	@Test(invocationCount = 2)
	public void executeTest()
	{
		openBrowser("chrome");
		navigateTo("http://google.com");
		System.out.println(driver.getTitle());
		
		driver.quit();
		
	}

}

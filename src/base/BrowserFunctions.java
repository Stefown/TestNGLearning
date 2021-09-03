package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFunctions {
		
	public static WebDriver driver;
	
	public WebDriver openBrowser(String browser) 
		{
		
		if(browser.equals("firefox"))
			{
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				ChromeOptions ops = new ChromeOptions();
				ops.addArguments("--disable-notifications");
			}else
			{
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				ChromeOptions ops = new ChromeOptions();
				ops.addArguments("--disable-notifications");
			}
		return driver;
		}
	
	public void navigateTo(String website)
	{
		driver.get(website);
	}
	
}

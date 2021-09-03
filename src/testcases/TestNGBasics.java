package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics extends BaseTest{

	@BeforeTest
	public void createDBConn() {
		System.out.println("Creating DB Connection");
	}

	@AfterTest
	public void closeDBConn() {
		System.out.println("Closing DB Connection");
	}

	@BeforeMethod
	public void launchBrowser() {
		System.out.println("Launching Browser");
	}

	@AfterMethod
	public void closeBrowser() {
		System.out.println("Closing Browser");
	}

	@Test(priority = 2, groups = "functional")
	public void doLogin()
	{
		System.out.println("Executing login test");

	}

	@Test(priority=1,groups="functional")
	public void doUserReg()
	{
		System.out.println("Executing User Reg test");
		
	}

}

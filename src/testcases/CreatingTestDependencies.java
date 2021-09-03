package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreatingTestDependencies extends BaseTest{

	@Test(priority=2,dependsOnMethods="doUserReg",groups={"functional","smoke"})
	public void doLogin()
	{
		
		System.out.println("Executing login test");
		
	}
	
	@Test(priority=1,groups={"functional","smoke"})
	public void doUserReg()
	{
		System.out.println("Executing User Reg test");
		Assert.fail("User not registered successfully");
	}
	
	@Test(priority=3,groups="bvt")
	public void thirdTest()
	{
		System.out.println("Executing Third Test");
	}
	
}

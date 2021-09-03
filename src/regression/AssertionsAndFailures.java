package regression;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsAndFailures {
	
	@Test
	public void validateTitles()
	{
		
		System.out.println("Beginning");
		String expected_title = "Yahoo.com";
		String actual_title = "Gmail.com";
		
		//Using an if else statement like this will always make your TestNG report pass
		/*
		 * if(expected_title.equals(actual_title)) 
		 * {
		 * System.out.println("Test Case Pass"); 
		 * }else 
		 * {
		 * System.out.println("Test Case Fail");
		 *  }
		 */
		//use Assert. instead
		
		SoftAssert softAssert = new SoftAssert();
		
		softAssert.assertEquals(actual_title, expected_title);
		//isElementPresent("xpath") - True, False
		softAssert.assertTrue(false, "Element not found");
		softAssert.fail("Failing the test as the condition is not met");
		
		System.out.println("Ending");
		
		softAssert.assertAll();
		
	
	}

}

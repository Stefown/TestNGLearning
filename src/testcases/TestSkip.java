package testcases;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestSkip {
	
	@Test
	public void isSkip()
	{
		throw new SkipException("Skipping the test because the condition is not met");
		
	}

}

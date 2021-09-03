package customListeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenersTestNGReport implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Passed test - "+result.getName());
		ITestListener.super.onTestSuccess(result);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.setProperty("org.uncommons.reportng.escape-output","false");
		Reporter.log("<a href=\"C:\\Users\\Stefo\\Desktop\\Stephen Bolduc Laptop\\Documents\\Selenium Java Course Resources\\Screenshot 2021-07-25 213227.png\" target=\"_blank\">Screenshot link</a>");
		Reporter.log("<br>");
		Reporter.log("<a href=\"C:\\Users\\Stefo\\Desktop\\Stephen Bolduc Laptop\\Documents\\Selenium Java Course Resources\\Screenshot 2021-07-25 213227.png\" target=\"_blank\"><img height=80 width=252 src=\"C:\\Users\\Stefo\\Desktop\\Stephen Bolduc Laptop\\Documents\\Selenium Java Course Resources\\Screenshot 2021-07-25 213227.png\"></a>");

		
		System.out.println("!!Failed test - "+result.getName()+"!!");
		System.out.println("Capturing Screenshot for the failed test - "+result.getName());
		ITestListener.super.onTestFailure(result);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}
	 

}

package customListeners;

import java.io.IOException;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import utilities.Emailer;
import utilities.MonitoringMail;
import utilities.ScreenshotAndZip;

public class ListenersScreenshotAndEmail extends base.BrowserFunctions implements ITestListener {

	@Override
	public void onFinish(ITestContext arg0) {

		ScreenshotAndZip.zip(System.getProperty("user.dir")+"\\screenshot");
		MonitoringMail mail = new MonitoringMail();
		try {
			mail.sendMail(Emailer.server, Emailer.from, Emailer.to, Emailer.subject, Emailer.messageBody, Emailer.attachmentPath, Emailer.attachmentName);
		} catch (AddressException e) {
			System.out.println("Email Address is INVALID");
			e.printStackTrace();
		} catch (MessagingException e) {
			System.out.println("Utility has encountered a Messaging Exception");
			e.printStackTrace();
		}
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {

		String methodName = result.getName().toString().trim();

		try {
			ScreenshotAndZip.captureScreenshot(methodName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

}



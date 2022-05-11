package listenerConcept;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerConcept implements ITestListener {
	public void onTestStart(ITestResult result) {
	    // not implemented
		System.out.println("****************Test started"+result.getName());
	  }

	  
	public void onTestSuccess(ITestResult result) {
	    // not implemented
		System.out.println("****************Test succesful"+result.getName());

	  }

	public void onTestFailure(ITestResult result) {
	    // not implemented
		System.out.println("****************Test failed"+result.getName());

	  }

	  
	public void onTestSkipped(ITestResult result) {
	    // not implemented
		System.out.println("****************Test skiped"+result.getName());

	  }

	  
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	    // not implemented

	  }

	  
	public void onTestFailedWithTimeout(ITestResult result) {
	    onTestFailure(result);
	  }

	public void onStart(ITestContext context) {
	    // not implemented
	  }

	  
	public void onFinish(ITestContext context) {
	    // not implemented
		System.out.println("****************Test completed"+context.getName());

	  }

}

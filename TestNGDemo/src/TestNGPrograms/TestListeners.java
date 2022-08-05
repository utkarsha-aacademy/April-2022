package TestNGPrograms;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListeners  implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("on Test start method started"+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("once test method success"+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("once test method failure"+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("once test method skipped"+result.getName());

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("on Test Failed But Within Success Percentage"+result.getName());

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("on Test Failed with timeout"+result.getName());

	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("on start method started");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("on finish method finished");
	}
 
}

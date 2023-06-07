package ListenerPackage;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {
	public void onTestStart(ITestResult result) {
	    // not implemented
		System.out.println("PassTest Started" + result.getName());
	  }
	public void onTestSuccess(ITestResult result) {
	    // not implemented
		System.out.println("TestSuccess" + result.getName());
	  }
	public void onTestFailure(ITestResult result) {
	    // not implemented
		System.out.println("TestFail" + result.getName());
	  }
	public void onTestSkipped(ITestResult result) {
	    // not implemented
		System.out.println("TestSkipped" + result.getName());
	  }
//	public void onStart(ITestContext context) {
//	    // not implemented
//		System.out.println("PassTest Started" + context.getName());
//	  }
//	public void onFinish(ITestContext context) {
//	    // not implemented
//		System.out.println("TestFinished" + context.getName());
//	  }
}

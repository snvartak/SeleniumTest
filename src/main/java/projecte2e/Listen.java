package projecte2e;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listen implements ITestListener {
	
	 
	 @Override
	 public void onTestStart(ITestResult result) {
	 System.out.println("Test started\n*******");
	 
	 }
	 
	 @Override
	 public void onTestSuccess(ITestResult result) {
		 System.out.println("*****\n******Test succeeded: " + result.getName());
	 
	 }
	 
	 @Override
	 public void onTestFailure(ITestResult result) {
		 System.out.println("Test failed");
	 
	 }
	 
	 @Override
	 public void onTestSkipped(ITestResult result) {
	 // TODO Auto-generated method stub
	 
	 }
	 
	 @Override
	 public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	 // TODO Auto-generated method stub
	 
	 }
	 
	 @Override
	 public void onStart(ITestContext context) {
		 System.out.println("\n*******"+ context.getPassedTests()+"\n**********");
	 
	 }

}

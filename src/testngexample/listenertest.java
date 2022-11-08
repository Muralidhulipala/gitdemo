package testngexample;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class listenertest implements ITestListener

{
	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
	}
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
		result.getName();
	}
	@Test
	public void t()
	{
		
	}
}

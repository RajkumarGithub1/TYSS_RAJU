package com.VTiger.Practice1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.google.common.io.Files;

public class ListenersPractice implements ITestListener
{
	
	

	@Override
	public void onFinish(ITestContext arg0) {
		System.out.println("onFinish");
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		System.out.println("onStart");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		System.out.println("onTestFailedButWithinSuccessPercentage");
		
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		System.out.println("onTestFailure");
		
		TakesScreenshot ts = (TakesScreenshot)sampleForListeners.sdriver;
		String loc="../TYSS_RAJU/screenshots/FAILED-at-"+result.getMethod().getMethodName()+".jpg";
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File dest=new File(loc);
		
		try {
			Files.copy(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Screeenshot Captured");
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		System.out.println("onTestSkipped");
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		System.out.println("onTestStart");
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		System.out.println("onTestSuccess");
		
	}

}

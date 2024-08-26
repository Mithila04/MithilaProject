package com.listener;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

 
import com.Mithila.BaseClass;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.MediaEntityBuilder;



public class ITestListenerClass extends BaseClass implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub

		try {
			ExtentReport. extenTest.pass(result.getMethod().getMethodName()+ ":" + "Test Pass",
					MediaEntityBuilder.createScreenCaptureFromPath(takeScreenshot()).build());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub

		try {
			ExtentReport.extenTest.fail(result.getMethod().getMethodName()+ ":" + "Test Fail",
					MediaEntityBuilder.createScreenCaptureFromPath(takeScreenshot()).build());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}


	
}


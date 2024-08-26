package com.listener;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.Mithila.BaseClass;
import com.aventstack.extentreports.ExtentTest;

public class ExtentReport extends BaseClass{
public static ExtentTest extenTest;
	
	@BeforeSuite
		public void extentTestReportStartup()throws IOException {
		BaseClass base = new BaseClass();
		base.extentReportStart(null);
	}	
	 @AfterSuite
	    public void extentReportEnd() throws IOException {
		 BaseClass base = new BaseClass();
	    	base.extentReportTearDown(null);
	    	}

}


package com.Mithila;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.listener.ExtentReport;
import com.listener.ITestListenerClass;
import com.pom.LoginPage;
@Listeners(ITestListenerClass.class)
public class AmazonRunner extends BaseClass {
public static WebDriver driver;
@BeforeTest
public static void setup() {
	driver = BaseClass.launchBrowser("chrome");
}
@Test (priority = -6)
public static void validLoginTest() {
	ExtentReport.extenTest = extentReports.createTest("LoginTest" +":"+Thread.currentThread()
	.getStackTrace()[1].getMethodName().toString()).info("valid Email with Valid Password");
	LoginPage lp = new LoginPage(driver);
	Assert.assertTrue(lp.validLogin(ExtentReport.extenTest));
	
}
@Test(priority = -5)
public static void invalidMailId() {
	ExtentReport.extenTest = extentReports.createTest("LoginTest" +":"+Thread.currentThread()
	.getStackTrace()[1].getMethodName().toString()).info("Tnvalid Email with Valid Password");
	LoginPage lp = new LoginPage(driver);
	lp.invalidEmailid();
}
@Test(priority = -4)
public static void validEmailIdInvalidpass() {
	ExtentReport.extenTest= extentReports.createTest("LoginTest" +":"+Thread.currentThread()
	.getStackTrace()[1].getMethodName().toString()).info("valid Email with Tnvalid Password");
	LoginPage lp = new LoginPage(driver);
	lp.validEmailIdInvalidPassword();
}
@Test(priority = -3)
public static void emptyEmailId() {
	ExtentReport.extenTest = extentReports.createTest("LoginTest" +":"+Thread.currentThread()
	.getStackTrace()[1].getMethodName().toString()).info("empty Email ID");
	LoginPage lp = new LoginPage(driver);
	lp.emptyEmailid();
}
@Test(priority = -2)
public static void validEmailIdwithemptypass() {
	ExtentReport.extenTest = extentReports.createTest("LoginTest" +":"+Thread.currentThread()
	.getStackTrace()[1].getMethodName().toString()).info("valid Email wth empty Password");
	LoginPage lp = new LoginPage(driver);
	lp.validEmailidWithEmptyPassword();
}@AfterTest
private void browserClose() {
	terminateBrowser();
}
@BeforeSuite
public static void extendReportStartUp() {
	extentReportStart("C:\\ecclipse-workspace\\Mithila\\Report");
}

@AfterSuite
public static void extendReportEnd() throws IOException{
	extentReportTearDown("C:\\\\ecclipse-workspace\\\\Mithila\\\\Report\\index.html");
}
}

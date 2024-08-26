package com.Mithila;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class CrossBrowsertesting extends BaseClass{
 @Test(enabled = false)
	private void chrome() {
	 launchBrowser("chrome");
	 launchUrl("https://www.amazon.in/");
	 System.out.println("Browser ID: " +Thread.currentThread().getId());
	 terminateBrowser();
 }
 @Test(invocationCount = 3)
 private void firefox() {
	 launchBrowser("firefox");
	 launchUrl("https://www.amazon.in/");
	 System.out.println("Browser ID: " +Thread.currentThread().getId());
	 terminateBrowser();
	  }
 @Test
 @Ignore
 private void edge() {
	 launchBrowser("edge");
	 launchUrl("https://www.amazon.in/");
	 System.out.println("Browser ID: " +Thread.currentThread().getId());
	 terminateBrowser();
 }
}

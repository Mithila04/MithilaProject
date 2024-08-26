package com.Mithila;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.xml.LaunchSuite;

public class RunnerClass extends BaseClass{

	@Test(priority = -3)
	
	private void browser() {
		launchBrowser("chrome");
		launchUrl("https://www.amazon.in/");
	}
	@Test(priority = 1)
	
	private void search() {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nokia Mobiles");
		
	}
@Test(priority = 5)
private void close() {
	driver.quit();}

}

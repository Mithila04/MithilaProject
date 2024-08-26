package com.Mithila;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataProvider {
@Test(dataProvider="login")
public void login (String username, String password) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.findElement(By.name("username")).sendKeys(username);
driver.findElement(By.name("password")).sendKeys(password);
driver.findElement(By.xpath("//button[@type='submit']")).submit();
}
@org.testng.annotations.DataProvider(name = "login")
public Object[][] setData(){
	return new Object[][] {
		{"Admin","123admin"},{"Admin","Admin"},{"Admin","admin123"}};
}
}

package com.Mithila;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUpload {
@Test
private void fileData() throws AWTException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
driver.get("https://www.filemail.com/share/upload-file");
//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
driver.findElement(By.xpath("//*[text()='Add Files']")).click();
StringSelection ss = new StringSelection("C:\\Users\\Ashwin\\Pictures\\Screenshots\\absolute xpath.png");
Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
Robot r = new Robot();
r.delay(2000);
r.keyPress(KeyEvent.VK_CONTROL);
r.keyPress(KeyEvent.VK_V);
r.keyRelease(KeyEvent.VK_CONTROL);
r.keyRelease(KeyEvent.VK_V);
r.keyPress(KeyEvent.VK_ENTER);
r.keyPress(KeyEvent.VK_ENTER);

}
}

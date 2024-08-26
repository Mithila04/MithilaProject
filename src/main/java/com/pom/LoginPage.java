package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.xml.LaunchSuite;

 
import com.Mithila.BaseClass;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class LoginPage extends BaseClass{
public WebDriver driver;
 @FindBy (id="nav-link-accountList-nav-line-1")
 private WebElement signInBtn;
 @FindBy  (id="ap_email_login")
 private WebElement emailId;
 @FindBy  (xpath= "//input(@class='a-button-input')")
 private WebElement continueBtn;
 @FindBy  (xpath= "//input(@type='password')")
 private WebElement password;
 @FindBy (id="SignInSUbmit")
 private WebElement signInBtn1;
 @FindBy (xpath= "(//div[@class='a-alert-content')][3]")
 private WebElement emailError;
 @FindBy (xpath= "//div[@class='a-box-inner a-alert-container']")
 private WebElement passError;
 @FindBy (xpath= "//div(@class='a-alert-content')")
 private WebElement emptyEmail;
 @FindBy (xpath= "//*[contains (text(),'Enter your password')])[2]")
 private WebElement emptyPass;
 @FindBy (xpath= "//*[contains (text(),'Enter your password')])[2]")
 private WebElement text;
public LoginPage(WebDriver driver2) {
	this.driver = driver2;
	PageFactory.initElements(driver, this);
}
public boolean validLogin(ExtentTest extenttest) {
	try {
	
launchBrowser("https://www.amazon.in/");
implicitwait(30);
clickButton(signInBtn);
passInput(emailId, "pararasimithila@gmail.com");
clickButton(continueBtn);
passInput(continueBtn,"Mail@1098");
clickButton(signInBtn);
String title = driver.getTitle();
Assert.assertEquals(title,"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
extenttest.log(Status.PASS, "Login Successful");
	} catch (AssertionError e) {
		extenttest.log(Status.FAIL, "Login UnSuccessful" +e.getMessage());
		return false;
	}
return true;
}
public void invalidEmailid() {
launchBrowser("https://www.amazon.in/");
clickButton(signInBtn);
passInput(emailId,"pararasimitla@gmail.com");
clickButton(continueBtn);
Assert.assertEquals(emailError.getText(), "Invalid Email Address");
}
public void validEmailIdInvalidPassword() {
launchBrowser("https://www.amazon.in/");
clickButton(signInBtn);
passInput(emailId, "mpmithila2@gmail.com");
clickButton(continueBtn);
passInput(password,"huhsalkas");
clickButton(signInBtn1);
Assert.assertEquals(emailError.getText(), "Your Password is incorrect");
}
public void emptyEmailid() {
	launchBrowser("https://www.amazon.in/");
	clickButton(signInBtn);
	passInput(emailId, "");
	clickButton(continueBtn);
	Assert.assertEquals(emptyEmail.getText(), "Enter your mobile number or email");
	}

public void validEmailidWithEmptyPassword() {
	launchBrowser("https://www.amazon.in/");
	clickButton(signInBtn);
	passInput(emailId, "mpmithila2@gmail.com");
	clickButton(continueBtn);
	passInput(emptyPass,"");
	clickButton(signInBtn1);
	Assert.assertEquals(emptyPass.getText(), "Enter your password");
	}


}
package com.visitionit.freecrm.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	

	// page layer
	
	// Object Repository
	
	@FindBy(name="username")
	WebElement uname;
	
	@FindBy(name="password")
	WebElement upass;
	
	@FindBy(xpath="//input[@type='submit' or value='Login']")
	WebElement loginBtn;
	
	@FindBy(xpath="//a[text()='Sign Up']")
	WebElement signUpLink;
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public String verifyLoginPageTiltle()
	{
		return driver.getTitle();
	}
	
	public boolean verifyCrmProLogo()
	{
		return driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/a/img")).isDisplayed();
	}
	
	public void verifylogintofreecrm(String username,String userpass)
	{
		uname.sendKeys(username);
		upass.sendKeys(userpass);
		loginBtn.click();
	}
	
	public SignUp navigateToCreateAccountPage()
	{
		try {
			Thread.sleep(5000);
			signUpLink.click();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return new SignUp(driver);
	}

	
}

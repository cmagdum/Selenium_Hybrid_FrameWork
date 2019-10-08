package com.visitionit.freecrm1.pageobject1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {

	// Object Repository
	// Page object model design pattern
	
	@FindBy(name="username")
	WebElement userField;
	
	@FindBy(name="password")
	WebElement passField;
	
	@FindBy(xpath="//input[@value='Login' or @type ='submit']")
	WebElement loginBtn;
	
	@FindBy(xpath="//a[text()='Sign Up']")
	WebElement signUpLink;
	
	WebDriver driver;
	
	public LoginPage1(WebDriver driver)
	{
		this.driver=driver;
		//PageFactory.initElements(driver, LoginPage.class);		
		PageFactory.initElements(driver,this);
		
	}
	
	
	public String verifyLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	
	public boolean verifyCRMPROLogo()
	{
		return driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/a/img")).isDisplayed();
	}
	
	public SignUp1 navigateToCreateAnAccountPage()
	{
		try {
			Thread.sleep(5000);
			
			signUpLink.click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return new SignUp1(driver);
	}
	
	public DashBoardPage verifyloginToCrmPro(String uname, String upass)
	{
		userField.sendKeys(uname);
		passField.sendKeys(upass);
		
		loginBtn.click();
		
		return new DashBoardPage();
		
	}
	
	public void verifyLogoutCrmPro()
	{
		driver.switchTo().frame("mainpanel");
	
		driver.findElement(By.xpath("/html/body/table[1]/tbody/tr[2]/td[1]/div/table/tbody/tr/td[4]/a")).click();
	
		driver.switchTo().defaultContent();
	}
}


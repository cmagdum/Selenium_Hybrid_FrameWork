package com.visitionit.freecrm.pageobject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.visitionit.freecrm.utility.Helper;

public class SignUp {
	
	//  Repository
	
	@FindBy(id="payment_plan_id")
	WebElement selectDD;
	
	@FindBy(name="first_name")
	WebElement firstName;
	
	@FindBy(name="surname")
	WebElement lastName;
	
	@FindBy(name="email")
	WebElement eid;
	
	@FindBy(name="email_confirm")
	WebElement confEid;
	
	@FindBy(name="username")
	WebElement uname;
	
	@FindBy(name="password")
	WebElement upass;
	
	@FindBy(name="passwordconfirm")
	WebElement ConfPass;
	
	@FindBy(xpath="//input[@type='checkbox']")
	WebElement CheckBok;
	
	@FindBy(name="submitButton")
	WebElement SubitmBtn;
	
	WebDriver driver;
	
	public SignUp(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	 public void createAnfreeCrmProAccount(String fname,String lname,String email,String coemail,
			 String unamefield,String upassfield,String conupassfield)
	 {
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		 Helper.selectValueFromDD(selectDD,"Free Edition");
		 firstName.sendKeys(fname);
		 lastName.sendKeys(lname);
		 eid.sendKeys(email);
		 confEid.sendKeys(coemail);
		 uname.sendKeys(unamefield);
		 upass.sendKeys(upassfield);
		 ConfPass.sendKeys(conupassfield);
		 CheckBok.click();
		 SubitmBtn.click();
		 
	 }

}

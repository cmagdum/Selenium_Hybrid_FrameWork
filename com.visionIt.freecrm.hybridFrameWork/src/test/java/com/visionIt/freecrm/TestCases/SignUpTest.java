package com.visionIt.freecrm.TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.visitionit.freecrm.pageobject.LoginPage;
import com.visitionit.freecrm.pageobject.SignUp;
import com.visitionit.freecrm.testbase.BaseClass;

public class SignUpTest extends BaseClass {
	
	LoginPage login;
	
	SignUp signUp;
	
	@BeforeMethod
	public void Setup()
	{
		brName(prop.getProperty("browser"),prop.getProperty("url"));
		login =new LoginPage(driver);
		
		signUp = login.navigateToCreateAccountPage();
	}
	
	@Test
	public void createAnfreeCrmProAccountTest()
	{
		signUp.createAnfreeCrmProAccount("chanda", "magdum", "chandamagdum@gmail.com", "chandamagdum@gmail.com", "cmagdum", "cmagdum#123", "cmagdum#123");
	}
	
	

}

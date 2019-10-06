package com.visionIt.freecrm.TestCases;


import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.visitionit.freecrm.pageobject.LoginPage;
import com.visitionit.freecrm.testbase.BaseClass;

public class LoginTest extends BaseClass{

	public LoginPage login;
	
	@BeforeMethod
	public void setUp()
	{
		brName("Chrome",prop.getProperty("url"));

		login =new LoginPage(driver);
	}

	@Test(priority=1)
	public void verifyLoginPageTiltleTest()
	{
		String expectedTitle="";
		String actualPageTitle = login.verifyLoginPageTiltle();
		System.out.println(actualPageTitle);
		Assert.assertEquals(expectedTitle, actualPageTitle, "Title of the page is not matching ..");
	}
	@Test(priority=2)
	public void verifyPagelogoTest()
	{
		Assert.assertTrue(login.verifyCrmProLogo(),"CRMOPRO logo on login page is not displayed");
	}

	@Test(priority=3)
	public void veryfyLoginToFreeCrmProTest()
	{
		login.verifylogintofreecrm(prop.getProperty("uname"), prop.getProperty("upass"));
	}

	@Test(priority=4)
	public void navigateToCreateAccountPageTest()
	{
		login.navigateToCreateAccountPage();
	}


}

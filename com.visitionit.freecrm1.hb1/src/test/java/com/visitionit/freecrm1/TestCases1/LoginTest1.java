package com.visitionit.freecrm1.TestCases1;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.visitionit.freecrm1.pageobject1.LoginPage1;
import com.visitionit.freecrm1.testbase1.BaseClass1;

public class LoginTest1 {

	public class LoginPageTC extends BaseClass1 {

		LoginPage1 login1;

		@BeforeMethod
		public void setUp() {

			String browserName= excelDataProvider.getStringCellData("login", 1, 0);

			String url= excelDataProvider.getStringCellData(0, 1, 1);

			browserStartUp(browserName, url);

			login1 = new LoginPage1(driver);
		}

		@Test(priority = 1)
		public void verifyLoginPageTitleTest() {
			String actualPageTitle = login1.verifyLoginPageTitle();
			System.out.println(actualPageTitle);
			Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", actualPageTitle, "Title of the page is not matching ..");
		}

		@Test(priority = 2)
		public void verifyCRMPROLogoTest() {
			Assert.assertTrue(login1.verifyCRMPROLogo(), "CRMOPRO logo on login page is not displayed");
		}

		@Test(priority = 3)
		public void navigateToCreateAnAccountPageTest() {
			login1.navigateToCreateAnAccountPage();

		}


		@Test(priority = 4) 
		public void verifyloginToCrmProTest() {

		String username= excelDataProvider.getStringCellData("login", 1, 2);

		String userpwd= excelDataProvider.getStringCellData(0, 1, 3);

		login1.verifyloginToCrmPro(username,userpwd);

		if(driver.getTitle().contains("CRMPRO")) {

		Assert.assertTrue(true);

		login1.verifyLogoutCrmPro(); } else {

		System.out.println("Not able to login into an application"); }

		}



	}

}

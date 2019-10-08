package com.visitionit.freecrm1.testbase1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeSuite;

import com.visitionit.freecrm1.utility1.ExcelDataProvider;

public class BaseClass1 {
	
	public static WebDriver driver;

	public ExcelDataProvider excelDataProvider;


	@BeforeSuite
	public void intitialize() {

		excelDataProvider = new ExcelDataProvider();
	}

	public static void browserStartUp(String brName, String url) {

		if (brName.equals("Firefox")) {

			System.setProperty("webdriver.gecko.driver", "");

			driver = new FirefoxDriver();
		} else if (brName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "F:\\Library\\chromedriver_win32 (1)\\chromedriver.exe");

			driver = new ChromeDriver();

		} else if (brName.equals("IE")) {
			System.setProperty("webdriver.ie.driver", "");

			driver = new InternetExplorerDriver();
		} else {
			System.out.println("Driver exe not able to found and hence IllegleStaeException");
		}

		driver.manage().window().maximize();

		driver.get(url);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

}

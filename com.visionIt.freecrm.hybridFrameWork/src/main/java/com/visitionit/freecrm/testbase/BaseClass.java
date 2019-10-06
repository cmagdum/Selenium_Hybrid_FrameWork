package com.visitionit.freecrm.testbase;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BaseClass {

	public static WebDriver driver;
	
	public static Properties prop;
	
	public BaseClass()
	{

		try
		{
			File fs=new File(".//Config//prop.properties");
			FileInputStream fis=new FileInputStream(fs);
			prop = new Properties();
			prop.load(fis);

		}

		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	public static void brName(String BrowserName, String url)
	{
		if(BrowserName.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","F:\\Library\\geckodriver-v0.24.0-win64\\geckodriver.exe");

			driver=new FirefoxDriver();
		}
		else if(BrowserName.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","F:\\Library\\chromedriver_win32 (1)\\chromedriver.exe");

			driver=new ChromeDriver();
		}

		else
		{
			System.out.println("driver not able to find");
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

}



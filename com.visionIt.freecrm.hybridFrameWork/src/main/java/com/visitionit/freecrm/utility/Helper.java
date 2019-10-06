package com.visitionit.freecrm.utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Helper {
	
	public static void selectValueFromDD(WebElement ddEle, String ddValue)
	{
		Select sel =new Select(ddEle);
		
		sel.selectByVisibleText(ddValue);
	}
   
}

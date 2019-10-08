package com.visitionit.freecrm1.utility1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Helper1 {
	
	public static void selectValueFromDD(WebElement ddEle, String ddValue)
	{
		Select sel =new Select(ddEle);
		
		sel.selectByVisibleText(ddValue);
	}

}

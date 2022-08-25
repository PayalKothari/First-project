package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitUtility {
	
	//why-----to apply waits
	//input----webelement
	//output----null
	
	public void waitForElement(WebElement element, WebDriver driver, long timeInSec){
		WebDriverWait wait = new WebDriverWait(driver, timeInSec);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	
	@Test
	public void test(){
		
	}
}

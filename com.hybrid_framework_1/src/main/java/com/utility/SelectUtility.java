package com.utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectUtility {
	
	public void selectbyText(String text , WebElement element){
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}

}

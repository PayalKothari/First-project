package com.utility;

import com.base.BaseClass;

public class DriverUtility extends BaseClass{
	
	public void switchToFrameById(int id){
		driver.switchTo().frame(id);
	}
	public void switchToFrameByIndex(int index){
		driver.switchTo().frame(index);
	}
	public void switchToFrameByElement(int element){
		driver.switchTo().frame(element);
	}
	public void switchToWindow(String id){
		driver.switchTo().window(id);
	}
}

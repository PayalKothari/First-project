package com.listener;

import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;

public class ListenerEx implements ITestListener{

	private Logger log = Logger.getLogger(Listeners.class);


	public void onTestFailure(ITestResult result) {
		
		log.info("TestCase failure with name :" + result.getName() );

	}

	public void onTestSkipped(ITestResult result) {
		log.info("TestCase skipped with name :" + result.getName() );

		
	}

	public void onTestStart(ITestResult result) {
		log.info("TestCase started with name :" + result.getName() );
		
	}

	public void onTestSuccess(ITestResult result) {
		
		log.info("TestCase passed with name :" + result.getName() );

	}

	
	public void onFinish(ITestContext result) {

		
	}

	public void onStart(ITestContext result) {
		
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}
}

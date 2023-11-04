package com.testng.demos;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryDemo implements IRetryAnalyzer{

	int retry =0;
	public static int maxTry=2;
	
	@Override
	public boolean retry(ITestResult result) {
	
		if(retry<=maxTry) {
			retry++;
			return true;
		}
		
		return false;
	}
 
}

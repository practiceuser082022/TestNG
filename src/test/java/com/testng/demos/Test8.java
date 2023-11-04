package com.testng.demos;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(SuiteListenerDemo.class)
public class Test8 {
	
  @Test(retryAnalyzer =RetryDemo.class )
  public void login() {
	 
	  System.out.println("login");
	
	
  }
 
}

package com.testng.demos;

import org.testng.annotations.Test;


public class Test7 {
	
  @Test(retryAnalyzer =RetryDemo.class )
  public void login() {
	 
	  System.out.println("login");
	
	
  }
 
}

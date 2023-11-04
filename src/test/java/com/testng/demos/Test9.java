package com.testng.demos;

import org.testng.annotations.Test;

public class Test9 {

	 @Test(dataProvider = "testData",dataProviderClass = Test1.class,groups="sanity")
	  public void login(Integer n, String s) {
		  
		  System.out.println("n value "+n);
		  System.out.println("s value "+s);
		  
	  }
}

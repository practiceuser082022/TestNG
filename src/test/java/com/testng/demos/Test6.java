package com.testng.demos;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Test6 {
	
  @Parameters({"username","password"})
  @Test
  public void login(@Optional("admin") String userName,@Optional("admin") String pwd) {
	  
	  System.out.println("User name is "+userName);
	  System.out.println("Password is "+pwd);
	
  }
  
  @Parameters({"browser"})
  @Test
  public void login(@Optional("chrome") String browserName) {
	  
	  System.out.println("browser name is "+browserName);
	 
	
  }
 
}

package com.testng.demos;

import org.testng.annotations.Test;


public class Test10 {
	
	
  @Test(description = "login with admin")
  public void login1() {
	
	  System.out.println("Login 1");
  }
  
  @Test(enabled = false)
  public void login2() {
	
	  System.out.println("Login 2");
  }
}

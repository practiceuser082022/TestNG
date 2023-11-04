package com.testng.demos;

import org.testng.annotations.Test;


public class Test11 {
	
	
  @Test(groups="sanity")
  public void login1() {
	
	  System.out.println("Login 1");
  }
  
  @Test(groups="regression")
  public void login2() {
	
	  System.out.println("Login 2");
  }
  
  @Test(dependsOnGroups = {"sanity"})
  public void login3() {
	
	  System.out.println("Login 3");
  }
  
  @Test(dependsOnMethods = {"login2"})
  public void login4() {
	
	  System.out.println("Login 4");
  }
}

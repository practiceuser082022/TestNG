package com.testng.demos;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test3 {
	
	
  @Test
  public void login() {
	  
	  int ec=10;
	  int ac=11;
	  
	  Assert.assertEquals(ac, ec);
	  
	  System.out.println("End of Test Case");
  }
  
  
  @Test
  public void loginSoftAssert() {
	  
	  int ec=10;
	  int ac=11;
	  
	 SoftAssert sa=new SoftAssert();
	 
	 sa.assertEquals(ac, ec);
	 
	 sa.assertTrue(false);
	 
	 sa.assertAll();
	  
	  System.out.println("End of Test Case");
  }
}

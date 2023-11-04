package com.testng.demos;

import org.testng.annotations.Test;


public class Test15 {
	
	@Test(expectedExceptions = ArithmeticException.class)
	public void doLogin() throws InterruptedException {
	
		//int c=10/0;
		
		String s=null;
		s.length();
				
	}
	
}

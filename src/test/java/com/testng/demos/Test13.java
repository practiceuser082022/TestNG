package com.testng.demos;

import org.testng.annotations.Test;


public class Test13 {
	
	@Test(invocationCount = 3 )
	public void doLogin() {
		System.out.println("Login");
	}
	
}

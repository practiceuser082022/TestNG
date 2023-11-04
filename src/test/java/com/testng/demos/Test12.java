package com.testng.demos;

import org.testng.annotations.Test;


public class Test12 {
	@Test(priority =1 )
	public void doLogin() {
		System.out.println("Login");
	}
	@Test(priority = 3)
	public void doLogout() {
		System.out.println("Logout");
	}
	@Test(priority = 2)
	public void doUserCreate() {
		System.out.println("Create");
	}
}

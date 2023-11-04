package com.testng.demos;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class SuiteListenerDemo implements ISuiteListener{

	
	 public void onStart(ISuite suite) {
		 
		 System.out.println("Suite execution starts ....");
	  
	  }

	 public void onFinish(ISuite suite) {
	   
		 System.out.println("Suite execution end ....");
	  }
}

package org.newframe;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class SampleTest {
	
	@BeforeClass
	private void beforeClass() {
System.out.println("Before Class");
		
	}
	
	@BeforeMethod
	private void beforeMethod() {

		System.out.println("Before Method");
	}
	@Test
	private void tc01() {
		
		System.out.println("Method 1");
	}
	
	@Test
	private void tc02() {
		System.out.println("Method 2");
	}
	
	@Test
	private void tc03() {
	    System.out.println("Method 3");

	}
	
	@AfterMethod
	private void tc04() {
		System.out.println("AfterMethod.ds");

	}
	
	@AfterClass
	private void tc05() {
		System.out.println("After Class");
	}
	
	
	
	
	
	

	
	
	
	
}

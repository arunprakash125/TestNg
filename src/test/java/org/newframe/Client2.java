package org.newframe;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


public class Client2 {


	@Test
	public void test() {
		System.out.println("start.........");
		Assert.assertTrue("verify username", true);
		Assert.assertTrue("verify password", false);
		Assert.assertTrue("verify button", true);
		Assert.assertTrue("verify password", false);
		System.out.println("end.........");
		
	}
	@Ignore
	
	@Test
	public void test2() {
		System.out.println("test2.........");

	}

}

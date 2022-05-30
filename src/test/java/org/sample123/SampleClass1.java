package org.sample123;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SampleClass1 {
	
 @Test
 private void tc01() {
	String s = "abc";
	SoftAssert assert1 = new SoftAssert();
	Assert.assertEquals(s, "abc"); 
	System.out.println("hi");
	System.out.println("hello");
	System.out.println("welcome");

}
 @Test
 private void tc02() {
	System.out.println("Method 2");
}
}

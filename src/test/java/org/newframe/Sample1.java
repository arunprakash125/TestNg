package org.newframe;

import org.junit.Test;
import org.testng.annotations.Parameters;

public class Sample1 {
	
	@Parameters( {"username" , "password"}  )

	@Test
	private void tc01(String s , String s1) {
		System.out.println(s);
		System.out.println(s1);
	}
	@Parameters ({"password"})
	@Test
	private void tco2(String s) {
		System.out.println(s);

	}
	@Test
	private void tco3() {
		System.out.println("Method 3");

	}
	
	
}

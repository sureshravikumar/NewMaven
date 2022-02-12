package org.frame4;

import org.testng.annotations.Test;

public class TestNg2 {
	@Test(priority = -20)
	private void tc2() {
		System.out.println("Test 2");
	}

	@Test(priority = 0)
	private void tc3() {
		System.out.println("Test 3");
	}

	@Test
	private void tc5() {
		System.out.println("Test 5");
	}

	@Test(priority = 4, enabled = false)
	private void tc4() {
		System.out.println("Test 4");
	}

	@Test(priority = 3, invocationCount = 4)
	private void tc1() {
		System.out.println("Test 1");
	}
}

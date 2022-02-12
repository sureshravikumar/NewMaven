package org.frame4;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNg10 {
	@Test
	private void tc1() {
		System.out.println("TC1");
	}

	@Test(retryAnalyzer=TestNg11Retry.class)
	private void tc2() {
		System.out.println("TC2");
		Assert.assertTrue(false);
	}

	@Test(retryAnalyzer=TestNg11Retry.class)
	private void tc11() {
		System.out.println("TC11");
		Assert.assertTrue(false);
	}

	@Test(retryAnalyzer=TestNg11Retry.class)
	private void tc22() {
		System.out.println("TC22");
	}
}

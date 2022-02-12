package org.frame4;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNg12 {
	@Test
	private void tc13() {
		System.out.println("TC1");
	}

	@Test
	private void tc23() {
		System.out.println("TC2");
		Assert.assertTrue(false);
	}

	@Test
	private void tc33() {
		System.out.println("TC11");
		Assert.assertTrue(false);
	}

	@Test
	private void tc43() {
		System.out.println("TC22");
	}
}

package org.frame4;

import org.testng.annotations.Test;

public class TestNg9 {
	@Test(groups = "smoke")
	private void tc1() {
		System.out.println("TC1");
	}

	@Test(groups = "sanity")
	private void tc2() {
		System.out.println("TC2");
	}

	@Test(groups = "regression")
	private void tc11() {
		System.out.println("TC11");
	}

	@Test(groups = "spiral")
	private void tc22() {
		System.out.println("TC22");
	}

	@Test(groups = { "smoke", "sanity" })
	private void tc33() {
		System.out.println("TC33");
	}

	@Test(groups = { "sanity", "spiral" })
	private void tc44() {
		System.out.println("TC44");
	}

	@Test(groups = { "spiral", "regression" })
	private void tc55() {
		System.out.println("TC55");
	}
}

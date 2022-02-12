package org.frame4;

import org.testng.annotations.Test;

public class TestNg14 {
	@Test
	private void tc11() {
		System.out.println("TC11 " + Thread.currentThread().getId());
	}

	@Test
	private void tc2() {
		System.out.println("TC2 " + Thread.currentThread().getId());
	}

	@Test
	private void tc3() {
		System.out.println("TC3 " + Thread.currentThread().getId());
	}

	@Test
	private void tc13() {
		System.out.println("TC13 " + Thread.currentThread().getId());
	}
}

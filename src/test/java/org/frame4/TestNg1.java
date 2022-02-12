package org.frame4;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg1 {
	@BeforeMethod
	private void startTime() {
		System.out.println("Test Case Started...");
	}

	@BeforeClass
	private void start() {
		System.out.println("Execution Started.....");
	}

	@AfterMethod
	private void endTime() {
		System.out.println("Test Case Ended...");
	}

	@AfterClass
	private void end() {
		System.out.println("Execution Ended.....");
	}

	@Test
	private void tc2() {
		System.out.println("Test 2");
	}

	@Test
	private void tc3() {
		System.out.println("Test 3");
	}

	@Test
	private void tc4() {
		System.out.println("Test 4");
	}

	@Test
	private void tc1() {
		System.out.println("Test 1");
	}
}

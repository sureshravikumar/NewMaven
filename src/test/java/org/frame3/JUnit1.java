package org.frame3;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JUnit1 {
	@Test
	public void test3() {
		System.out.println("Test 3");
	}

	@Test
	public void test1() {
		System.out.println("Test 1");
	}

	@Ignore
	@Test
	public void test2() {
		System.out.println("Test2");
	}

	@Before
	public void bef() {
		System.out.println("Test Case Started...");
	}

	@After
	public void aft() {
		System.out.println("Test Case Ended...");
	}

	@BeforeClass
	public static void befCls() {
		System.out.println("Started.....");
	}

	@AfterClass
	public static void aftCls() {
		System.out.println("Ended.....");
	}
}

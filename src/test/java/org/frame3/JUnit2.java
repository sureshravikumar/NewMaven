package org.frame3;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JUnit2 {
	public static WebDriver driver;

	@Test
	public void test3() {
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("Java");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("89890739");
		System.out.println("Done");
	}

	@Test
	public void test1() {
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}

	@Test
	public void test2() {
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("Java");
		Assert.assertTrue("Email Mismatch", user.getAttribute("value").equals("Sele"));
	}

	@Before
	public void bef() {
		Date d = new Date();
		System.out.println(d);
		System.out.println("Test Case Started...");
	}

	@After
	public void aft() {
		Date d = new Date();
		System.out.println(d);
		System.out.println("Test Case Ended...");
	}

	@BeforeClass
	public static void befCls() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println("Started.....");
	}

	@AfterClass
	public static void aftCls() {
		driver.quit();
		System.out.println("Ended.....");
	}
}

package org.frame4;

import org.frame1.BaseClass;
import org.frame2.Pom1;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNg6 extends BaseClass {

	public SoftAssert s;

	@BeforeClass
	private void openBrowser() {
		chromeBrowser();
		launchUrl("https://www.facebook.com/");
	}

	@Test
	private void tc3() {
		Pom1 p = new Pom1();
		s = new SoftAssert();
		WebElement usename = p.getTxtUser();
		fillTextBox(usename, "Greeens");
		s.assertEquals(usename.getAttribute("value"), "Greeens");
		WebElement passwd = p.getTxtPass();
		fillTextBox(passwd, "1543526467");
		s.assertEquals(passwd.getAttribute("value"), "1543526467");
		s.assertAll();
	}

	@Test
	private void tc1() {
		s = new SoftAssert();
		String tite = driver.getTitle();
		s.assertTrue(tite.contains("facebook"), "verify title");
		String ul = driver.getCurrentUrl();
		System.out.println(ul);
		s.assertAll();
	}

	@AfterClass
	private void closeBrowser() {
		driver.quit();
	}
}

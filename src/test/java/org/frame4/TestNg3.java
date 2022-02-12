package org.frame4;

import org.frame1.BaseClass;
import org.frame2.Pom1;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNg3 extends BaseClass {
	@BeforeClass
	private void openBrowser() {
		chromeBrowser();
		launchUrl("https://www.facebook.com/");
	}

	@Test
	private void tc3() {
		Pom1 p = new Pom1();
		WebElement uname = p.getTxtUser();
		fillTextBox(uname, "Greeens");
		WebElement passwd = p.getTxtPass();
		fillTextBox(passwd, "1543526467");
	}

	@Test
	private void tc1() {
		pageTitle();
		pageUrl();
	}

	@AfterClass
	private void closeBrowser() {
		driver.quit();
	}
}

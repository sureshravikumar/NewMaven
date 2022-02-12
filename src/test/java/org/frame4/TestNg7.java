package org.frame4;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.frame1.BaseClass;
import org.frame2.Pom1;
import org.openqa.selenium.WebElement;

public class TestNg7 extends BaseClass {

	@BeforeClass
	private void openBrowser() {
		chromeBrowser();
		launchUrl("https://www.facebook.com/");
	}

	@Parameters({ "Username", "password" })
	@Test
	private void tc1(@Optional("Selenium") String user, @Optional("54654465") String pass) {
		Pom1 p = new Pom1();
		WebElement usename = p.getTxtUser();
		fillTextBox(usename, user);
		WebElement passwd = p.getTxtPass();
		fillTextBox(passwd, pass);
	}

	@AfterClass
	private void closeBrowser() {
		driver.quit();
	}

	// when select para.xml and run. output will be xml data when data not matched
	// display optional value --- 1
	// when select TestNg7.java and run. output will be optional value -- 2
}

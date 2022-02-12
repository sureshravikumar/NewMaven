package org.frame4;

import org.frame1.BaseClass;
import org.frame2.Pom1;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

public class TestNg8 extends BaseClass {
	@BeforeClass
	private void openBrowser() {
		chromeBrowser();
		launchUrl("https://www.facebook.com/");
	}

	@Test(dataProvider = "sampledata")
	private void tc1(@Optional("Selenium") String user, @Optional("54654465") String pass) {
		Pom1 p = new Pom1();
		WebElement usename = p.getTxtUser();
		fillTextBox(usename, user);
		WebElement passwd = p.getTxtPass();
		fillTextBox(passwd, pass);
		driver.navigate().refresh();
	}

	@AfterClass
	private void closeBrowser() {
		driver.quit();
	}

	@DataProvider(name = "sampledata")
	public Object[][] data() {
		return new Object[][] { { "Java", "Java@123" }, { "Selenium", "Selenium@123" },
				{ "Software", "Software@123" } };

	}

	// when @DataProvider(name = "sampledata") annotation in small class, we only
	// use @Test(dataProvider = "sampledata") in the @Test annotation
	// when @DataProvider(name = "sampledata") annotation in different class, we use
	// @Test(dataProviderClass = "sampledata") in the @Test annotation
}

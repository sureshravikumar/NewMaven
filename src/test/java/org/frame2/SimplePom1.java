package org.frame2;

import org.frame1.BaseClass;
import org.openqa.selenium.WebElement;

public class SimplePom1 extends BaseClass {
	public static void main(String[] args) {
		chromeBrowser();
		launchUrl("https://www.facebook.com/");
		Pom1 p = new Pom1();
		WebElement user = p.getTxtUser();
		fillTextBox(user, "Java");
		WebElement pass = p.getTxtPass();
		fillTextBox(pass, "12345678");
		driver.navigate().refresh();
		fillTextBox(user, "Selenium");
	}
}

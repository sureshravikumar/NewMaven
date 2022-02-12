package org.frame2;

import org.frame1.BaseClass;
import org.openqa.selenium.WebElement;

public class SimplePom2 extends BaseClass {
	public static void main(String[] args) {
		chromeBrowser();
		launchUrl("https://www.facebook.com/");
		Pom2 p = new Pom2();
		WebElement user = p.getTxtUser();
		fillTextBox(user, "Hello");
		WebElement pass = p.getTxtPass();
		fillTextBox(pass, "785765758");
	}
}

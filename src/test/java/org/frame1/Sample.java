package org.frame1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Sample extends BaseClass {
	public static void main(String[] args) {
		chromeBrowser();
		launchUrl("https://www.facebook.com/");
		WebElement uname = driver.findElement(By.id("email"));
		fillTextBox(uname, "Tech@123");
		WebElement password = driver.findElement(By.id("pass"));
		fillTextBox(password, "12345678");
		pageTitle();
		pageUrl();
		WebElement login = driver.findElement(By.name("login"));
		btnClick(login);
	}
}

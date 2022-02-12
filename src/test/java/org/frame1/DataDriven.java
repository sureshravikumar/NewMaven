package org.frame1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DataDriven extends BaseClass {
	public static void main(String[] args) throws IOException {
		chromeBrowser();
		launchUrl("https://www.facebook.com/");
		WebElement uname = driver.findElement(By.id("email"));
		fillTextBox(uname, readExcel(0, 0));
		WebElement pass = driver.findElement(By.id("pass"));
		fillTextBox(pass, readExcel(0, 1));

	}
}

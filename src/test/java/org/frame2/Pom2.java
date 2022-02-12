package org.frame2;

import org.frame1.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Pom2 extends BaseClass {
	public Pom2() {
		PageFactory.initElements(driver, this);
	}

	@FindBys({ @FindBy(id = "email"), @FindBy(xpath = "//input[@type='text']") })
	private WebElement txtUser;
	@FindAll({ @FindBy(id = "pass"), @FindBy(name = "password") })
	private WebElement txtPass;

	public WebElement getTxtUser() {
		return txtUser;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}
}

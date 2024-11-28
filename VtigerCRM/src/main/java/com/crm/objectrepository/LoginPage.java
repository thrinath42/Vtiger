package com.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(xpath="//input[@name='user_name']")
	private WebElement userName;
	
	
	@FindBy(xpath="//input[@name='user_password']")
	private WebElement password;
	
	@FindBy(id="submitButton")
	private WebElement login;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
		public WebElement getUserName() {
			return userName;
		}

		public WebElement getPassword() {
			return password;
		}

		public WebElement getLogin() {
			return login;
		}
		
		
		
	

	

}

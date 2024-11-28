package com.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Organization {
	@FindBy(xpath = "//img[@title='Create Organization...']")
	 private  WebElement createorganizationlink;
		
		@FindBy(xpath = "//img[@title='Search in Organizations...']")
		private WebElement searchorganizationlink;
		
		public Organization(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		}

		public WebElement getCreateorganizationlink() {
			return createorganizationlink;
		}

		public WebElement getSearchorganizationlink() {
			return searchorganizationlink;
		}
		
	}



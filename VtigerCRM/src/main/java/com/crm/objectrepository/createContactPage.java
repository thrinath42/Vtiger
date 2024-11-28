package com.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createContactPage {
	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement lastName;
	
	@FindBy(xpath = "(//input[@name='button'])[1]")
	private WebElement saveButton;
	
	@FindBy(xpath = "//span[@class='dvHeaderText']")
	private WebElement heading;
	
	@FindBy(xpath = "//tr[@class='lvtColData']")
	private WebElement organization;
	
	@FindBy(xpath = "//img[@title='Select']")
	private WebElement organizationButton;
	
	
	public createContactPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getHeading() {
		return heading;
	}

	public WebElement getOrganization() {
		return organization;
	}

	public WebElement getOrganizationButton() {
		return organizationButton;
	}
	
	
	
	
	
}

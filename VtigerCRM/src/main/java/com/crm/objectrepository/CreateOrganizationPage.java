package com.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrganizationPage {
	@FindBy(name = "accountname")
	private WebElement organizationnamelink;
	
	@FindBy(xpath = "//select[@name='industry']")
	private WebElement industrydropdown;
	
	@FindBy(name = "accounttype")
	private WebElement typedropdown;
	
	@FindBy(xpath = "(//input[@name='button'])[1]")
	private WebElement saveButton;
	
	@FindBy(xpath ="//span[@class=\"lvtHeaderText\"]")
	private WebElement heading;
	
	public CreateOrganizationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getOrganizationnamelink() {
		return organizationnamelink;
	}

	public WebElement getIndustrydropdown() {
		return industrydropdown;
	}

	public WebElement getTypedropdown() {
		return typedropdown;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getHeading() {
		return heading;
	}
	
	
	


}

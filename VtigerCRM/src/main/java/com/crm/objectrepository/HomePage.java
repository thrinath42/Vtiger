package com.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(partialLinkText = "Calendar")
	private WebElement calender;
	
	@FindBy(partialLinkText = "Leads")
	private WebElement leads;
	
	@FindBy(partialLinkText = "Organizations")
	private WebElement Organiztion;
	
	@FindBy(partialLinkText = "Contacts")
	private WebElement contacts;
	
	@FindBy(partialLinkText = "Opportunities")
	private WebElement opportunties;
	
	@FindBy(partialLinkText = "Products")
	private WebElement Products;
	
	@FindBy(partialLinkText = "Documents")
	private WebElement Documents;
	
	@FindBy(partialLinkText = "Email")
	private WebElement Email;
	
	@FindBy(partialLinkText = "Trouble Tickets")
	private WebElement TroubleTickets;
	
	@FindBy(partialLinkText = "Dashboard")
	private WebElement Dashboard;
	
	@FindBy(partialLinkText = "More")
	private WebElement More;
	
	@FindBy(xpath = "(//td[@class='small'])[2]")
	private WebElement administrator;
	
	@FindBy(partialLinkText = "Sign Out")
	private WebElement signOut;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	
	
		
		
	}

	public WebElement getCalender() {
		return calender;
	}

	public WebElement getLeads() {
		return leads;
	}

	public WebElement getOrganiztion() {
		return Organiztion;
	}

	public WebElement getContacts() {
		return contacts;
	}

	public WebElement getOpportunties() {
		return opportunties;
	}

	public WebElement getProducts() {
		return Products;
	}

	public WebElement getDocuments() {
		return Documents;
	}

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getTroubleTickets() {
		return TroubleTickets;
	}

	public WebElement getDashboard() {
		return Dashboard;
	}

	public WebElement getMore() {
		return More;
	}

	public WebElement getAdministrator() {
		return administrator;
	}

	public WebElement getSignOut() {
		return signOut;
	}
}

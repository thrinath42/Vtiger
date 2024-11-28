package com.crm.contacts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.crm.genericutility.BaseClass;
import com.crm.genericutility.ListenerUtility;
import com.crm.objectrepository.ContactPage;
import com.crm.objectrepository.createContactPage;

@Listeners(ListenerUtility.class)
public class TC_VT_003_Test extends BaseClass {
	@Test
	public void createContactWithOrg() throws EncryptedDocumentException, IOException, InterruptedException {
		hp.getContacts().click();

		Assert.assertEquals(driver.getTitle(), eUtil.getStringDataFromExcel("Sheet2", 1, 0), "contacts not loaded");
		test.log(Status.PASS, "contacts page is displayed");

		ContactPage cp = new ContactPage(driver);
		cp.getCreateContact().click();

		createContactPage con = new createContactPage(driver);
		con.getLastName().sendKeys(eUtil.getStringDataFromExcel("Sheet2", 1, 1));
		con.getOrganizationButton().click();
		wUtil.switchToWindow(driver, "Accounts&action");
		driver.findElement(By.xpath("//a[contains(text(),'Flipkart')]")).click();
		wUtil.switchToWindow(driver, "Contacts&action");
		con.getSaveButton().click();

		Assert.assertTrue(con.getHeading().getText().contains(eUtil.getStringDataFromExcel("Sheet2", 1, 1)),
				"contact not created");
		test.log(Status.PASS, "contact created");

	}
}

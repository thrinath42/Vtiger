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
import com.crm.genericutility.WebDriverUtility;
import com.crm.objectrepository.ContactPage;
import com.crm.objectrepository.createContactPage;

@Listeners(ListenerUtility.class)
public class TC_VT_001_Test extends BaseClass {
	@Test(groups ="smoke")
	public void clickContactModule() throws InterruptedException, EncryptedDocumentException, IOException{
		hp.getContacts().click();
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(),eUtil.getStringDataFromExcel("Sheet2", 1, 0) , "contacts not loaded");
		test.log(Status.PASS, "contacts page is displayed");
		
		
		ContactPage cp=new ContactPage(driver);
		cp.getCreateContact().click();
		
		createContactPage con=new createContactPage(driver);
		con.getLastName().sendKeys(eUtil.getStringDataFromExcel("Sheet2", 1, 1));
		con.getSaveButton().click();
		
		Assert.assertTrue(con.getHeading().getText().contains(eUtil.getStringDataFromExcel("Sheet2", 1, 1)), "contact not created");
		test.log(Status.PASS, "contact created");
		
		
		
	}
}

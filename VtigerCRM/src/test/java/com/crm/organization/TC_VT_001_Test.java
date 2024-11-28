package com.crm.organization;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.crm.genericutility.BaseClass;
import com.crm.genericutility.ListenerUtility;
@Listeners(ListenerUtility.class)
public class TC_VT_001_Test extends BaseClass {
	
	@Test(groups="smoke")
	public void clickOrganization() throws EncryptedDocumentException, IOException {
		hp.getOrganiztion().click();
		Assert.assertEquals(driver.getTitle(),eUtil.getStringDataFromExcel("Sheet2", 2, 0) , "Organization page not loaded");
		test.log(Status.PASS, "Organization Page loaded");   
	}

}

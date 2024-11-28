package com.crm.organization;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.crm.genericutility.BaseClass;
import com.crm.genericutility.ListenerUtility;

@Listeners(ListenerUtility.class)
public class TC_VT_003_Test extends BaseClass {

	@Test
	public void createOrgWithIndustry() throws EncryptedDocumentException, IOException {
		hp.getOrganiztion().click();

		org.getCreateorganizationlink().click();
		Assert.assertTrue(co.getHeading().isDisplayed(), "create org page not displayed");
		test.log(Status.PASS, "create org page displayed");

		co.getOrganizationnamelink().sendKeys(eUtil.getStringDataFromExcel("Sheet3", 1, 0) + jUtil.getRandomNumber());

		wUtil.selectDropdownByVisibleText(co.getIndustryDropdown(), eUtil.getStringDataFromExcel("Sheet3", 3, 1));

		co.getSaveButton().click();
		
		WebElement title = driver.findElement(By.xpath("//span[@class='dvHeaderText']"));
		Assert.assertEquals(co.getIndustryField().getText(), eUtil.getStringDataFromExcel("Sheet3", 3, 1));
		test.log(Status.PASS, "industry selected");
		
		Assert.assertTrue(title.getText().contains(eUtil.getStringDataFromExcel("Sheet3", 1, 0)),"organization not created");
		test.log(Status.PASS, "organization created with industry===>" +eUtil.getStringDataFromExcel("Sheet3", 3, 1));
	}

}

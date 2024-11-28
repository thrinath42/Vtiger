package com.crm.organization;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.crm.genericutility.BaseClass;
import com.crm.genericutility.ListenerUtility;

@Listeners(ListenerUtility.class)
public class TC_VT_002_Test extends BaseClass {
	
	@Test(groups="smoke")
	public void createOrganization() throws EncryptedDocumentException, IOException {
		hp.getOrganiztion().click();
		org.getCreateorganizationlink().click();
		Assert.assertTrue(co.getHeading().isDisplayed(), "create org page not displayed");
		test.log(Status.PASS, "create org page displayed");
		
		co.getOrganizationnamelink().sendKeys(eUtil.getStringDataFromExcel("Sheet3", 1, 0)+jUtil.getRandomNumber());
		co.getSaveButton().click();
		WebElement title = driver.findElement(By.xpath("//span[@class='dvHeaderText']"));
		System.out.println(title.getText());
		Assert.assertTrue(title.getText().contains(eUtil.getStringDataFromExcel("Sheet3", 1, 0)), "organization not created");
		test.log(Status.PASS, "organization created");
	}}

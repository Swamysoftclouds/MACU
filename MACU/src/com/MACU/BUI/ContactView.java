package com.MACU.BUI;


import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class ContactView extends ContactView_POM{
	@BeforeClass
	public void testSignIn() throws Exception {
		try {
			openBrowser();
			signIntoBUI();
			
		} catch (Exception e) {
			log.error("Login/SignIn un-successfull");
			e.printStackTrace();
			throw e;
		}
	}
	@Test (priority = 1, groups = {"Sanity","Regression"}, description = "Navigate To Contact")
	public void testNavigateToContacts() throws Exception {
		try {
			hardWait(15);
			click(byNavigationButtonID);
			click(byClickContactsXpath);
			click(byClickContactsSubXpath);			
			hardWait(10);			
		} catch (Exception e) {
			log.error("Navigate To Contact Test is un-successfull");
			e.printStackTrace();
			throw e;
		}
	}
	@Test (priority = 2, groups = {"Sanity","Regression"}, description = "Contact View")
	public void testContactView() throws Exception {
		try {	
			    enterText(byEnterLoginDetailsXpath,bygetlogin_id);
			    click(byClickSearchButtonXpath);
			    hardWait(10);
			    Actions a=new Actions(driver);
			    
			    WebElement ContactID=driver.findElement(By.xpath("//span[text()='155740']"));
			  
			    a.doubleClick(ContactID).build().perform();
			    hardWait(1);
			    click(byClickSummaryButtonXpath);
			    hardWait(1);
			    click(byContactWindowCloseXpath);
			    hardWait(1);
			    click(byContactCloseXpath);
			} catch (Exception e) {
			log.error("Contact View Test is un-successfull");
			e.printStackTrace();
			throw e;
		}
	}
	
	@AfterClass
	public void testSignout() throws Exception {
		try {
			
			hardWait(1);
			click(byClickUserProfileXpath);
			hardWait(1);
			click(byClickUserProfileSignOutXpath);
			hardWait(1);
		 closeCurrentBrowser();
			} catch (Exception e) {
			log.error("Logout/SignOut un-successfull");
			e.printStackTrace();
			throw e;
		}
	}
}

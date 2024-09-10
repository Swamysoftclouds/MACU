package com.MACU.BUI;

import org.openqa.selenium.By;

import com.MACU.framework.BaseClass;

public class ContactView_POM extends BaseClass{


//MACU_BUI
// testNavigateToContacts
	    public static By byNavigationButtonID                 = By.id("navigationSetBtn");
		public static By byClickContactsXpath                 = By.xpath("//div[text()='Contacts']");
		public static By byClickContactsSubXpath              = By.xpath("(//span[text()='Contacts'])[2]");
		
// testContactView		
		public static By byClickSearchButtonXpath             = By.xpath("//span[text()='Search']");
		public static By byClickSummaryButtonXpath            = By.xpath("//span[text()='Summary']");
		public static By byEnterLoginDetailsXpath             = By.xpath("(//label[text()='Login']//following::input)[1]");
		public static By byContactWindowCloseXpath            = By.xpath("(//div[@class='primary-tab-header']//ul//li)[2]//span//a//i");
		public static By byContactCloseXpath                  = By.xpath("//a[@class='closeButton']");
		
		
// Sign Out, close Browser
		public static By byClickUserProfileXpath              = By.xpath("//body//oj-avatar[@initials='[[userMenuLabel]]']");
		public static By byClickUserProfileSignOutXpath       = By.xpath("//a//span[text()='Sign Out']");
	}
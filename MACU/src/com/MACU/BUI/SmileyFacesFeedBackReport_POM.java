package com.MACU.BUI;

import org.openqa.selenium.By;

import com.MACU.framework.BaseClass;

public class SmileyFacesFeedBackReport_POM extends BaseClass{

//testNavigateToAnwserVotingSmileyFacesReportFlow
	    public static By byHomeNavigationXpath                = By.xpath("(//span[@class='oj-button-icon oj-start navigator-icon oj-button-icon oj-start'])[1]");
	    public static By byNavigationButton                   = By.xpath("//oj-button[@id='navigationSetBtn']");
	    public static By byClickAnalyticsXpath                = By.xpath("//div[text()='Analytics']");
		public static By byClickReportsExplorerXpath          = By.xpath("//span[text()='Reports Explorer']");
		public static By byClickPublicReportsXpath            = By.xpath("//div[text()='Public Reports']");
		public static By byClickMACUCUSTOMREPORTSXpath        = By.xpath("//div[text()='MACU CUSTOM REPORTS']");
		public static By byClickSoftCloudsXpath               = By.xpath("//div[text()='SoftClouds']");
		public static By byClickOKCSXpath                     = By.xpath("//div[text()='OKCS']");

//testSelectingandVerifyingFlow		
		//public static By byScrollTUserSpecificSearchXpath     = By.xpath("//span[text()='User Specific Search']");
		public static By byScrollTUserSpecificSearchXpath     = By.xpath("//span[text()='Smiley Faces Feedback']");
		
		public static By byClickSearchXpath                   = By.xpath("(//span[text()='Search'])[2]");
		public static By byClickCloseActionCenterXpath        = By.xpath("//div[@id='landingPanel-notifications']//button[@class='oj-button oj-button-half-chrome mobile-close-icon mobile-close-button closeFoldout']//label[text()='Close Action Center']");
		public static By byClickTopLevel                      = By.xpath("(//div[@class='breadcrumbContainer']//ul//li//a)[1]");		
		public static By byThambsUpandDown                    = By.xpath("(//div[@class='primary-tab-header']//ul//li)[2]//span//a//i");
		public static By byThumbsDownXpath                    = By.xpath("//span[text()='Thumbs Down Feedback Admin']");
		
		public static By byReportingCloseXpath                = By.xpath("//a[@class='closeButton']");
// Sign Out, close Browser
		public static By byClickUserProfileXpath              = By.xpath("//body//oj-avatar[@initials='[[userMenuLabel]]']");
		public static By byClickUserProfileSignOutXpath       = By.xpath("//a//span[text()='Sign Out']");
		
		
		
	}
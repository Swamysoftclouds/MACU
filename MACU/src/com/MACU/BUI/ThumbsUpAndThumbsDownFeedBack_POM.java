package com.MACU.BUI;

import org.openqa.selenium.By;

import com.MACU.framework.BaseClass;

public class ThumbsUpAndThumbsDownFeedBack_POM extends BaseClass{

	
//MACU_BUI
	
// testThumbsUpAndThumbsDownFeedbackFlow
	    public static By byNavigationButtonID                 = By.xpath("//oj-button[@id='navigationSetBtn']");
		public static By byClickHomeButtonXpath               = By.xpath("(//div[text()='Home']//a)");
		//public static By byClickAnalyticsXpath                = By.xpath("(//div[text()='Analytics']//a)");
		public static By byClickAnalyticsXpath                = By.xpath("//div[text()='Analytics']");
		public static By byClickReportsExplorerXpath          = By.xpath("//span[text()='Reports Explorer']");
		public static By byClickPublicReportsXpath            = By.xpath("//div[text()='Public Reports']");
		public static By byClickMACUCUSTOMREPORTSXpath        = By.xpath("//div[text()='MACU CUSTOM REPORTS']");
		public static By byClickSoftCloudsXpath               = By.xpath("//div[text()='SoftClouds']");
		public static By byClickOKCSXpath                     = By.xpath("//div[text()='OKCS']");
		
/// testSelectingandVerifyingFlow		
		public static By byClickTopLevel                      = By.xpath("(//div[@class='breadcrumbContainer']//ul//li//a)[1]");
		public static By byScrollTUserSpecificSearchXpath     = By.xpath("//span[text()='User Specific Search']");
		public static By byThumbsUpandThumbsDownXpath         = By.xpath("//span[text()='ThumbsUp and ThumbsDown Feedback']");
		
		public static By byClickSearchXpath                   = By.xpath("(//span[text()='Search'])[2]");		
		public static By byThambsUpandDown                    = By.xpath("(//div[@class='primary-tab-header']//ul//li)[2]//span//a//i");
		public static By byReportingCloseXpath                = By.xpath("//a[@class='closeButton']");
// Sign Out, close Browser
		public static By byClickUserProfileXpath              = By.xpath("//body//oj-avatar[@initials='[[userMenuLabel]]']");
		public static By byClickUserProfileSignOutXpath       = By.xpath("//a//span[text()='Sign Out']");
		
		
	}
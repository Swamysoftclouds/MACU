package com.MACU.BUI;

import org.openqa.selenium.By;

import com.MACU.framework.BaseClass;

public class ActionsDashboardReport_POM extends BaseClass{
	
// testOKCSReports	
	public static By byNavigationButton                     	= By.id("navigationSetBtn");
	public static By byAnalytics								= By.xpath("//div[@automationid='Analytics']");
	public static By byAnalyticsReports							= By.xpath("//div[@automationid='Analytics_Reports Explorer']//span[text()='Reports Explorer']");
	public static By byPubicReports								= By.xpath("//div[@aria-label='Public Reports'][text()='Public Reports']");
	public static By byMACUCustomReports						= By.xpath("//div[@aria-label='MACU CUSTOM REPORTS'][text()='MACU CUSTOM REPORTS']");
	public static By bySoftCloudsReports						= By.xpath("//div[@aria-label='SoftClouds'][text()='SoftClouds']");
	public static By byOKCSReports								= By.xpath("//div[@aria-label='OKCS'][text()='OKCS'][contains(@id,'ExplorerFolderLabelAnalyticsFolder103223')]");

// testVisitorActionsDashboard
	public static By byVisitorActionsReport                     = By.xpath("//span[text()='ThumbsUp and ThumbsDown Feedback']");
	public static By byRequestChangeStatusChartReport           = By.xpath("//span[text()='Request Change Status Chart']");
	//public static By byVisitorActionsReport			  			= By.xpath("//span[contains(@title,'Visitor Actions')][contains(text(),'Visitor Actions')]");
	public static By byAllFiltersButton							= By.xpath("//span[text()='All Filters']");
	public static By bySearchClickStreamEmail					= By.xpath("//oj-input-text[@automationid='Email']//input");
	public static By bySearchButton								= By.xpath("//div[contains(@class,'filterRegionMargin')]//button//span[text()='Search']");
	public static By byClickStreamSearchResult					= By.xpath("//span[contains(@title,'Full Name')]");
	public static By byActionsDashBoard                         = By.xpath("(//div[@class='primary-tab-header']//ul//li)[2]//span//a//i");
	public static By byReportingCloseXpath                      = By.xpath("//a[@class='closeButton']");
// Sign Out, close Browser
	public static By byClickUserProfileXpath                    = By.xpath("//body//oj-avatar[@initials='[[userMenuLabel]]']");
	public static By byClickUserProfileSignOutXpath             = By.xpath("//a//span[text()='Sign Out']");

}

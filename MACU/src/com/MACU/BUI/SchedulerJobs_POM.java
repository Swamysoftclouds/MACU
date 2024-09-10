package com.MACU.BUI;

import org.openqa.selenium.By;

import com.MACU.framework.BaseClass;

public class SchedulerJobs_POM extends BaseClass{
	
// testSchedulingReports
	public static By byNavigationButton                     	= By.id("navigationSetBtn");
	public static By byAnalytics								= By.xpath("//div[@automationid='Analytics']");
	public static By byClickAnalyticsXpath                      = By.xpath("//div[text()='Analytics']");
	public static By byAnalyticsReports							= By.xpath("//div[@automationid='Analytics_Reports Explorer']//span[text()='Reports Explorer']");
	public static By byPubicReports								= By.xpath("//div[@aria-label='Public Reports'][text()='Public Reports']");
	public static By byMACUCustomReports						= By.xpath("//div[@aria-label='MACU CUSTOM REPORTS'][text()='MACU CUSTOM REPORTS']");
	public static By bySoftCloudsReports						= By.xpath("//div[@aria-label='SoftClouds'][text()='SoftClouds']");
	public static By bySchedulingReports						= By.xpath("//div[@aria-label='Scheduling'][text()='Scheduling']");
	public static By byBrowseScheduleReports					= By.xpath("//div[contains(@class,'reportContainer')]//span[text()='Browse Schedule Report']");
	public static By byReportingCloseXpath                      = By.xpath("(//a[@class='closeButton'])[1]");
	// Sign Out, close Browser
	public static By byClickUserProfileXpath              = By.xpath("//body//oj-avatar[@initials='[[userMenuLabel]]']");
    public static By byClickUserProfileSignOutXpath       = By.xpath("//a//span[text()='Sign Out']");


}

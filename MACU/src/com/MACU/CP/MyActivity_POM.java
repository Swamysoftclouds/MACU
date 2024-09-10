package com.MACU.CP;

import org.openqa.selenium.By;

import com.MACU.framework.BaseClass;

public class MyActivity_POM extends BaseClass{

	public static By byQuickNavMenuButton					= By.xpath("//div[@class='dropdown']");
	public static By byMyActivityButton						= By.xpath("//a[text()='My Activity']");
	public static By bySearchArticleTextBox					= By.xpath("//input[@type='search']");
	public static By bySearchedArticleResult				= By.xpath("//ul[@aria-label='Suggested Search']/li[normalize-space()='"+byArticle+"']");
//	public static By bySelectSearchArticleResult			= By.xpath("//ul[@aria-label='Suggested Search']//li[normalize-space()='"+byArticle+"']//span[text()='"+byArticle+"']");
	public static By byBrowseAllPages						= By.xpath("//a[text()='browse all PAGES']");
	public static By bybrowseAllPages						= By.xpath("//a[text()='browse all PAGES']");
	
	public static By byRequestsUpdatesComments				= By.xpath("//button[@class='rn_RecommendContentButton p-0']");
	public static By byHelpUsImprove						= By.id("rn_RequestUpdate_9_Description");
	public static By byHelpUsImproveSubmit					= By.xpath("//button[text()='Submit']");
	//public static By byHelpUsImproveSubmit					= By.xpath("//button[text()='Submit']");
	//public static By byHelpUsImproveClosePopUp				= By.xpath("//button[@class='yui3-button yui3-button-close']");
	public static By byHelpUsImproveSubmitClosePopUp		= By.xpath("//div[@id='rnDialog2']//button[@type='button']");
	public static By byHomePage								= By.className("knowledge");
}

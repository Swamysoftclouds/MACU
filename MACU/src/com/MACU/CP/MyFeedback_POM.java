package com.MACU.CP;

import org.openqa.selenium.By;

import com.MACU.framework.BaseClass;

public class MyFeedback_POM extends BaseClass{
	
//Global
	public static By byHomePage								= By.className("knowledge");
	
//testJumpToSection
	public static By bySearchArticleTextBox					= By.xpath("//input[@type='search']");
	public static By bySearchedArticleResult				= By.xpath("//ul[@aria-label='Suggested Search']//li[normalize-space()='"+byArticle+"']");
	public static By bySelectSearchedArticle				= By.xpath("//div[@class='rn_SearchResultContent']//a[text()='"+byArticle+"']");
	public static By byJumpToSection						= By.xpath("//div[@class='rn_SchemaAttributeValue']//h5[text()='JUMP TO']");
	public static By byJumpToArticle						= By.xpath("(//div[@class='rn_SchemaAttributeValue']//a)[1]");
	public static By byJumpToSelectedArticle				= By.xpath("//div[@class='rn_AnswerDetail rn_AnswerHeader']//h1");							
	
//testFeedbackPage	
	public static By bythumbsUp								= By.xpath("//div[@class='main_image_div']//div[@class='thumbs_up_down'][1]");
	public static By bythumbsDown							= By.xpath("//div[@class='main_image_div']//div[@class='thumbs_up_down'][2]");
	public static By byRelatedPages							= By.id("relatedPages_headingOne");
	public static By bySearchPageLevel						= By.id("rn_SearchHome_17_SearchInput");
	public static By bySelectSearchPageLevel				= By.xpath("//ul[@aria-label='Suggested Search']//li[@class='rn_SuggestionItem'][normalize-space()='"+byArticle+"']");
	public static By byRequestsUpdatesComments				= By.xpath("//button[@class='rn_RecommendContentButton p-0']");
	public static By byHelpUsImprove						= By.id("rn_RequestUpdate_25_Description");
	public static By byHelpUsImproveSescription     		= By.id("rn_RequestUpdate_25_Description");
	public static By byHelpUsImproveSubmit					= By.xpath("//button[text()='Submit']");
	public static By byHelpUsImproveClosePopUp				= By.xpath("//button[@class='yui3-button yui3-button-close']");
	public static By byHelpUsImproveSubmitClosePopUp		= By.xpath("//div[@id='rnDialog2']//button[@type='button']");
		
//testMyFeedbackStatus	
	public static By byQuickNavMenuButton					= By.xpath("//div[@class='dropdown']");
	public static By byMyFeedbackButton						= By.xpath("//a[text()='My Feedback']");
	public static By bySearchFeedbackTextBox				= By.xpath("//input[@placeholder='Search Your Feedback Report']");
	public static By bySearchIcon							= By.xpath("//div[@class='rn_SearchInput1 mt-3']//span[@class='btn-srch-icon']//i[@class='fa fa-search']");		
	public static By byFeedbackResult						= By.xpath("//tr[@class='yui3-datatable-even']//td[@headers='Grid_6_c1']/a");
	public static By byFeedbackStatus						= By.xpath("//td[normalize-space()='UNRESOLVED']");
	public static By byFeedbackArticle						= By.xpath("//div[@id='rn_PageContent']//h2[text()]");
	public static By byFeedbackArticleStatus				= By.xpath("//li//div[normalize-space()='Unresolved']");
	public static By byFeedbackStatus1					    = By.xpath("//td[normalize-space()='UNRESOLVED']");
	public static By bythumbDownGetCreatedDateAndTime  		= By.xpath("//li//div[@id='rn_FieldDisplay_9']//div");
	public static By bythumbDownCreatedDateAndTime  		= By.xpath("//li//div[@id='rn_FieldDisplay_9']");

}

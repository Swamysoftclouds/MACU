package com.MACU.BUI;

import org.openqa.selenium.By;

import com.MACU.framework.BaseClass;



public class AnswerVotingFeedBackReport_POM extends BaseClass{
	
//Global
	public static By byHomePage								= By.className("knowledge");
	
//testJumpToSection
	public static By bySearchArticleTextBox					= By.xpath("//input[@type='search']");
	//public static By bySearchedArticleResult				= By.xpath("//ul[@aria-label='Suggested Search']//li[normalize-space()='Flexible Work']");
	//public static By bySelectSearchedArticle				= By.xpath("//div[@class='rn_SearchResultContent']//a[text()='Flexible Work']");
	public static By byJumpToSection						= By.xpath("//h5[text()='JUMP TO']");
	public static By byJumpToArticle						= By.xpath("//div[@class='rn_SchemaAttributeValue']//a[text()='Travel Pay']");
	public static By byJumpToSelectedArticle				= By.xpath("//div[@class='rn_AnswerDetail rn_AnswerHeader']//h1[contains(text(),'Travel Pay')]");							
	//public static By bySearchedArticleResult				= By.xpath("//ul[@aria-label='Suggested Search']//li[normalize-space()= '"+byArticle+"' ]");
	public static By bySearchedArticleResult				= By.xpath("(//div[@class='yui3-aclist-content']//li//li)[1]");
	//public static By bySearchedArticleResult				= By.xpath("//i[@class='fas fa-search search_icon']");
	
	//public static By bySelectSearchedArticle				= By.xpath("//div[@class='rn_SearchResultContent']//a[text()='"+byArticle+"']");
	public static By bySelectSearchedArticle				= By.xpath("(//div[@class='rn_SearchResultContent']//a)[1]");
	
//testFeedbackPage	
	public static By bySearchfield							= By.xpath("//div[@class='rn_SearchInput']//input[@type='search']");
	public static By bythumbsUp								= By.xpath("//div[@class='main_image_div']//div[@class='thumbs_up_down'][1]");
	public static By bythumbsDown							= By.xpath("//div[@class='main_image_div']//div[@class='thumbs_up_down'][2]");
	public static By bythumbsDownComments					= By.xpath("//textarea[@class='rn_DocumentTextArea']");
	public static By byscrollDownThumbComments 				= By.xpath("//button[@class='rn_RecommendContentButton p-0']");
	public static By bythumbsDownCommentsSubmit  			= By.xpath("//button[text()='SUBMIT']");
	public static By bythumbsDownCommentsClosePopUp			= By.xpath("//button[@class='yui3-button yui3-button-close']");
	public static By byRelatedPages							= By.id("relatedPages_headingOne");
	public static By bySearchPageLevel						= By.id("rn_SearchHome_18_SearchInput");
	public static By bySelectSearchPageLevel				= By.xpath("//ul[@aria-label='Suggested Search']//li[@class='rn_SuggestionItem'][normalize-space()='Flexible Work']");
	public static By byRequestsUpdatesComments				= By.xpath("//button[@class='rn_RecommendContentButton p-0']");
	public static By byHelpUsImprove						= By.id("rn_RequestUpdate_25_Description");
	public static By byHelpUsImproveSubmit					= By.xpath("//button[text()='Submit']");
	public static By byHelpUsImproveClosePopUp				= By.xpath("//button[@class='yui3-button yui3-button-close']");
	public static By byHelpUsImproveSubmitClosePopUp		= By.xpath("//div[@id='rnDialog2']//button[@type='button']");
		
//testMyFeedbackStatus	
	public static By byQuickNavMenuButton					= By.xpath("//div[@class='dropdown']");
	public static By byMyFeedbackButton						= By.xpath("//a[text()='My Feedback']");
	public static By bySearchFeedbackTextBox				= By.xpath("//input[@placeholder='Search Your Feedback Report']");
	public static By bySearchIcon							= By.xpath("//div[@class='rn_SearchInput1 mt-3']//span[@class='btn-srch-icon']//i[@class='fa fa-search']");		
	public static By byFeedbackResult						= By.xpath("//tr[@data-yui3-record='model_11']//td[@headers='Grid_6_c1']/a");
	public static By byFeedbackThumbDownResult				= By.xpath("((//table//tbody)[2]//a)[1]");
	public static By byFeedbackStatuscp						= By.xpath("//td[normalize-space()='UNRESOLVED']");
	public static By byFeedbackArticle						= By.xpath("//div[@id='rn_PageContent']//h2[text()]");
	public static By byFeedbackArticleStatus				= By.xpath("//li//div[normalize-space()='Unresolved']");
	public static By bythumbDownCreatedDateAndTime  		= By.xpath("//li//div[@id='rn_FieldDisplay_9']");
	public static By bythumbDownGetCreatedDateAndTime  		= By.xpath("//li//div[@id='rn_FieldDisplay_9']//div");
	

//----------------------
	
//MACU_BUI
		public static By byHomeNavigationXpath                = By.xpath("(//span[@class='oj-button-icon oj-start navigator-icon oj-button-icon oj-start'])[1]");
		public static By byNavigationButton                   = By.id("navigationSetBtn");
		public static By byClickCloseActionCenterXpath        = By.xpath("//div[@id='landingPanel-notifications']//button[@class='oj-button oj-button-half-chrome mobile-close-icon mobile-close-button closeFoldout']//label[text()='Close Action Center']");
		public static By byClickAnalyticsXpath                = By.xpath("//div[text()='Analytics']");
		public static By byClickReportsExplorerXpath          = By.xpath("//span[text()='Reports Explorer']");
		public static By byClickPublicReportsXpath            = By.xpath("//div[text()='Public Reports']");
		public static By byClickMACUCUSTOMREPORTSXpath        = By.xpath("//div[text()='MACU CUSTOM REPORTS']");
		public static By byClickSoftCloudsXpath               = By.xpath("//div[text()='SoftClouds']");
		public static By byClickOKCSXpath                     = By.xpath("//div[text()='OKCS']");
		public static By byClickArchivedXpath                 = By.xpath("//div[text()='Archived Reports']");
		public static By byClickFeedbackAdminReportXpath      = By.xpath("//span[text()='Feedback Admin Report']");
		public static By byClickAnswerVotingFeedbackXpath     = By.xpath("//span[text()='Answer Voting Feedback']");
		public static By byClickSmileyFacesFeedbackXpath      = By.xpath("//span[text()='Smiley Faces Feedback']");
		public static By byClickSelectanitemXpath             = By.xpath("(//div[text()='Select an item'])[1]");
		public static By byClickSelectXpath                   = By.xpath("(//div[@id='tabContent']//div[@class='container wsx-flex']//div[@class='tab-panel wsx-flex']//div[@class='superContainer']//div[@class='allFiltersModule allFiltersExpanded']//div[@class='oj-collapsible-wrapper']//div[@class='filterRegionMargin oj-flex-item ie-filter-flex-item']//span[@class='runTimeFilter']//div//div[@class='displayFilter']//div[@class='menu-container']//div[@class='resize-sensor'])[3]");
		public static By byClickcloseButtonXpath              = By.xpath("(//div[@class='primary-tab-header']//li)[2]//a[@class='closeButton']");	
		public static By byAnswerIDXpath                      = By.xpath("//input[@automationid='Answer ID']");
		public static By bySelectItemXpath                    = By.xpath("(//div[@class='select-box-arrow select-box-arrow-cursor'])[3]");
		public static By bySelectItemUnresolvedXpath          = By.xpath("//div[@title='Unresolved']");
		public static By bySelectDateTimeXpath                = By.xpath("(//span[@title='Select Date Time.'])[1]");
		public static By byClickSearchXpath                   = By.xpath("(//span[text()='Search'])[3]");
		public static By byClickMessageXpath                  = By.xpath("//span[text()='Messages']");
		public static By byClickReplayFeedBackXpath           = By.xpath("//div[contains(@class,'cke_wysiwyg_div')]");
		public static By byClickSummaryXpath                  = By.xpath("//span[text()='Summary']");
		
		public static By byClickSendButtonXpath               = By.xpath("//button[@title='Send an incident response and save the incident']");
		public static By byClickStatusXpath                   = By.xpath("((//div[text()='Status'])[2]/following::*)[1]");
		
		public static By byStatusValueXpath                   = By.xpath("(//div[@class='display-text'])[4]");
		
		public static By byClickSearchbuttonXpath             = By.xpath("//div[@class='ws-toolbar-button-image bui-icon fa-filter']");
		public static By byClickSatusbuttonXpath              = By.xpath("(//div[text()='Status']/following::*)[1]");
		public static By byClickSearchbutXpath                = By.xpath("(//span[text()='Search'])[2]");
		public static By byCloseAnswerXpath                   = By.xpath("(//a[@class='closeButton'])[2]");
		public static By byCloseReportXpath                   = By.xpath("(//a[@class='closeButton'])[1]");
		public static By byClickSendAndCloseButtonXpath       = By.xpath("//button[@data-commandtype='SaveAndSendAndClose']");
		public static By byClickYesButtonXpath                = By.xpath("//span[text()='Yes']");
		public static By byClickRefreshXpath                  = By.xpath("//div[contains(@class,'refresh-icon')]");
		public static By byClickSearchButtonAgainXpath        = By.xpath("//button[contains(@title,'Define the search')]");
		public static By bySelectItemSolvedXpath              = By.xpath("//div[@title='Solved']");
		public static By byFeedbackReport							= By.xpath("//div[@class='explorer-right-panel']//div[@class='explorer-data-grid']//span[text()='Feedback Admin Report (old)']");
		public static By bySelectanItemDropdown						= By.xpath("//div[@class='container wsx-flex']//div[@class='analyticsTopSection']//div[@class='select-box-root select-box-display-text-active']");
		public static By bySelectOptionfromDropdown					= By.xpath("//ul[@class='select-box-list']//div[@title='Unresolved']");
		
		public static By bySendDate									= By.xpath("//input[@aria-label='From']");
		public static By byFeedbackReportSearchButton				= By.xpath("//div[contains(@class,'filterRegionMargin')]//span[@class='oj-button-text'][text()='Search']");
		public static By byFeedbackReportSearch1Button				= By.xpath("(//span[text()='Search'])[2]");
		public static By byFeedbackSearchResult						= By.xpath("//div[@class='container wsx-flex']//div[contains(@column-id,'2')][1]");
		public static By bySubjectText								= By.xpath("//div[@class='textbox analyticsInlineEdit']/oj-input-text[@automationid='Incident.Subject']//input");
		public static By byMessageText								= By.xpath("//span[text()='Messages']");
		public static By byReplayText								= By.xpath("//div[contains(@class,'cke_wysiwyg_div ')]");
		public static By bySaveText  								= By.xpath("//div[@class='ws-toolbar-button-image bui-icon save-icon fa-lg']");
		public static By bySummaryOption     						= By.xpath("//span[text()='Summary']");

		
		//public static By byFeedbackStatus							= By.xpath("(//td[normalize-space()='UNRESOLVED'])[1]");									
		public static By byFeedbackStatus							= By.xpath("(//div[text()='Waiting'])[2]");	
		
		public static By bySelectFeedbackOption						= By.xpath("//div[@id='all-div-Incident_Status_Id390']//div[@title='Solved']");
		public static By bySaveButton								= By.xpath("//button[@class='ws-toolbar-button Save']");
		public static By byClickStatusSelectSolvedXpath             = By.xpath("(//div[@title='Solved'])[1]");
		//public static By byClickStatusSelectSolvedXpath             = By.xpath("(//div[@title='Solved'])[1]");
		public static By byClickSaveButtonXpath                     = By.xpath("//div[@class='ws-toolbar-button-image bui-icon save-icon fa-lg']");
		//public static By byClickSaveButtonXpath                     = By.xpath("//div[@class='ws-toolbar-button-image bui-icon save-icon fa-lg']");
		public static By byCloseIncidentXpath                       = By.xpath("(//a[@class='closeButton'])[3]");
		//public static By byCloseIncidentXpath                       = By.xpath("(//a[@class='closeButton'])[3]");
		public static By byAnswerVotingCloseXpath                   = By.xpath("(//a[@class='closeButton'])[2]");
		public static By byReportingCloseXpath                      = By.xpath("(//a[@class='closeButton'])[1]");
		
	//	public static By byAnswerVotingCloseXpath             = By.xpath("(//div[@class='primary-tab-header']//ul//li)[2]//span//a//i");
		//public static By byReportingCloseXpath                = By.xpath("(//div[@class='primary-tab-header']//ul//li)[1]//span//a//i");
		
		
// Sign Out, close Browser
		public static By byClickUserProfileXpath              = By.xpath("//body//oj-avatar[@initials='[[userMenuLabel]]']");
		public static By byClickUserProfileSignOutXpath       = By.xpath("//a//span[text()='Sign Out']");
		
}

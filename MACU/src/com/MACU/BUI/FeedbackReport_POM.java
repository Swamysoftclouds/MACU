package com.MACU.BUI;

import org.openqa.selenium.By;

import com.MACU.framework.BaseClass;

public class FeedbackReport_POM extends BaseClass{
	
// testSelectOKCSReport
	    public static By byNavigationButton                   = By.xpath("//oj-button[@id='navigationSetBtn']");
	 	public static By byAnalytics								= By.xpath("//div[@id='displayNavigationSet']//div[@automationid='Analytics']");
		public static By byAnalyticsReports							= By.xpath("//div[@automationid='Analytics_Reports Explorer']//span[text()='Reports Explorer']");
		public static By byPubicReports								= By.xpath("//div[@aria-label='Public Reports'][text()='Public Reports']");
		public static By byMACUCustomReports						= By.xpath("//div[@aria-label='MACU CUSTOM REPORTS'][text()='MACU CUSTOM REPORTS']");
		public static By bySoftCloudsReports						= By.xpath("//div[@aria-label='SoftClouds'][text()='SoftClouds']");
		public static By byClickOKCS								= By.xpath("//div[contains(@id,'ExplorerFolderAnalyticsFolder103223')]//div[@aria-label='OKCS'][text()='OKCS']");
		public static By byClickAnalyticsXpath                      = By.xpath("//div[text()='Analytics']");
		public static By byClickReportsExplorerXpath                = By.xpath("//span[text()='Reports Explorer']");
		public static By byClickPublicReportsXpath                  = By.xpath("//div[text()='Public Reports']");
		public static By byClickMACUCUSTOMREPORTSXpath              = By.xpath("//div[text()='MACU CUSTOM REPORTS']");
		public static By byClickSoftCloudsXpath                     = By.xpath("//div[text()='SoftClouds']");
		public static By byClickOKCSXpath                            = By.xpath("//div[text()='OKCS']");
		
// testFeedbackStatus		
//		public static By byFeedbackReport							= By.xpath("//div[@class='explorer-right-panel']//div[@class='explorer-data-grid']//span[text()='Feedback Admin Report']");
//		public static By bySelectanItemDropdown						= By.xpath("//div[@class='container wsx-flex']//div[@class='analyticsTopSection']//div[@class='select-box-root select-box-display-text-active']");
//		public static By bySelectOptionfromDropdown					= By.xpath("//ul[@class='select-box-list']//div[@title='Unresolved']");
//		public static By bySendDate									= By.xpath("//input[@aria-label='From']");
//		public static By byFeedbackReportSearchButton				= By.xpath("//div[contains(@class,'filterRegionMargin')]//span[@class='oj-button-text'][text()='Search']");
//		public static By byFeedbackReportSearch1Button				= By.xpath("//span[@id='_oj40|text']//span[text()='Search']");
//		public static By byFeedbackSearchResult						= By.xpath("//div[@class='container wsx-flex']//div[contains(@column-id,'2')][1]");
//		public static By bySubjectText								= By.xpath("//div[@class='textbox analyticsInlineEdit']/oj-input-text[@automationid='Incident.Subject']//input");
//		public static By byMessageText								= By.xpath("//span[text()='Messages']");
//		public static By byReplayText								= By.xpath("//div[contains(@class,'cke_wysiwyg_div ')]");
//		public static By bySaveText  								= By.xpath("//div[@class='ws-toolbar-button-image bui-icon save-icon fa-lg']");
//		public static By bySummaryOption     						= By.xpath("//span[text()='Summary']");
//
//		
//		public static By byFeedbackStatus							= By.xpath("//div[contains(@id,'Incident_Status')][@class='display-text']");									
//		public static By bySelectFeedbackOption						= By.xpath("//div[@id='all-div-Incident_Status_Id390']//div[@title='Solved']");
//		public static By bySaveButton								= By.xpath("//button[@class='ws-toolbar-button Save']");
//		public static By byClickStatusSelectSolvedXpath             = By.xpath("(//div[@title='Solved'])[1]");
//		public static By byClickSaveButtonXpath                     = By.xpath("//div[@class='ws-toolbar-button-image bui-icon save-icon fa-lg']");
//		public static By byCloseIncidentXpath                       = By.xpath("(//a[@class='closeButton'])[3]");
//		public static By byAnswerVotingCloseXpath                   = By.xpath("(//a[@class='closeButton'])[2]");
//		public static By byReportingCloseXpath                      = By.xpath("(//a[@class='closeButton'])[1]");
//		
//		
//		public static By byFeedbackReport							= By.xpath("//div[@class='explorer-right-panel']//div[@class='explorer-data-grid']//span[text()='Feedback Admin Report']");
//		public static By bySelectanItemDropdown						= By.xpath("//div[@class='container wsx-flex']//div[@class='analyticsTopSection']//div[@class='select-box-root select-box-display-text-active']");
//		public static By bySelectOptionfromDropdown					= By.xpath("//ul[@class='select-box-list']//div[@title='Unresolved']");
//		public static By bySendDate									= By.xpath("//input[@aria-label='From']");
//		public static By byFeedbackReportSearchButton				= By.xpath("//div[contains(@class,'filterRegionMargin')]//span[@class='oj-button-text'][text()='Search']");
		//public static By byFeedbackReportSearch1Button				= By.xpath("//span[@id='_oj40|text']//span[text()='Search']");
		//public static By byFeedbackSearchResult						= By.xpath("//div[@class='container wsx-flex']//div[contains(@column-id,'2')][1]");
		//public static By bySubjectText								= By.xpath("//div[@class='textbox analyticsInlineEdit']/oj-input-text[@automationid='Incident.Subject']//input");
		//public static By byMessageText								= By.xpath("//span[text()='Messages']");
		//public static By byReplayText								= By.xpath("//div[contains(@class,'cke_wysiwyg_div ')]");
		//public static By bySaveText  								= By.xpath("//div[@class='ws-toolbar-button-image bui-icon save-icon fa-lg']");
		//public static By bySummaryOption     						= By.xpath("//span[text()='Summary']");
		public static By byFeedbackReport							= By.xpath("//div[@class='explorer-right-panel']//div[@class='explorer-data-grid']//span[text()='Feedback Admin Report']");
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

		
		public static By byFeedbackStatus							= By.xpath("//div[contains(@id,'Incident_Status')][@class='display-text']");									
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
		
		// Sign Out, close Browser
				public static By byClickUserProfileXpath              = By.xpath("//body//oj-avatar[@initials='[[userMenuLabel]]']");
				public static By byClickUserProfileSignOutXpath       = By.xpath("//a//span[text()='Sign Out']");
}

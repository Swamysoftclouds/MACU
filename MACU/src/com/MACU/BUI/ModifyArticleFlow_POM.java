package com.MACU.BUI;

import org.openqa.selenium.By;

import com.MACU.framework.BaseClass;

public class ModifyArticleFlow_POM extends BaseClass{
	

	//MACU_BUI
	    public static By byNavigationButton                   = By.id("navigationSetBtn");
		public static By byClickHomeButtonXpath               = By.xpath("(//div[text()='Home']//a)");
		public static By byClickContentButtonXpath            = By.xpath("(//div[@class='navigation-item']//span[text()='Contacts'])[1]");
		public static By byEnterUserNameXpath                 = By.xpath("//input[@automationid='Name']");
		public static By byEnterUserEmailIDXpath              = By.xpath("//input[@automationid='All Email Addresses']");
		public static By byClickSearchButtonXpath             = By.xpath("//span[text()='Search']");
		public static By byClickSearchResultXpath             = By.xpath("//span[text()='User']");	
		public static By byClickSummaryButtonXpath            = By.xpath("//span[text()='Summary']");
		public static By byClickAddButtonXpath                = By.xpath("//span[text()='Add']");
		public static By byClickEditButtonXpath               = By.xpath("//span[text()='Edit']");
		public static By bySelectExistingRolepath             = By.xpath("//div[@id='SlaViewerViewModel']//div[@class='oj-dialog-content oj-dialog-default-content']//div[@class='sla-viewer']//div[@class='oj-flex-bar']//table[@automationid='slaInstances']//tbody//tr");
		public static By byClickByPassWorkFlowXpath           = By.xpath("//a[text()='Bypass Workflow/Publish']");
		public static By byClickAppClickHereXpath             = By.xpath("//a[text()='Click here']");
		public static By byClickCongurationButtonXpath        = By.xpath("(//div[text()='Configuration']//a)");
		public static By byConfigurationXpath				  = By.xpath("//div[@automationid='Configuration']");
		public static By byClickServiceButtonXpath            = By.xpath("//div[text()='Service']");
		public static By byClickKnowledgeAdvancedButtonXpath  = By.xpath("//div[text()='Knowledge Advanced']");
		public static By byClickAuthoringButtonXpath          = By.xpath("//span[text()='Authoring']");
		public static By byClickMainTasksButtonXpath          = By.xpath("//div[@id='rntab']//ul//li[@testidentifier='MainNavBar_Tasks']//a");
		public static By byClickMainContentButtonXpath        = By.xpath("//div[@id='rntab']//ul//li[@testidentifier='MainNavBar_Content']//a");
		public static By byClickAddArticleButtonXpath         = By.xpath("//div[text()='Process']//following-sibling::a[@testidentifier='ContentNavBar_Add_Process']");
		public static By byEnterTitleNameFieldXpath           = By.xpath("//input[@testidentifier='Content_ContentType_Add_SUMMARY']");
		public static By byEnterKeyWordNameFieldXpath         = By.xpath("//input[@testidentifier='Content_ContentType_Add_KEYWORD']");
		public static By byScrollPublishingOptionsXpath       = By.xpath("//span[text()='Display On']");
		public static By bySaveDocumentXpath                  = By.xpath("//a[text()='Save Document']");
		public static By byClickListArticleButtonXpath        = By.xpath("//div[text()='Process']//following-sibling::a[@testidentifier='ContentNavBar_List_Process']");
		public static By byClickAllDocumentsXpath             = By.xpath("//select[@testidentifier='ContentSearchResults_DocumentClassPulldown']");
		public static By bySelectAllDocumentsXpath            = By.xpath("//select[@testidentifier='ContentSearchResults_DocumentClassPulldown']//option[text()='All Documents']");
		public static By bySelectArticleXpath                 = By.xpath("(//a[text()='TestingArticle'])[1]");
		public static By byClickEditDocumentXpath             = By.xpath("//a[text()='Edit Document']");
		public static By byClickEditReasonXpath               = By.xpath("//textarea[@class='editfields']");
		public static By byClickSaveandContinueEditingXpath   = By.xpath("//a[text()='Save and Continue Editing']");
		public static By byGettheTitleXpath                   = By.xpath("(//div[@class='imcontentcomponent']//table//div//div//div[@class='leftHardAlignment']//span)[1]");
		public static By byGettheDocumentIDXpath              = By.xpath("(//div[@class='sbmodule']//div[@class='sbmodulebody']//td//span[text()='Answer ID']/following::span)[1]");
		public static By byHomePage							  = By.className("knowledge");
	    public static By byEditedTileTitle               	  = By.xpath("//h1[@id='rn_Summary']");
	    public static By byClickDoneButtonXpath               = By.xpath("(//a[text()='Done'])[1]");
	    public static By byReportingCloseXpath                = By.xpath("//a[@class='closeButton']");
// Sign Out, close Browser
	    public static By byClickUserProfileXpath              = By.xpath("//body//oj-avatar[@initials='[[userMenuLabel]]']");
		public static By byClickUserProfileSignOutXpath       = By.xpath("//a//span[text()='Sign Out']");
	}
